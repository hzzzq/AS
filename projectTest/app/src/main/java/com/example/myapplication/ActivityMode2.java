package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityMode2 extends AppCompatActivity {
private Button button,button2;
private TextView textView;
    private static final String TAG = ActivityMode2.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode2);
        Log.d("--------------------"+TAG, "---onCreate:");
        button=findViewById(R.id.add_button1);
        button2=findViewById(R.id.add_button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMode2.this,ActivityMode2.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMode2.this,ActivityMode3.class);
                startActivity(intent);
            }
        });
        textView=findViewById(R.id.textView3);
        textView.setText(TAG+"———onCreate(): TaskId: " + getTaskId() +",  hashCode: " + hashCode());
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
