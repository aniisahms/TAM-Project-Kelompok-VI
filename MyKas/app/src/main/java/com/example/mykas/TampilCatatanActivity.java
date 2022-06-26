package com.example.mykas;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TampilCatatanActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private RecyclerView recyclerView;
    private ArrayList<Item> list;
    private Button btnTambahCatatanBaru;
    private Spinner rentangTampilCatSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Catatan Keuangan");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_catatan);

        // RENTANG TAMPIL CATATAN SPINNER
        rentangTampilCatSpinner = findViewById(R.id.rentang_tampil_cat_spinner);
        ArrayAdapter<CharSequence> adapterRentangTampil = ArrayAdapter.createFromResource(this, R.array.rentang_waktu_tampil_catatan, android.R.layout.simple_spinner_item);
        adapterRentangTampil.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rentangTampilCatSpinner.setAdapter(adapterRentangTampil);
        rentangTampilCatSpinner.setOnItemSelectedListener(this);

        // RECYCLERVIEW
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(ItemDataTampilCatatan.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        AdapterData cardViewContactAdapter = new AdapterData(this);
        cardViewContactAdapter.setCatatanKeuanganList(list);
        recyclerView.setAdapter(cardViewContactAdapter);

        // BUTTON TAMBAH CATATAN BARU
        btnTambahCatatanBaru = findViewById(R.id.btn_tambah_catatan_baru);

        btnTambahCatatanBaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TambahCatatanActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
