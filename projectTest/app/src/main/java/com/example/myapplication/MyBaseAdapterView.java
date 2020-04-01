package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;
//import com.lixp.chapter4.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MyBaseAdapterView extends Activity implements OnItemClickListener {
	private List<User> mData = null;
	private Context mContext;
	private MyBaseAdapter mAdapter = null;
	private ListView list_View;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mybaseadapter);
		list_View = (ListView) findViewById(R.id.base_listView1);
		mContext = this;
		mData = new ArrayList<User>();
		mData.add(new User("zhangsan1", 11, R.mipmap.first));
		mData.add(new User("zhangsan2", 22, R.mipmap.second));
		mData.add(new User("zhangsan3", 33, R.mipmap.three));
		mData.add(new User("zhangsan4", 44, R.mipmap.four));
		mAdapter = new MyBaseAdapter(mData, mContext);
		list_View.setAdapter(mAdapter);
		list_View.setOnItemClickListener(this);
	}

	static int i;

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.add_button1:
			mAdapter.add(new User("zhangsan4", i, R.drawable.ic_launcher_foreground));
			i++;
			break;
		default:
			break;
		}
	}

	@SuppressLint("WrongConstant")
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		/**
		 * Parent：适配器控件，就是发生事件的ListView； 
		 * View：适配器内部的控件，被点击或选择的Item子项；
		 * Position：子项的位置；
		 * Id：子项的ID号。
		 * 
		 */
		TextView textView = (TextView) view.findViewById(R.id.textView2);
		//String string = list_View.getItemAtPosition(position)+"";
		Toast.makeText(this, textView.getText().toString(), 2000).show();
		//Toast.makeText(this, string, 2000).show();
	}

	
}
