package com.example.contact_manager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.Spannable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "contacts.db";
    private static final String TABLE_NAME = "contacts";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME +" (ID INTEFER PRIMARY KEY AUTOINCREMENT, NAME TEXT,MOBILE_NUMBER INTEGER,EMAIL TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
