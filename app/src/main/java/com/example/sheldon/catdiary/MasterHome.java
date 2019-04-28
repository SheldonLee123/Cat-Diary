package com.example.sheldon.catdiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MasterHome extends AppCompatActivity {

    private ImageButton btn_info;
    private ImageButton btn_setting;
    private ImageButton btn_petshop;
    private ImageButton btn_care;
    private ImageButton btn_hospital;
    private ImageButton btn_activity;
    private ImageButton btn_beauty;
    private ImageButton btn_nest;
    private ImageButton btn_catshop;
    private ImageButton btn_cutepet;
    private LinearLayout parentlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_home);

        parentlayout = findViewById(R.id.parentlayout);
        parentlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterHome.this, GameScenes.class);
                startActivity(intent);
            }
        });

        btn_info = findViewById(R.id.btn_info);
        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterHome.this, PetInfo.class);
                startActivity(intent);
            }
        });
//
        btn_setting = findViewById(R.id.btn_setting);
        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterHome.this, Setting.class);
                startActivity(intent);
            }
        });
//
        btn_petshop = findViewById(R.id.btn_petshop);
        btn_petshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterHome.this, PetShop.class);
                startActivity(intent);
            }
        });
//
        btn_care = findViewById(R.id.btn_care);
        btn_care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterHome.this, PetCare.class);
                startActivity(intent);
            }
        });
//
//        btn_hospital = findViewById(R.id.btn_hospital);
//        btn_hospital.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MasterHome.this, PetInfo.class);
//                startActivity(intent);
//            }
//        });
//
        btn_activity = findViewById(R.id.btn_activity);
        btn_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterHome.this, PetActivity.class);
                startActivity(intent);
            }
        });
//
        btn_beauty = findViewById(R.id.btn_beauty);
        btn_beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterHome.this, CatBeauty.class);
                startActivity(intent);
            }
        });

        btn_nest = findViewById(R.id.btn_nest);
        btn_nest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterHome.this, PetNest.class);
                startActivity(intent);
            }
        });

        btn_catshop = findViewById(R.id.btn_catshop);
        btn_catshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterHome.this, CatShop.class);
                startActivity(intent);
            }
        });
//
        btn_cutepet = findViewById(R.id.btn_cutepet);
        btn_cutepet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterHome.this, CutePet.class);
                startActivity(intent);
            }
        });

    }
}
