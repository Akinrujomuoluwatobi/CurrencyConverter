package com.royalteck.progtobi.currencyconverter.LocalDB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;

import com.royalteck.progtobi.currencyconverter.Model.Rates;

import java.util.List;

@Dao
public interface RatesDAO {

    @RawQuery()
    List<Double> findColumn(SupportSQLiteQuery query);

    @Insert
    void insertAll(Rates... rates);
}

