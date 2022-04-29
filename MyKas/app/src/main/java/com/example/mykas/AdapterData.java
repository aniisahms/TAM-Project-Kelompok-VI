package com.example.mykas;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterData extends RecyclerView.Adapter<AdapterData.CardViewViewHolder> {
    private ArrayList<Item> catatanKeuanganList;
    private Context context;

    public AdapterData(Context context) {
        this.context = context;
    }

    public ArrayList<Item> getCatatanKeuanganList() {
        return catatanKeuanganList;
    }

    public void setCatatanKeuanganList(ArrayList<Item> catatanKeuanganList) {
        this.catatanKeuanganList = catatanKeuanganList;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data_tampil_catatan, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        Item c = getCatatanKeuanganList().get(position);
        holder.tvTanggalCatatan.setText(c.getTanggal());
        holder.tvPengeluaran.setText(c.getPengeluaran());
        holder.tvPemasukan.setText(c.getPemasukan());
    }

    @Override
    public int getItemCount() {
        return getCatatanKeuanganList().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        TextView tvTanggalCatatan, tvPengeluaran, tvPemasukan, btnLihatDetail;

        public CardViewViewHolder(View itemView) {
            super(itemView);
            tvTanggalCatatan = (TextView) itemView.findViewById(R.id.tv_tgl_catatan);
            tvPengeluaran = (TextView) itemView.findViewById(R.id.tv_rp_pengeluaran);
            tvPemasukan = (TextView) itemView.findViewById(R.id.tv_rp_pemasukan);
            btnLihatDetail = (TextView) itemView.findViewById(R.id.btn_lihat_detail);

//            btnLihatDetail.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(getActivity(), LaporanActivity.class);
//                    startActivity(intent);
//                }
//            });
        }
    }
}
