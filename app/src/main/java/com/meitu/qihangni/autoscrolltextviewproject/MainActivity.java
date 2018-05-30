package com.meitu.qihangni.autoscrolltextviewproject;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        AutoScrollTextView autoScrollTextView1 = (AutoScrollTextView) findViewById(R.id.astv_test1);
        autoScrollTextView1.setText("ceshiceshi11111");
        autoScrollTextView1.setScrollSpeed(3);
        autoScrollTextView1.setScrollTime(3);
        autoScrollTextView1.setFreshWhenStop();
        autoScrollTextView1.setOnScrollStopListener(new AutoScrollTextView.OnScrollStopListener() {
            @Override
            public void onScrollStop(@Nullable String param) {
                Toast.makeText(context, "test1 Stop!", Toast.LENGTH_SHORT).show();
            }
        });

        AutoScrollTextView autoScrollTextView2= (AutoScrollTextView) findViewById(R.id.astv_test2);
//        autoScrollTextView2.setText("lalalallala22222");
//        autoScrollTextView2.setScrollSpeed(-1);
//        autoScrollTextView2.setScrollTime(4);
//        autoScrollTextView2.setOnScrollStopListener(new AutoScrollTextView.OnScrollStopListener() {
//            @Override
//            public void onScrollStop(@Nullable String param) {
//                Toast.makeText(context, "test2 Stop!", Toast.LENGTH_SHORT).show();
//        }
//        });
    }
}
