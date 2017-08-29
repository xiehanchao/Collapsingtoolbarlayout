package com.example.mac.testsearchdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by Yaoyan on 2017/8/30.
 */

public class myRecyclerView extends RecyclerView {

    public myRecyclerView(Context context) {
        super(context);
    }

    public myRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public myRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int eee = MeasureSpec.makeMeasureSpec((1 << 30) - 1, MeasureSpec.AT_MOST);
        super.onMeasure(widthSpec, eee);
    }
}
