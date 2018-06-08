package com.meitu.qihangni.autoscrolltextviewproject;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * @author nqh 2018/5/31
 */
public class BActivity extends AppCompatActivity {

    private Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setContentView(R.layout.activity_b);
        AutoScrollTextView autoScrollTextView = (AutoScrollTextView) findViewById(R.id.astv_b);
        autoScrollTextView.setScrollSpeed(4);
        autoScrollTextView.setScrollTime(20);
        autoScrollTextView.setText("11111111111111111111111111111111111111111111111111111111111111111111111111111");
        autoScrollTextView.setOnScrollStopListener(new AutoScrollTextView.OnScrollStopListener() {
            @Override
            public void onScrollStop(@Nullable String param) {
                Toast.makeText(mContext,"done!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
