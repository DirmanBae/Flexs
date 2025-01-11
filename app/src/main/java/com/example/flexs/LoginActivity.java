package com.example.flexs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        Intent data = getIntent();
        String nama = data.getStringExtra("nama");
        String username = data.getStringExtra("username");
        String password = data.getStringExtra("password");

        EditText inUsername = findViewById(R.id.inUsername);
        EditText inPassword = findViewById(R.id.inPassword);
        Button login = findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = inUsername.getText().toString().trim();
                String pass = inPassword.getText().toString().trim();
                if(user.equals(username) && pass.equals(password)){
                    Intent intent = new Intent(LoginActivity.this, Home.class);
                    intent.putExtra("nama",nama);
                    startActivity(intent);
                }else if(user.isEmpty() || pass.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Inputan tidak Boleh kosong", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(LoginActivity.this, "Login gagal!!", Toast.LENGTH_SHORT).show();
                }



            }
        });

    }
}