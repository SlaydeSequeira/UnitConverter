package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;

public class RecyclerAdapter3 extends RecyclerView.Adapter<RecyclerAdapter3.ViewHolder>{

    private final Context context;
    private final String[] Image;
    private final String[] tx1;
    private final String[] tx3;
    private final String[] tx2;
    private final String[] tx4;
    private final int[] prog;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.add,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    public RecyclerAdapter3(Context context, String Image[],String tx1[],String tx2[],String tx3[],String tx4[],int prog[])
    {
        this.context=context;
        this.Image=Image;
        this.tx1=tx1;
        this.tx2=tx2;
        this.tx3=tx3;
        this.tx4=tx4;
        this.prog=prog;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context)
                .load(Image[position])
                .error(R.drawable.ic_launcher_background)
                .into(holder.imageView);
        holder.p1.setProgress(prog[position]);
        holder.t1.setText(tx1[position]);
        holder.t2.setText(tx2[position]);
        holder.t3.setText(tx3[position]);
        holder.t4.setText(tx4[position]);
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView t1,t2,t3,t4;

        ProgressBar p1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            t1=itemView.findViewById(R.id.text1);
            t2=itemView.findViewById(R.id.text2);
            t3=itemView.findViewById(R.id.text3);
            t4=itemView.findViewById(R.id.text6);
            p1=itemView.findViewById(R.id.progressbar);
        }
    }
}
