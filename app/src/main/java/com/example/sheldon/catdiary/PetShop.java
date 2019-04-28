package com.example.sheldon.catdiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PetShop extends AppCompatActivity {

    private ImageButton btn_return;
    private Button btn_catfood;
    private Button btn_cattoy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_shop);

        btn_return = findViewById(R.id.btn_return);
        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PetShop.this, MasterHome.class);
                startActivity(intent);
            }
        });

        btn_catfood = findViewById(R.id.btn_catfood);
        btn_catfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PetShop.this, CatFood.class);
                startActivity(intent);
            }
        });

        btn_cattoy = findViewById(R.id.btn_cattoy);
        btn_cattoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PetShop.this, CatToy.class);
                startActivity(intent);
            }
        });
    }
}
