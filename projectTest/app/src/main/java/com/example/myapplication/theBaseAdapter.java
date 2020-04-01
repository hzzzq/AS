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

public class theBaseAdapter extends BaseAdapter {
    //声明虚拟的变量  context为上下文对象  data 为数据
    //context初始化布局对象 context要使用当前adapter的界面对象（当前adater对应控件的位置）
    //在使用时将值与对应变量绑定
            private Context mcontext;
            private List<Heros> mdata;

            //适配器的构造方法 用于在主程序中创建新的adapter对象 以提供给对应数据进行绑定
            public theBaseAdapter(Context mcontext, List<Heros> mdata) {
                this.mcontext = mcontext;
                this.mdata = mdata;
    }

    @Override
            public int getCount() {
                return mdata.size();
            }

            @Override
            public Object getItem(int position) {
                return mdata.get(position);
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view= LayoutInflater.from(mcontext).inflate(R.layout.spinner_item,null);
                final Heros heros=mdata.get(position);
                ImageView imageView1 = (ImageView) view.findViewById(R.id.imageView1);
                TextView textView2 = (TextView) view.findViewById(R.id.textView1);
//                imageView1.setImageResource(heros.getImage());
                textView2.setText(heros.getName());

            return  view;
            }

            public void add(Heros data) {
                if (mdata == null) {
                    mdata = new ArrayList<>();
                }
                mdata.add(data);
                notifyDataSetChanged();
            }

    class Heros{
         String image;
        String name;

        public Heros(String image, String name) {
//            this.image = image;
            this.name = name;
            this.image=image;
        }
        public Heros() { };

        public String getImage() {
            return image;
        }

        public void setImage(String sexImage) {
            this.image = sexImage;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public String toString(){
            return name;
        }
    }
}
