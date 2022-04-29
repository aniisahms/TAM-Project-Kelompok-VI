package com.example.mykas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TampilCatatanActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Item> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Catatan Keuangan");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_catatan);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(ItemDataTampilCatatan.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        AdapterData cardViewContactAdapter = new AdapterData(this);
        cardViewContactAdapter.setCatatanKeuanganList(list);
        recyclerView.setAdapter(cardViewContactAdapter);
    }
}