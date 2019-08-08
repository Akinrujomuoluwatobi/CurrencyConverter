package com.royalteck.progtobi.currencyconverter.networkCalls;

import com.royalteck.progtobi.currencyconverter.Model.CurrenciesModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("latest?")
    Call<CurrenciesModel> getCurrenciesValues(
            @Query("access_key") String key
    );

}
