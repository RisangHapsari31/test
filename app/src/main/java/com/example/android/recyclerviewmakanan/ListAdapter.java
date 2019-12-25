package com.example.android.recyclerviewmakanan;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private static final String TAG = "ListAdapter";
    private ArrayList<String> mNamaMakanan = new ArrayList<>();
    private ArrayList<String> mDeskripsiMakanan = new ArrayList<>();
    private ArrayList<String> mGambar = new ArrayList<>();
    private Context mContext;

    public ListAdapter(Context mContext,ArrayList<String> mNamaMakanan, ArrayList<String> mDeskripsiMakanan, ArrayList<String> mGambar) {
        this.mNamaMakanan = mNamaMakanan;
        this.mDeskripsiMakanan = mDeskripsiMakanan;
        this.mGambar = mGambar;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent,false);
        ViewHolder holder = new ViewHolder(view)
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView gambar;
        TextView namaMakanan;
        TextView deskripsiMakanan;
        RelativeLayout relative;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            gambar = itemView.findViewById(R.id.gambar);
            namaMakanan = itemView.findViewById(R.id.nama_makanan);
            deskripsiMakanan = itemView.findViewById(R.id.deskripsi_makanan);
            relative = itemView.findViewById(R.id.relative);
        }
    }
}
