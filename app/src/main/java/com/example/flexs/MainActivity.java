package com.example.flexs;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView judul = findViewById(R.id.judul);
        Button btnLogin = findViewById(R.id.btnLogin);
        TextView btnRegist = findViewById(R.id.btnRegist);
        Button btnGoogle = findViewById(R.id.btnGoogle);

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(intent);
            }
        });

        btnRegist.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, regist.class);
            startActivity(i);
        });

        btnLogin.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(i);
        });

        SpannableString aturWarna = new SpannableString("FlexS");
        aturWarna.setSpan(new ForegroundColorSpan(Color.rgb(251,92,54)), 4,5, aturWarna.SPAN_EXCLUSIVE_EXCLUSIVE);
        aturWarna.setSpan(new ForegroundColorSpan(Color.rgb(255,255,255)), 0,4, aturWarna.SPAN_EXCLUSIVE_EXCLUSIVE);
        judul.setText(aturWarna);
    }
}