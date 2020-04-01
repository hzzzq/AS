package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;
//import com.lixp.chapter4.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyBaseAdapter extends BaseAdapter{

	private List<User> mData;
	private Context mContext;

	public MyBaseAdapter(List<User> mData, Context mContext) {
		//要装的数据
		this.mData = mData;
		// 初始化布局对象，context要使用当前Adapter的界面对象（当前的控件在哪里）
		this.mContext = mContext;
	}

	@Override
	public int getCount() {
		// 有多少条数据
		return mData.size();
	}

	@Override
	public Object getItem(int position) {
		// 当前数据
		return mData.get(position);
	}

	@Override
	public long getItemId(int position) {
		// 当前数据的位置
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_item,null);
		ImageView imageView1 = (ImageView) view.findViewById(R.id.pic);
		TextView textView2 = (TextView) view.findViewById(R.id.textView2);
		TextView textView4 = (TextView) view.findViewById(R.id.textView4);

		imageView1.setImageResource(mData.get(position).getUrl());
		textView2.setText(mData.get(position).getUsername());
		textView4.setText(Integer.toString(mData.get(position).getAge()));
		return view;
	}
	
	public void add(User data) {
	    if (mData == null) {
	        mData = new ArrayList<>();
	    }
	    mData.add(data);
	    notifyDataSetChanged();
	}
}
