package com.example.pss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    OrderAdapter orderAdapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Orders> order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.list);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        order=new ArrayList<>();
        order.add(new Orders("Ellen Powell","1397  Hanover Street, New York, NY, 10004","Jan 18, 2020","Jan 18, 2020, 08:30 PM","Dec 18, 2019, 08:30 PM"));
        order.add(new Orders("Cynthia Caldwell","88 Gabriel Springs Apt. 078","Jan 18, 2020","Jan 18, 2020, 08:30 PM","Dec 18, 2019, 08:30 PM"));
        order.add(new Orders("Steve McKenzie","75 DuBuque Corners Suite 300","Jan 18, 2020","Jan 18, 2020, 08:30 PM","Dec 18, 2019, 08:30 PM"));
        order.add(new Orders("Daniel Holland","196 Bridget Expressway Apt. 985","Jan 18, 2020","Jan 18, 2020, 08:30 PM","Dec 18, 2019, 08:30 PM"));
        order.add(new Orders("Ankit Kumar","Newtown, Kolkata","Jan 18, 2020","Jan 18, 2020, 08:30 PM","Dec 18, 2019, 08:30 PM"));

        orderAdapter=new OrderAdapter(this,order);
        recyclerView.setAdapter(orderAdapter);
    }
}