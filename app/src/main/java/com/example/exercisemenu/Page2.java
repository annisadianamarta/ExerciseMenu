package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class Page2 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{
    Button pindahpage1, kotak, lingkaran, prgpjg, tiga, trap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        pindahpage1 = findViewById(R.id.power);
        kotak = findViewById(R.id.persegi);
        lingkaran = findViewById(R.id.lingkaran);
        prgpjg = findViewById(R.id.persegipjg);
        tiga = findViewById(R.id.segitiga);
        trap = findViewById(R.id.trapesium);

        pindahpage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Page2.this, MainActivity.class);
                startActivity(e);
            }
        });
        kotak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Page2.this, view);
                popupMenu.setOnMenuItemClickListener(Page2.this);
                popupMenu.inflate(R.menu.popupmenu);
                popupMenu.show();
            }
        });
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Page2.this, view);
                popupMenu.setOnMenuItemClickListener(Page2.this);
                popupMenu.inflate(R.menu.popupmenu);
                popupMenu.show();
            }
        });
        prgpjg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Page2.this, view);
                popupMenu.setOnMenuItemClickListener(Page2.this);
                popupMenu.inflate(R.menu.popupmenu);
                popupMenu.show();
            }
        });
        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Page2.this, view);
                popupMenu.setOnMenuItemClickListener(Page2.this);
                popupMenu.inflate(R.menu.popupmenu);
                popupMenu.show();
            }
        });
        trap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Page2.this, view);
                popupMenu.setOnMenuItemClickListener(Page2.this);
                popupMenu.inflate(R.menu.popupmenu);
                popupMenu.show();
            }
        });



    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.HitungLuas:
            Intent a = new Intent(Page2.this, Luas.class);
            startActivity(a);
            break;
            case R.id.HitungKeliling:
            Intent o = new Intent(Page2.this, Keliling.class);
            startActivity(o);
            break;
        }
        return false;
    }
}
