package com.books.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String titles[];
    String directorName[];
    int movieposter[];
    Context ct;

    public MyAdapter(String[] titles, String[] directorName, int[] movieposter, Context ct) {
        this.titles = titles;
        this.directorName = directorName;
        this.movieposter = movieposter;
        this.ct = ct;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup ViewGroup, int viewType) {
        View view= LayoutInflater.from(ct).inflate(R.layout.row_design,ViewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.d.setText(directorName[position]);
        holder.t.setText(titles[position]);
        holder.p.setBackgroundResource(movieposter[position]);

    }

    @Override
    public int getItemCount() {
        return movieposter.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView t,d;
        ImageView p;
        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            t=itemView.findViewById(R.id.mt);
            p=itemView.findViewById(R.id.mp);
            d=itemView.findViewById(R.id.dn);
        }
    }
}
