package com.example.mac.testsearchdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Yaoyan on 2017/8/30.
 */

public class test2Fragment extends Fragment {

    private myListView myListView;
    private ArrayList<String> list = new ArrayList<>();
    private LinearLayout view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view!=null){
            return view;
        }
        view = (LinearLayout) inflater.inflate(R.layout.context_text, null, false);
        setView(view);
        return view;
    }

    public void setView(LinearLayout view) {
        myListView = (myListView) view.findViewById(R.id.lv);
        for (int a = 0; a < 30; a++) {
            list.add(String.valueOf(a));
        }
        myListView.setAdapter(new test2Fragment.myAdaoter());
    }

    class myAdaoter extends BaseAdapter {

        private LayoutInflater layoutInflater;

        public myAdaoter() {
            layoutInflater = test2Fragment.this.getActivity().getLayoutInflater();

        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View inflate = layoutInflater.inflate(R.layout.tv, null);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_text);
            textView.setText(list.get(position));

            return textView;
        }
    }
}
