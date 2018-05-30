package com.meitu.qihangni.autoscrolltextview.widger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;


public class AutoScrollTextView extends AppCompatTextView implements Runnable {

    private int mCurrentPosition;
    private boolean mIsStop = false;
    private int mTextWidth;
    private boolean mIsMeasure = false;
    private int mScrollTime = 0;
    private int mScrollSpeed=1;


    public AutoScrollTextView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!mIsMeasure) {
            getTextWidth();
            mIsMeasure=true;
        }
    }

    @Override
    public void destroyDrawingCache() {
        super.destroyDrawingCache();
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        super.setText(text, type);
        startScroll();
    }

    @Override
    public void run() {
        mCurrentPosition-=mScrollSpeed;
        scrollTo(mCurrentPosition,0);
        if (mIsStop){
            return;
        }
        if (getScrollX()<=-(this.getWidth())){
            scrollTo(mTextWidth,0);
            mCurrentPosition=mTextWidth;
        }
        postDelayed(this,10);
    }

    /**
     * 获取文字宽度
     */
    private void getTextWidth() {
        Paint paint = this.getPaint();
        String string = this.getText().toString();
        mTextWidth = (int) paint.measureText(string);
    }

    public void startScroll() {
        mIsStop=false;
        this.removeCallbacks(this);
        post(this);
    }

    public void stopScroll(@Nullable String param) {
        mIsStop = true;
        ScrollStopListener scrollStopListener= (ScrollStopListener) this;
        scrollStopListener.onScrollStop(param);
    }

    public void startFromHead() {
        mCurrentPosition = 0;
        startScroll();
    }

    public interface ScrollStopListener{
        void onScrollStop(@Nullable String param);
    }


}
