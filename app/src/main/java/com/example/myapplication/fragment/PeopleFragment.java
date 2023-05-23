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

    String Image[]={"https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg","https://images.pexels.com/photos/15597151/pexels-photo-15597151/free-photo-of-profile-of-a-bearded-man.jpeg?auto=compress&cs=tinysrgb&w=600","https://images.pexels.com/photos/3763152/pexels-photo-3763152.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","https://images.pexels.com/photos/1370750/pexels-photo-1370750.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1","https://images.pexels.com/photos/1462980/pexels-photo-1462980.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"};
    String tx1[]={"Ravi Acharya","Chinmay Shah","Romi Gupta","Nishi Dalal","Akhil Gadwal","Nitin Singh"};
    String tx2[]={"Mumbai","Mumbai","Mumbai","Mumbai","Mumbai","Mumbai"};
    String tx3[]={"400-500m","600-700m","1.1km","1.3km","1.4km","1.7km"};
    String tx4[]={"Student","Graphics Designer","Software Dev","Android Dev","Software Dev"};

    int prog[]={30,20,70,90,80,60};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_people, container, false);
        recyclerView=view.findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new RecyclerAdapter3(getActivity(), Image,tx1,tx2,tx3,tx4,prog);
        recyclerView.setAdapter(adapter);
        return view;
    }
}