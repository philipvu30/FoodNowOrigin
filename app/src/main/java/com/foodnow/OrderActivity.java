package com.foodnow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    RecyclerView rvOrderContent;
    ArrayList<Food> menu;
    FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        rvOrderContent = findViewById(R.id.rvOrderContent);
        menu = new ArrayList<>();
        menu.add(new Food("Bánh mì",R.drawable.ic_banh_mi,12000));
        menu.add(new Food("Black Coffee",R.drawable.ic_black_coffee,35000));
        menu.add(new Food("Milk Tea",R.drawable.ic_milk_tea,30000));
        menu.add(new Food("Long Tea",R.drawable.ic_milk_tea,40000));
        menu.add(new Food("Hỏa Tea",R.drawable.ic_milk_tea,50000));


        foodAdapter = new FoodAdapter(OrderActivity.this,menu);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(OrderActivity.this,RecyclerView.VERTICAL,false);

        rvOrderContent.setAdapter(foodAdapter);
        rvOrderContent.setLayoutManager(layoutManager);
    }
}
