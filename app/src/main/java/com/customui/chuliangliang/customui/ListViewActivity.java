package com.customui.chuliangliang.customui;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class ListViewActivity extends AppCompatActivity {
    private String[] dataArray = {"1234","dsda","eazduriof","哈哈哈", "第一个字符", "把安静的啦",
            "u9wrjwejrleiw", "啊多瘦返回空i","dghjklj","34423","uwoqu","话电话","百度","123456789","腾讯","阿里是是是","你后方可","多少积分看电视"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_layout);

        ActionBar bar = getSupportActionBar();
        if (bar != null)
        {
            bar.hide();
        }

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(ListViewActivity.this,android.R.layout.simple_list_item_1,dataArray);
        ListView listView = (ListView) findViewById(R.id.list_1);
        listView.setAdapter(adapter);
    }
}
