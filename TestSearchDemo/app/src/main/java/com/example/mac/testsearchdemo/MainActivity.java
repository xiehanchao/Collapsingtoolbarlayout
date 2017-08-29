package com.example.mac.testsearchdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myfragment);

//        startActivity(new Intent(this,SecondActivity.class));
        FrameLayout id_content = (FrameLayout) findViewById(R.id.id_content);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        myFragment_1 myFragment_1 = new myFragment_1();
        fragmentTransaction.add(R.id.id_content, myFragment_1);
        fragmentTransaction.commit();


//        final TagFlowLayout tagFlowLayout = (TagFlowLayout) findViewById(R.id.id_flowlayout);
//        final List<String> list = new ArrayList<String>();
//        list.add("a");
//        list.add("asdasb");
//        list.add("cdf");
//        list.add("dqasdasdasdasd");
//        final LayoutInflater layoutInflater = getLayoutInflater();
//
//        tagFlowLayout.setAdapter(new TagAdapter<String>(list) {
//            @Override
//            public View getView(FlowLayout parent, int position, String s) {
//                TextView tv = (TextView) layoutInflater.inflate(R.layout.item_search_tv,tagFlowLayout,false);
//                String s1 = list.get(position);
//                tv.setText(s1);
//                return tv;
//            }
//        });
//        tagFlowLayout.setOnTagClickListener(new TagFlowLayout.OnTagClickListener()
//        {
//            @Override
//            public boolean onTagClick(View view, int position, FlowLayout parent)
//            {
//                Toast.makeText(MainActivity.this, list.get(position), Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });

    }


}
