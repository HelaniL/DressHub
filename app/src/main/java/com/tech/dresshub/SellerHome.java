package com.tech.dresshub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;

public class SellerHome extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_home);

        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        toolbar = (Toolbar) findViewById(R.id.toolbaraddOrView);


        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(SellerHome.this,ChooseActor.class);
                SellerHome.this.startActivity(mainIntent);
                SellerHome.this.finish();
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(SellerHome.this,AddProduct.class);
                SellerHome.this.startActivity(mainIntent);
                SellerHome.this.finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(SellerHome.this,ViewProducts.class);
                SellerHome.this.startActivity(mainIntent);
                SellerHome.this.finish();
            }
        });
    }
}