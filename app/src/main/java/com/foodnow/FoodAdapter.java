package com.foodnow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodVH> {
    Context context;
    ArrayList<Food> menu;

    public FoodAdapter(Context context, ArrayList<Food> menu) {
        this.context = context;
        this.menu = menu;

    }

    @NonNull
    @Override
    public FoodVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.order_item,null,false);
        return new FoodVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodVH holder, int position) {
        Food food = menu.get(position);
        holder.imgFoodName.setImageResource(food.getImage());
        holder.tvFoodName.setText(food.getName());
        holder.tvFoodPrice.setText(food.getPrice()+" VND");
    }

    @Override
    public int getItemCount() {
        return menu.size();
    }

    class FoodVH extends RecyclerView.ViewHolder{

        ImageView imgFoodName;
        TextView tvFoodName,tvFoodPrice;

        public FoodVH(@NonNull View itemView) {
            super(itemView);
            imgFoodName = itemView.findViewById(R.id.imgFoodName);
            tvFoodName = itemView.findViewById(R.id.tvFoodName);
            tvFoodPrice = itemView.findViewById(R.id.tvFoodPrice);
        }
    }
}
