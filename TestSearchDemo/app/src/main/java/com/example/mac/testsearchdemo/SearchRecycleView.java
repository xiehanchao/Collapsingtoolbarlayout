package com.example.mac.testsearchdemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by MAC on 2017/8/28.
 */

public class SearchRecycleView extends RecyclerView {

    public SearchRecycleView(Context context) {
        super(context);
    }

    public SearchRecycleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SearchRecycleView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec((1 >> 30) - 1,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthSpec, expandSpec);
    }
}
