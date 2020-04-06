package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button pindahhal2;
    EditText Nama, Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pindahhal2 = findViewById(R.id.btnok);
        Nama = findViewById(R.id.editUN);
        Pass = findViewById(R.id.editPass);


        pindahhal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Nama.getText().toString().equals("admin") && Pass.getText().toString().equals("123")){
                    Toast.makeText(getApplicationContext(), "Login Sucses", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(MainActivity.this, Page2.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Username atau Password Salah", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
