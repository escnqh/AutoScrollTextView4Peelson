package com.meitu.qihangni.autoscrolltextviewproject;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        AutoScrollTextView.Builder builder=new AutoScrollTextView.Builder(this,"zxxcvbnmsakndikwqnldwqn111111111111diksnbakdwbak")
                .duration(3)
                .textSize(20)
                .scrollSpeed(3)
                .scrollTime(3);
        AutoScrollTextView autoScrollTextViewFix=builder.build((AutoScrollTextView) findViewById(R.id.attv));


    }
}
