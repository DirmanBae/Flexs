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

public class regist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_regist);

        EditText inNama = findViewById(R.id.inNama);
        EditText inUsername = findViewById(R.id.inUsername);
        EditText inPass = findViewById(R.id.inPass);
        EditText inPass2 = findViewById(R.id.inPass2);
        Button btnRegis = findViewById(R.id.btnRegist);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = inNama.getText().toString().trim();
                String username = inUsername.getText().toString().trim();
                String pass1 = inPass.getText().toString().trim();
                String pass2 = inPass2.getText().toString().trim();

                if(nama.isEmpty() || username.isEmpty()){
                    Toast.makeText(regist.this, "Inputan tidak Boleh kosong", Toast.LENGTH_SHORT).show();
                }else if(pass1.isEmpty() || pass2.isEmpty()){
                    Toast.makeText(regist.this, "Inputan tidak Boleh kosong", Toast.LENGTH_SHORT).show();
                }else if(pass1.equals(pass2)){
                    Intent i = new Intent(regist.this, LoginActivity.class);
                    i.putExtra("nama",nama);
                    i.putExtra("username",username);
                    i.putExtra("password",pass1);
                    startActivity(i);
                    Toast.makeText(regist.this, "password sama", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(regist.this, "password salah", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}