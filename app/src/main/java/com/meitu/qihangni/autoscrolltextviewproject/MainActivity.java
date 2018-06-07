package com.meitu.qihangni.autoscrolltextviewproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();
    private Context mContext;
    private AutoScrollTextView astv_1;
    private AutoScrollTextView astv_2;
    private AutoScrollTextView astv_3;
    private TextView tv_sample;
    private Button btn_start;
    private Button btn_stop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        initView();


    }

    private void initView() {
        astv_1 = (AutoScrollTextView) findViewById(R.id.astv_1);
        astv_2 = (AutoScrollTextView) findViewById(R.id.astv_2);
        astv_3 = (AutoScrollTextView) findViewById(R.id.astv_3);
        tv_sample = (TextView) findViewById(R.id.tv_sample);
        btn_start = (Button) findViewById(R.id.btn_start);
        btn_stop = (Button) findViewById(R.id.btn_stop);

        astv_1.setScrollTime(2);
        astv_2.setScrollTime(3);
        astv_3.setScrollTime(4);

        astv_1.setScrollSpeed(5);
        astv_2.setScrollSpeed(-3);
        astv_3.setScrollSpeed(3);

        tv_sample.setSelected(true);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                astv_1.startScroll();
                astv_2.reStartScroll();
                astv_3.startScroll();
            }
        });

        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                astv_1.stopScroll(null);
                astv_2.stopScroll(null);
                astv_3.stopScroll(null);
            }
        });

        astv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"astv_1 click");
                Intent intent=new Intent(MainActivity.this,BActivity.class);
                startActivity(intent);
            }
        });

    }
}
