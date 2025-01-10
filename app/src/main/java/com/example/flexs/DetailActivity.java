package com.example.flexs;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {
ImageView getImageView;
TextView tvGetTitle , tvGetDest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        getImageView = findViewById(R.id.tvImage);
        tvGetTitle = findViewById(R.id.tvTitle);
        tvGetDest = findViewById(R.id.tvDest);

        Intent intent = getIntent();

        String getTitle = intent.getStringExtra("title");
        String getDest = intent.getStringExtra("dest");

        int getImage = intent.getIntExtra("icon", 0);

        getImageView.setImageResource(getImage);
        tvGetTitle.setText(getTitle);
        tvGetDest.setText(getDest);


    }
}