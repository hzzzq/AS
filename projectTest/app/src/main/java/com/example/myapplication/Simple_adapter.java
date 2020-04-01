package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simple_adapter extends AppCompatActivity {

    private ListView listView;
    private SimpleAdapter simple_adapter;
    private List<Map<String, Object>> dataList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);

        listView=(ListView) findViewById(R.id.listView);
        dataList=new ArrayList< Map<String, Object>>();

        //适配器设置
        simple_adapter=new SimpleAdapter(this, getData(), R.layout.adapter_item, new
                String[] {"pic","text"}, new int[] {R.id.pic,R.id.textView2});

        //启用适配器
        listView.setAdapter(simple_adapter);

    }

    //	设置数据源
    private List<Map<String, Object>> getData() {
        for(int i=0;i<8;i++) {
            Map map=new HashMap<String, Object>();
            map.put("pic", R.mipmap.three);
            map.put("text", "呲你"+i);
            dataList.add(map);
        }

        for (int j=0;j<8;j++){
            Map map1=new HashMap<String,Object>();
            map1.put("pic",R.mipmap.four);
            map1.put("text","呲回去"+j);
            dataList.add(map1);
        }


        return dataList;


    }
}
