package com.example.f3_1.tracklife;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by F3-1 on 09-Jun-17.
 */

public class DataBaseHelper  extends SQLiteOpenHelper {
//    private SQLiteDatabase writableDatabase;

    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


//    public SQLiteDatabase getWritableDatabase() {
//        return writableDatabase;
//    }

    @Override
    public void onCreate(SQLiteDatabase _db) {

        _db.execSQL(LoginDataBaseAdapter.DATABASE_CREATE);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String _oldVersion = null;
        String _newVersion = null;
        Log.w("TaskDBAdapter", "Upgrading from version " + _oldVersion + " to " + _newVersion + ", which will destroy all old data");

        // Upgrade the existing database to conform to the new version. Multiple
        // previous versions can be handled by comparing _oldVersion and _newVersion
        // values.
        // The simplest case is to drop the old table and create a new one.
        SQLiteDatabase _db = null;
        _db.execSQL("DROP TABLE IF EXISTS " + "TEMPLATE");
        // Create a new one.
        onCreate(_db);
    }


}