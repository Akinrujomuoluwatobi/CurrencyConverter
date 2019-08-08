package com.royalteck.progtobi.currencyconverter.LocalDB;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.royalteck.progtobi.currencyconverter.Model.Rates;

@Database(entities = {Rates.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE;

    /*private static final AppDatabase ourInstance = new AppDatabase();

    public static AppDatabase getInstance() {
        return ourInstance;
    }

    private AppDatabase() {
    }*/
    public static AppDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context,
                            AppDatabase.class, "currency_converter_db").build();
        }
        return INSTANCE;
    }

    public abstract RatesDAO ratesDao();

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
