package com.example.mykas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class LaporanActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner rentangWaktuLaporanSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Laporan Keuangan");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan);

        // RENTANG WAKTU LAPORAN SPINNER
        rentangWaktuLaporanSpinner = findViewById(R.id.rentang_waktu_laporan_spinner);
        ArrayAdapter<CharSequence> adapterRentangLaporan = ArrayAdapter.createFromResource(this, R.array.rentang_waktu_laporan, android.R.layout.simple_spinner_item);
        adapterRentangLaporan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rentangWaktuLaporanSpinner.setAdapter(adapterRentangLaporan);
        rentangWaktuLaporanSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
