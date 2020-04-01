package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Myspinner_activity extends AppCompatActivity {

    private List<Animals> data,data2,data3 = null;
    private Context mContext;
    private MybaseAdapterdemo mAdapter,adapter1,adapter2 = null;
    private Spinner spinner,spinner2;
//    private AlertDialog alert = null;
//    private AlertDialog.Builder builder = null;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myspinner_activity);
        spinner = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        button=(Button)findViewById(R.id.button);
        mContext = this;

        data = new ArrayList<Animals>();
        data.add(new Animals(R.mipmap.dog, "狗", "汪"));
        data.add(new Animals(R.mipmap.cat, "猫", "喵"));

        data2 = new ArrayList<Animals>();
        data2.add(new Animals(R.mipmap.dog1, "阿拉斯加", "汪"));
        data2.add(new Animals(R.mipmap.dog2, "哈士奇", "汪"));
        data2.add(new Animals(R.mipmap.dog3, "柴犬", "汪"));
        data2.add(new Animals(R.mipmap.dog4, "柯基", "汪"));
        data2.add(new Animals(R.mipmap.dog5, "萨摩耶", "汪"));
        data2.add(new Animals(R.mipmap.dog6, "博美", "汪"));


        data3 = new ArrayList<Animals>();
        data3.add(new Animals(R.mipmap.cat1, "苏格兰折耳猫", "喵"));
        data3.add(new Animals(R.mipmap.cat2, "波斯猫", "喵"));
        data3.add(new Animals(R.mipmap.cat3, "布偶猫", "喵"));
        data3.add(new Animals(R.mipmap.cat4, "美国短毛猫", "喵"));
        data3.add(new Animals(R.mipmap.cat5, "英国短毛猫", "喵"));
        data3.add(new Animals(R.mipmap.cat6, "金吉拉猫", "喵"));


        mAdapter = new MybaseAdapterdemo(data, mContext);
        adapter1=new MybaseAdapterdemo(data2,mContext);
        adapter2=new MybaseAdapterdemo(data3,mContext);
        spinner.setAdapter(mAdapter);
        spinner.setOnItemSelectedListener(new SpinnerSelectListener());
        button.setOnClickListener(new clickListener());

    }


    private class SpinnerSelectListener implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                spinner2.setAdapter(adapter1);
                break;
            case 1:
                spinner2.setAdapter(adapter2);
                break;
                }
//            Toast.makeText(Myspinner_activity.this,"选择了控件"+position,Toast.LENGTH_SHORT).show();
        }
        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }

    private class clickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder builder =new AlertDialog.Builder(Myspinner_activity.this)
                    .setTitle("宠物领养")
                    .setIcon(R.mipmap.zero)
                    .setMessage("确认要进行领养吗？");
                    setPositiveButton(builder);
                    setNegativeButton(builder)
                    .create()
                    .show();

        }
    }
    public AlertDialog.Builder setPositiveButton(AlertDialog.Builder builder) {
        return  builder.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(mContext, "恭喜您，成功领养", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public AlertDialog.Builder setNegativeButton(AlertDialog.Builder builder) {
        return  builder.setNegativeButton("取消",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mContext, "真遗憾，您取消了领养", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}


