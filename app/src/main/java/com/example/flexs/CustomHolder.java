package com.example.flexs;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView tvTitle, tvDest;
    CardView cardItemView;

    public CustomHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.rvImage);
        tvTitle = itemView.findViewById(R.id.rvTitle);
        tvDest = itemView.findViewById(R.id.rvDest);
        cardItemView = itemView.findViewById(R.id.cardItem);


    }
}
