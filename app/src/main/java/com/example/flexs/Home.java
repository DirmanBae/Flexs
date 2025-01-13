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
        judul.setText("Welcome\n"+isi);

        recyclerView = findViewById(R.id.reciclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String TextDrStrange = getString(R.string.drStrange);
        String TextMoana = getString(R.string.moana);
        String TextCaptainAmerica = getString(R.string.CaptenAmerica);
        String TextCaptainMarvel = getString(R.string.CaptenMarvel);
        String TextBrave = getString(R.string.Brave);
        String TextGroot = getString(R.string.groot);
        String Textfroozen = getString(R.string.froozen);
        String TextAvangers = getString(R.string.avangers);
        String TextRaya = getString(R.string.raya);
        String TextIronMan = getString(R.string.ironman);
        String TextInside = getString(R.string.inside);
        String TextToy = getString(R.string.toystory);

        customModelArrayList.add(new CustomModel(R.drawable.drstrange, "DOCTOR STRANGE : MULTIVERSE OF MADNESS",TextDrStrange));
        customModelArrayList.add(new CustomModel(R.drawable.moana, "MOANA",TextMoana));
        customModelArrayList.add(new CustomModel(R.drawable.captenamerica, "CAPTAIN AMERICA : THE FIRST AVENGER",TextCaptainAmerica));
        customModelArrayList.add(new CustomModel(R.drawable.captenmarvel, "CAPTAIN MARVEL",TextCaptainMarvel));
        customModelArrayList.add(new CustomModel(R.drawable.brave, "BRAVE",TextBrave));
        customModelArrayList.add(new CustomModel(R.drawable.groot, "I AM GROOT",TextGroot));
        customModelArrayList.add(new CustomModel(R.drawable.frozen2, "FROOZEN II",Textfroozen));
        customModelArrayList.add(new CustomModel(R.drawable.avangers, "AVENGERS",TextAvangers));
        customModelArrayList.add(new CustomModel(R.drawable.raya, "RAYA AND THE LAST DRAGON",TextRaya));
        customModelArrayList.add(new CustomModel(R.drawable.ironman, "IRON MAN",TextIronMan));
        customModelArrayList.add(new CustomModel(R.drawable.inside2, "INSIDE OUT 2",TextInside));
        customModelArrayList.add(new CustomModel(R.drawable.toystory, "TOY STORY 4",TextToy));


        CustomAdapter customAdapter = new CustomAdapter(this, customModelArrayList);
        recyclerView.setAdapter(customAdapter);


    }
}