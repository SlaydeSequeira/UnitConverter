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

public class JobFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerAdapter3 adapter;
    String Image[] = {
            "https://images.pexels.com/photos/3763152/pexels-photo-3763152.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg",
            "https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://images.pexels.com/photos/1462980/pexels-photo-1462980.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://images.pexels.com/photos/15597151/pexels-photo-15597151/free-photo-of-profile-of-a-bearded-man.jpeg?auto=compress&cs=tinysrgb&w=600",
            "https://images.pexels.com/photos/1370750/pexels-photo-1370750.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
    };

    String tx1[] = {
            "Chinmay Shah",
            "Ravi Acharya",
            "Romi Gupta",
            "Nishi Dalal",
            "Nitin Singh",
            "Akhil Gadwal"
    };

    String tx2[] = {
            "Mumbai",
            "Mumbai",
            "Mumbai",
            "Mumbai",
            "Mumbai",
            "Mumbai"
    };

    String tx3[] = {
            "1.1km",
            "400-500m",
            "1.3km",
            "1.7km",
            "600-700m",
            "1.4km"
    };

    String tx4[] = {
            "Graphics Designer",
            "Student",
            "Android Dev",
            "Software Dev",
            "Software Dev",
            "Software Dev"
    };

    int prog[] = {70, 30, 90, 60, 20, 80};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_job, container, false);
        recyclerView=view.findViewById(R.id.recycle2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new RecyclerAdapter3(getActivity(), Image,tx1,tx2,tx3,tx4,prog);
        recyclerView.setAdapter(adapter);
        return view;
    }
}