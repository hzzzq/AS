package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MybaseAdapterdemo extends BaseAdapter {

    private   List<Animals> data;
    private  Context mContext;



    public MybaseAdapterdemo(List<Animals> data, Context mContext) {
        this.data = data;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final  Animals animals=data.get(position);
        View view = LayoutInflater.from(mContext).inflate(R.layout.spinner_item,null);
        ImageView imageView=view.findViewById(R.id.imageView1);
        TextView textView1=view.findViewById(R.id.textView1);
        TextView textView2=view.findViewById(R.id.textView2);
        imageView.setImageResource(animals.getAimage());
        textView1.setText(animals.getName());
        textView2.setText(animals.getAtext());
        return view;
    }
//    public List<Animals> dynamic(int position){
////        if (data2 == null) {
////            data2 = new ArrayList<>();
////        }
//        if(position==0)
//        {
//            data.add(new Animals(R.mipmap.first, "猫1", "汪"));
//            data.add(new Animals(R.mipmap.second, "猫2", "喵"));
//            data.add(new Animals(R.mipmap.three, "猫3", "唧唧"));
//            data.add(new Animals(R.mipmap.four, "猫4", "喵喵"));
//        }
//        if(position==1)
//        {
//            data.add(new Animals(R.mipmap.first, "狗1", "汪"));
//            data.add(new Animals(R.mipmap.second, "狗2", "喵"));
//            data.add(new Animals(R.mipmap.three, "狗3", "唧唧"));
//            data.add(new Animals(R.mipmap.four, "狗4", "喵喵"));
//        }
//        notifyDataSetChanged();
//        return data2;
//
//    }
}
