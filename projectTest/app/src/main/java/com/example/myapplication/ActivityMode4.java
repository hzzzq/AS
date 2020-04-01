package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityMode4 extends AppCompatActivity {
    private TextView textView;
    private Button button,button2;
    private static final String TAG = ActivityMode4.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode4);
        Log.d("--------------------"+TAG, "---onCreate:");
        textView=findViewById(R.id.textView3);
        textView.setText(TAG+"———onCreate(): TaskId: " + getTaskId() +",  hashCode: " + hashCode());
        button=findViewById(R.id.add_button1);
        button2=findViewById(R.id.add_button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMode4.this,ActivityMode2.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMode4.this,ActivityMode3.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("--------------------"+TAG, "---onStart:");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("--------------------"+TAG, "---onStop:");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("--------------------"+TAG, "---onDestroy:");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("--------------------"+TAG, "---onPause:");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("--------------------"+TAG, "---onResume:");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("--------------------"+TAG, "---onRestart:");
    }
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("--------------------"+TAG, "---onNewIntent:");
    }
}
