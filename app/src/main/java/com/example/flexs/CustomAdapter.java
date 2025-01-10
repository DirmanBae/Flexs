package com.example.flexs;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomHolder> {

    Context context;
    ArrayList<CustomModel> customModelArrayList = new ArrayList<>();

    public CustomAdapter(Context context, ArrayList<CustomModel> customModelArrayList) {
        this.context = context;
        this.customModelArrayList = customModelArrayList;
    }

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomHolder(LayoutInflater.from(context).inflate(R.layout.activity_item_film, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder holder, int position) {
        holder.imageView.setImageResource(customModelArrayList.get(position).getImage());
        holder.tvTitle.setText(customModelArrayList.get(position).getTitle());
        holder.tvDest.setText(customModelArrayList.get(position).getDest());

        holder.cardItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inten = new Intent(context, DetailActivity.class);

                inten.putExtra("icon", customModelArrayList.get(position).getImage());
                inten.putExtra("title",customModelArrayList.get(position).getTitle());
                inten.putExtra("dest", customModelArrayList.get(position).getDest());
                context.startActivity(inten);

            }
        });

    }

    @Override
    public int getItemCount() {
        return customModelArrayList.size();
    }
}
