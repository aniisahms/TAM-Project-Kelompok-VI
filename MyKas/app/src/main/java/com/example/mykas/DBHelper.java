package com.example.mykas;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "MyKas.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("CREATE TABLE catatan_keuangan(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "judul VARCHAR(50) NOT NULL," +
                "tipe VARCHAR(20) NOT NULL," +
                "kategori VARCHAR(20) NOT NULL," +
                "nominal INTEGER NOT NULL)");

        // TANGGAL ??
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("DROP TABLE if exists catatan_keuangan");
    }

    // INSERT DATA
    public Boolean insertCatatanKeuangan(String judul, String tipe, String kategori, int nominal) {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("judul", judul);
        contentValues.put("tipe", tipe);
        contentValues.put("kategori", kategori);
        contentValues.put("nominal", nominal);

        long result = DB.insert("catatan_keuangan", null, contentValues);
        if (result == -1) {
            return false;
        }
        else {
            return true;
        }
    }

    // UPDATE DATA
//    public Boolean updateCatatanKeuangan(String judul, String tipe, String kategori, int nominal) {
//        SQLiteDatabase DB = this.getWritableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("judul", judul);
//        contentValues.put("tipe", tipe);
//        contentValues.put("kategori", kategori);
//        contentValues.put("nominal", nominal);
//
//        long result = DB.update("catatan_keuangan", contentValues, );
//        if (result == -1) {
//            return false;
//        }
//        else {
//            return true;
//        }
//    }
}
