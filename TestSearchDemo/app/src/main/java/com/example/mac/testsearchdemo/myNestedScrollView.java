package com.example.mac.testsearchdemo;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;

/**
 * Created by MAC on 2017/8/29.
 */

public class myNestedScrollView extends NestedScrollView {

    public myNestedScrollView(Context context) {
        super(context);
    }

    public myNestedScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public myNestedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = MeasureSpec.getSize(heightMeasureSpec);
        System.out.println("size = " + size);
        int eee = MeasureSpec.makeMeasureSpec((1<<30)-1, MeasureSpec.EXACTLY);

        super.onMeasure(widthMeasureSpec, eee);
    }


}
