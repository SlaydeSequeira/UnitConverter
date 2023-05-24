package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.myapplication.adapter.MyPagerAdapter;
import com.example.myapplication.fragment.JobFragment;
import com.example.myapplication.fragment.PeopleFragment;
import com.example.myapplication.fragment.WorkFragment;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import com.example.myapplication.adapter.MyPagerAdapter;
import com.example.myapplication.fragment.JobFragment;
import com.example.myapplication.fragment.PeopleFragment;
import com.example.myapplication.fragment.WorkFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private FragmentManager supportFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        pagerAdapter.addFragment(new PeopleFragment(), "Ppl");
        pagerAdapter.addFragment(new JobFragment(), "Job");
        pagerAdapter.addFragment(new WorkFragment(), "Work");

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.baseline_groups_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.baseline_work_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.baseline_storefront_24);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){


            case R.id.refine:
                Intent i = new Intent(MainActivity.this,Refine.class);
                startActivity(i);
                return true;




        }
        return false;
    }

}


