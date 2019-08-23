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

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantVH> {

    Context context;
    ArrayList<Restaurant> restaurants;

    public RestaurantAdapter(Context context, ArrayList<Restaurant> restaurants) {
        this.context = context;
        this.restaurants = restaurants;
    }

    @NonNull
    @Override
    public RestaurantVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.restaurant_item,null,false);
        return new RestaurantVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantVH holder, int position) {
        Restaurant restaurant = restaurants.get(position);
        holder.tvRestaurantAddressItem.setText(restaurant.getAddress());
        holder.tvRestaurantNameItem.setText(restaurant.getName());
        holder.imgRestaurantNameItem.setImageResource(restaurant.getLogo());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    class RestaurantVH extends RecyclerView.ViewHolder{

        ImageView imgRestaurantNameItem;
        TextView tvRestaurantNameItem, tvRestaurantAddressItem;

        public RestaurantVH(@NonNull View itemView) {
            super(itemView);
            imgRestaurantNameItem = itemView.findViewById(R.id.imgRestaurantNameItem);
            tvRestaurantNameItem = itemView.findViewById(R.id.tvRestaurantNameItem);
            tvRestaurantAddressItem = itemView.findViewById(R.id.tvRestaurantAddressItem);
        }
    }

}
