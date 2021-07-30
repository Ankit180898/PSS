package com.example.pss;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Past#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Past extends Fragment {
    private RecyclerView recyclerview;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Past() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Past.
     */
    // TODO: Rename and change types and number of parameters
    public static Past newInstance(String param1, String param2) {
        Past fragment = new Past();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_upcoming, container, false);

        recyclerview = view.findViewById(R.id.list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutManager);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<Orders> orders=new ArrayList<>();
        orders.add(new Orders("Ellen Powell","1397  Hanover Street, New York, NY, 10004","Jan 18, 2020","Jan 18, 2020, 08:30 PM","Dec 18, 2019, 08:30 PM"));
        orders.add(new Orders("Cynthia Caldwell","88 Gabriel Springs Apt. 078","Jan 18, 2020","Jan 18, 2020, 08:30 PM","Dec 18, 2019, 08:30 PM"));
        orders.add(new Orders("Steve McKenzie","75 DuBuque Corners Suite 300","Jan 18, 2020","Jan 18, 2020, 08:30 PM","Dec 18, 2019, 08:30 PM"));
        orders.add(new Orders("Daniel Holland","196 Bridget Expressway Apt. 985","Jan 18, 2020","Jan 18, 2020, 08:30 PM","Dec 18, 2019, 08:30 PM"));
        orders.add(new Orders("Ankit Kumar","Newtown, Kolkata","Jan 18, 2020","Jan 18, 2020, 08:30 PM","Dec 18, 2019, 08:30 PM"));

        OrderAdapter orderAdapter=new OrderAdapter(orders);
        recyclerview.setAdapter(orderAdapter);
    }

}