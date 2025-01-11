package com.example.flexs;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<CustomModel> customModelArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        String isi = intent.getStringExtra("nama");
        TextView judul = findViewById(R.id.judul);
        judul.setText("Welcom\n"+isi);

        recyclerView = findViewById(R.id.reciclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        customModelArrayList.add(new CustomModel(R.drawable.drstrange, "Doctor Strange","Action, Adventure"));
        customModelArrayList.add(new CustomModel(R.drawable.moana, "Moana","Animation, Coming of Age"));
        customModelArrayList.add(new CustomModel(R.drawable.captenamerica, "Captain America","Action, Adventure"));
        customModelArrayList.add(new CustomModel(R.drawable.captenmarvel, "Captain Marvel","Action, Adventure"));
        customModelArrayList.add(new CustomModel(R.drawable.brave, "Brave","Animation, Coming of Age"));
        customModelArrayList.add(new CustomModel(R.drawable.groot, "I Am Groot","Action, Adventure"));
        customModelArrayList.add(new CustomModel(R.drawable.frozen2, "Frozen II","Animation, fantasy"));
        customModelArrayList.add(new CustomModel(R.drawable.avangers, "Avangers","Action, Adventure"));
        customModelArrayList.add(new CustomModel(R.drawable.raya, "Raya","Mitology"));
        customModelArrayList.add(new CustomModel(R.drawable.ironman, "Iron Man","Action, Adventure"));
        customModelArrayList.add(new CustomModel(R.drawable.inside2, "Inside 2","Animation, Magic"));
        customModelArrayList.add(new CustomModel(R.drawable.toystory, "Toy Storys 4","Animation"));


        CustomAdapter customAdapter = new CustomAdapter(this, customModelArrayList);
        recyclerView.setAdapter(customAdapter);


    }
}