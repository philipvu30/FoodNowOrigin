package com.foodnow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    FirebaseRecyclerOptions<Restaurant> options;

    RecyclerView rvOrderContent;
    ArrayList<Food> menu;
    FoodAdapter foodAdapter;
    TextView tvRestaurantName, tvAddress,tvOpenHours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("FOODNOW_DATABASE");

        tvRestaurantName = findViewById(R.id.tvRestaurantName);
        tvAddress = findViewById(R.id.tvAddress);
        tvOpenHours = findViewById(R.id.tvOpenHours);

        rvOrderContent = findViewById(R.id.rvOrderContent);
        Bundle extra = getIntent().getExtras();
        menu = (ArrayList<Food>) extra.getSerializable("menu");

        foodAdapter = new FoodAdapter(OrderActivity.this,menu);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(OrderActivity.this,RecyclerView.VERTICAL,false);
        rvOrderContent.setAdapter(foodAdapter);
        rvOrderContent.setLayoutManager(layoutManager);
        tvRestaurantName.setText(extra.getString("restaurant"));
        tvAddress.setText(extra.getString("address"));
        tvOpenHours.setText(extra.getString("openhours"));
    }
}
