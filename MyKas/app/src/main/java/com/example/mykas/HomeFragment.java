package com.example.mykas;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {
    Button btnTambahCatatan, btnTampilCatatan, btnLaporan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_home, container, false);

        btnTambahCatatan = root.findViewById(R.id.btn_tambah_catatan);
        btnTampilCatatan = root.findViewById(R.id.btn_tampilkan_catatan);
        btnLaporan = root.findViewById(R.id.btn_laporan);

        btnTambahCatatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TambahCatatanActivity.class);
                startActivity(intent);
            }
        });

        btnTampilCatatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TampilCatatanActivity.class);
                startActivity(intent);
            }
        });

        btnLaporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LaporanActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        btnTambahCatatan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_tambahCatatanActivity);
//            }
//        });
//    }
}