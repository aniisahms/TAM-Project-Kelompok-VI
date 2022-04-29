package com.example.mykas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LaporanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Laporan Keuangan");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan);
    }
}