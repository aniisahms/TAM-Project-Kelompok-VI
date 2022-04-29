package com.example.mykas;

import java.util.ArrayList;

public class ItemDataTampilCatatan {

    // SAMPEL !!
    public static String[][] data = new String[][] {
            {"Tanggal", "Rpxx", "Rpxx"},
            {"Tanggal", "Rpxx", "Rpxx"},
            {"Tanggal", "Rpxx", "Rpxx"},
            {"Tanggal", "Rpxx", "Rpxx"}
    };

    public static ArrayList<Item> getListData() {
        Item catatan = null;
        ArrayList<Item> list = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            catatan = new Item();
            catatan.setTanggal(data[i][0]);
            catatan.setPengeluaran(data[i][1]);
            catatan.setPemasukan(data[i][2]);
            list.add(catatan);
        }
        return list;
    }
}
