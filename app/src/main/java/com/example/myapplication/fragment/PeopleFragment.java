package com.example.myapplication.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.adapter.RecyclerAdapter3;

public class PeopleFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerAdapter3 adapter;
    String Image[]={"https://thewowstyle.com/wp-content/uploads/2015/01/nature-images..jpg","https://thewowstyle.com/wp-content/uploads/2015/01/nature-images..jpg","https://thewowstyle.com/wp-content/uploads/2015/01/nature-images..jpg"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_people, container, false);
        recyclerView=view.findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new RecyclerAdapter3(getActivity(), Image);
        recyclerView.setAdapter(adapter);
        return view;
    }
}