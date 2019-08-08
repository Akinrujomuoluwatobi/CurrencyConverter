package com.royalteck.progtobi.currencyconverter.Presenters;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;

import androidx.sqlite.db.SimpleSQLiteQuery;

import com.royalteck.progtobi.currencyconverter.LocalDB.AppDatabase;
import com.royalteck.progtobi.currencyconverter.Model.CurrenciesModel;
import com.royalteck.progtobi.currencyconverter.Model.Event;
import com.royalteck.progtobi.currencyconverter.Model.Rates;
import com.royalteck.progtobi.currencyconverter.networkCalls.ApiClient;
import com.royalteck.progtobi.currencyconverter.networkCalls.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityPresenter {
    public View mView;
    Context mContext;
    AppDatabase mDatabase;
    Event mEvent;

    //Constructor
    public MainActivityPresenter(View view, Context context, AppDatabase database) {
        mView = view;
        mContext = context;
        mDatabase = database;


    }

    //Get Currencies Method
    public void getCurrencies(String currencySel, String eurAmount) {
        //Check if the Device is Connected to a Network
        if (!isOnline(mContext)) {
            //If Not Connected Calculate Currency Equivalent from Stored Values in Database
            calculateCurrency(currencySel, eurAmount);
        } else {
            //If Connected, Fetch the Currencies and Values from the API Endpoint
            fetchCurrencyValues();
        }
    }

    //Fetch Currency Values for API Endpoint and Store in Database
    private void fetchCurrencyValues() {
        //CAll to RETROFIT API SERVICE Class Created in NetworkCall Package
        ApiService service = ApiClient.getClient().create(ApiService.class);
        Call<CurrenciesModel> callUser = service.getCurrenciesValues("898e93d4fcc95176dbba95897b3d2483");
        callUser.enqueue(new Callback<CurrenciesModel>() {
            @Override
            public void onResponse(Call<CurrenciesModel> call, Response<CurrenciesModel> response) {
                Log.d("Response", "onResponse: " + response.message());

                CurrenciesModel model = response.body();
                boolean status = response.body().getSuccess();
                Log.d("Response", "onResponse: " + status);
                if (status) {
                    mView.populateDB(response.body().getRates());
                } else {
                    mView.displayToast("Error Fetching Currency Values");

                }

            }

            @Override
            public void onFailure(Call<CurrenciesModel> call, Throwable t) {
                Log.d("Error", t.getMessage());
                mView.displayToast(t.getMessage());

            }
        });

    }

    //Calculate The Currency Equivalent
    public void calculateCurrency(String currencySel, String eurAmount) {
        String queryString = "SELECT " + currencySel + " FROM rates";
        SimpleSQLiteQuery query = new SimpleSQLiteQuery(queryString);
        new AsyncTask<Object, List<Double>, List<Double>>(){

            @Override
            protected List<Double> doInBackground(Object[] objects) {
                List<Double> mRate = mDatabase.ratesDao().findColumn(query);
                return mRate;
            }

            @Override
            protected void onPostExecute(List<Double> result) {
                if (result.size() == 0) {
                    mView.displayToast("Pls Connect to a Network to Fetch Currencies and Their Values ");
                } else {

                    Double equivalentCurr = result.get(result.size()-1) * Double.parseDouble(eurAmount);
                    mEvent = new Event(equivalentCurr, currencySel);
                    mView.DisplayCurrency(mEvent);
                }
            }
        }.execute();


    }

    //MEthod to Check if Connected to a Network
    private boolean isOnline(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activenet = connectivityManager.getActiveNetworkInfo();
        return activenet != null;
    }

    public interface View {

        void displayToast(String message);

        void populateDB(Rates rates);

        void DisplayCurrency(Event event);
    }
}
