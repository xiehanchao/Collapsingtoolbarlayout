package com.example.mac.testsearchdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by MAC on 2017/8/29.
 */

public class PageFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;
    private myListView myListView;
    private LinearLayout view;
    private ArrayList<String> list = new ArrayList<>();
    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment pageFragment = new PageFragment();
        pageFragment.setArguments(args);
        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println("this = " + this);
        view = (LinearLayout) inflater.inflate(R.layout.context_text, null, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        myListView = (myListView) view.findViewById(R.id.lv);
        for (int a = 0; a < 30; a++) {
            list.add(String.valueOf(a));
        }
        myListView.setAdapter(new myAdaoter());
        super.onActivityCreated(savedInstanceState);

    }

    class myAdaoter extends BaseAdapter {

        private LayoutInflater layoutInflater;

        public myAdaoter() {
            layoutInflater = PageFragment.this.getActivity().getLayoutInflater();

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
