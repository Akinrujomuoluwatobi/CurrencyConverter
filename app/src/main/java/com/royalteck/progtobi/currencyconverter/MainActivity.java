package com.royalteck.progtobi.currencyconverter;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.sqlite.db.SimpleSQLiteQuery;

import com.royalteck.progtobi.currencyconverter.LocalDB.AppDatabase;
import com.royalteck.progtobi.currencyconverter.Model.Event;
import com.royalteck.progtobi.currencyconverter.Model.Rates;
import com.royalteck.progtobi.currencyconverter.Presenters.MainActivityPresenter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainActivityPresenter.View {
    private MainActivityPresenter mPresenter;
    private AppDatabase mDatabase;

    @BindView(R.id.toEditText)
    EditText toEditText;
    @BindView(R.id.fromEditText)
    EditText fromEditText;
    @BindView(R.id.toTxt)
    TextView toTxtView;
    @BindView(R.id.fromTxt)
    TextView fromTxtView;
    @BindView(R.id.toSpinner)
    Spinner toSpinner;
    @BindView(R.id.fromSpinner)
    Spinner fromSpinner;
    @BindView(R.id.pb)
    ProgressBar pb;
    @BindView(R.id.convertBtn)
    Button cvBtn;

    String currencySel;
    private Event mEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //Create and get Reference to the AppDatabase Class
        mDatabase = AppDatabase.getAppDatabase(MainActivity.this);
        mEvent = new Event(0.0, "");

        mPresenter = new MainActivityPresenter(this, this, mDatabase);
        fromSpinner.setEnabled(false);
        fromEditText.setText("1");
        ;
        toEditText.setEnabled(false);
        toSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                currencySel = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    //The Method is called when the convert button is selected using ButterKnife Annotation
    @OnClick(R.id.convertBtn)
    void convertCurrency(Button loginBtn) {
        loginBtn.setVisibility(View.INVISIBLE);
        pb.setVisibility(View.VISIBLE);

        //Make Reference to the getCurrencies Method in the Presenter
        mPresenter.getCurrencies(currencySel, fromEditText.getText().toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Overide Method from the Presenter to Display Toast messages
    @Override
    public void displayToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        pb.setVisibility(View.GONE);
        cvBtn.setVisibility(View.VISIBLE);
    }

    //Override Method from the Presenter to create and Event for Inserting Values Into the Database
    @Override
    public void populateDB(Rates rates) {
        //The Event Is Instantiated
        EventBus.getDefault().post(rates);

        //mDatabase.ratesDao().insertAll(rates);
        pb.setVisibility(View.GONE);
        cvBtn.setVisibility(View.VISIBLE);
    }

    //Override Method from the Presenter to Create and Event for Getting Values from the Database
    @Override
    public void DisplayCurrency(Event event) {
        EventBus.getDefault().post(event);
        pb.setVisibility(View.GONE);
        cvBtn.setVisibility(View.VISIBLE);
    }

    //The Method Receive the Event to Insert Into The Database in Background
    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void customEventReceived(Rates rates) {

        //Reference to DAO to Insert Values Into the Database
        mDatabase.ratesDao().insertAll(rates);
        mPresenter.calculateCurrency(currencySel, fromEditText.getText().toString());
    }

    //The Method Receive the Event To Fetch Value from Database and Display it into The Edit Text
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void receiveValueEvent(Event event) {
        toEditText.setText(event.getValue().toString());
        toTxtView.setText(event.getCountry());
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

}
