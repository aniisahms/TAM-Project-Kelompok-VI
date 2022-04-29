package com.example.mykas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TambahCatatanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Tambah Catatan Keuangan");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_catatan);
    }
}