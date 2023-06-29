package com.example.grocery_app;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView eggs, milk, fish, chick;
    private ImageView flour, can, snack, bread;
    private ImageView fruits, veg, pul, tea;
    private ImageView spice,other;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        eggs = (ImageView) findViewById(R.id.eggs);
        milk = (ImageView) findViewById(R.id.milk);
        fish = (ImageView) findViewById(R.id.fish);
        chick = (ImageView) findViewById(R.id.chick);

        flour = (ImageView) findViewById(R.id.flour);
        can = (ImageView) findViewById(R.id.can);
        snack = (ImageView) findViewById(R.id.snack);
        bread = (ImageView) findViewById(R.id.bread);

        fruits = (ImageView) findViewById(R.id.fruits);
        veg = (ImageView) findViewById(R.id.veg);
        pul = (ImageView) findViewById(R.id.pul);
        tea = (ImageView) findViewById(R.id.tea);

        spice = (ImageView) findViewById(R.id.spice);
        other = (ImageView) findViewById(R.id.other);


        eggs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.example.grocery_app.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Eggs");
                startActivity(intent);
            }
        });
        milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.example.grocery_app.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Milk");
                startActivity(intent);
            }
        });


        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.example.grocery_app.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Fish");
                startActivity(intent);
            }
        });

        chick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.example.grocery_app.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Meat");
                startActivity(intent);
            }
        });

        flour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.example.grocery_app.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Flour");
                startActivity(intent);
            }
        });


        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.example.grocery_app.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Soft Drinks");
                startActivity(intent);
            }
        });



        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.example.grocery_app.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Snacks");
                startActivity(intent);
            }
        });


        bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.example.grocery_app.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Bread");
                startActivity(intent);
            }
        });



        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.example.grocery_app.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Fruits");
                startActivity(intent);
            }
        });


        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.example.grocery_app.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Vegetables");
                startActivity(intent);
            }
        });


        pul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.example.grocery_app.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Pulses");
                startActivity(intent);
            }
        });


        tea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.example.grocery_app.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Tea or Coffee");
                startActivity(intent);
            }
        });

        spice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.example.grocery_app.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Spice");
                startActivity(intent);
            }
        });

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.example.grocery_app.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Others");
                startActivity(intent);
            }
        });
    }
}
