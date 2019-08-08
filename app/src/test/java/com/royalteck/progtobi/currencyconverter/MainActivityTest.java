package com.royalteck.progtobi.currencyconverter;

import android.content.Context;
import android.util.Log;

import androidx.room.Room;
import androidx.sqlite.db.SimpleSQLiteQuery;

import com.royalteck.progtobi.currencyconverter.LocalDB.AppDatabase;
import com.royalteck.progtobi.currencyconverter.Model.CurrenciesModel;
import com.royalteck.progtobi.currencyconverter.networkCalls.ApiClient;
import com.royalteck.progtobi.currencyconverter.networkCalls.ApiService;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static org.junit.Assert.*;

public class MainActivityTest {

    public static AppDatabase mDatabase;
    public static Context mContext;
    private Double insertedVal;

    @BeforeClass
    public static void setDatabase(){
        mDatabase =  AppDatabase.getAppDatabase(mContext);
    }

    @Test
    public void insertToDatabase() {
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
                    insertedVal = response.body().getRates().getAED();
                    mDatabase.ratesDao().insertAll(response.body().getRates());

                } else {


                }

            }

            @Override
            public void onFailure(Call<CurrenciesModel> call, Throwable t) {

            }
        });

        String currencySel = "AED";
        String queryString = "SELECT " + currencySel + " FROM rates";
        SimpleSQLiteQuery query = new SimpleSQLiteQuery(queryString);
        List<Double> mRate = mDatabase.ratesDao().findColumn(query);
        Double lastValue = mRate.get(mRate.size()-1);

        assertEquals(insertedVal, lastValue);
    }

    @Test
    public void receiveValueEvent() {
    }
}