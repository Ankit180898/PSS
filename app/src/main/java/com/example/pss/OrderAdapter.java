package com.example.pss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.Holder> {
    private ArrayList<Orders> order=new ArrayList<>();

    public OrderAdapter(Context context, ArrayList<Orders> order) {
        this.order = order;
    }

    @Override
    public OrderAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_items,parent,false);

        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(OrderAdapter.Holder holder, int position) {
        holder.itemView.setTag(order.get(position));
        holder.name.setText(order.get(position).getName());
        holder.address.setText(order.get(position).getAddress());
        holder.dueDate.setText(order.get(position).getDueDate());
        holder.lastModified.setText(order.get(position).getLastModified());
        holder.createdOn.setText(order.get(position).getCreatedOn());
    }

    @Override
    public int getItemCount() {
        return order.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView name,address,dueDate,lastModified,createdOn;
        public Holder(View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.tvName);
            address=itemView.findViewById(R.id.tvAddress);
            dueDate=itemView.findViewById(R.id.tvDueDate);
            lastModified=itemView.findViewById(R.id.tvLastModified);
            createdOn=itemView.findViewById(R.id.tvCreatedOn);
        }
    }
}
