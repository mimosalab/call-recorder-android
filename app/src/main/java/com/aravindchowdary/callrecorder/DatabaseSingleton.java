package com.aravindchowdary.callrecorder;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Aravind Chowdary on 01-07-2019.
 */

public class DatabaseSingleton {
    public static SQLiteDatabase database;

    public static SQLiteDatabase getInstance(Context activity){
        if(database==null)
            database = new DatabaseHandler(activity).getWritableDatabase();
        return database;
    }
}