package com.customui.chuliangliang.customui;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CustomActivity extends AppCompatActivity {

    //列表数据源 <数组>
    private List<DataModel> dataObjects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        ActionBar bar = getSupportActionBar();
        if (bar != null)
        {
            bar.hide();
        }
        initDataObjects();
        DataModelAdapter adapter = new DataModelAdapter(CustomActivity.this,R.layout.data_list_item,dataObjects);
        ListView listView = (ListView)findViewById(R.id.custom_list_1);
        listView.setAdapter(adapter);

        //添加点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DataModel dataModel = dataObjects.get(position);
                Toast.makeText(CustomActivity.this, dataModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    //构造数据模型
    private void initDataObjects()
    {

        for (int i = 0; i < 2 ; i++)
        {
            DataModel dataModel_pg = new DataModel("苹果",R.drawable.pg);
            dataObjects.add(dataModel_pg);

            DataModel dataModel_cm = new DataModel("草莓",R.drawable.cm);
            dataObjects.add(dataModel_cm);

            DataModel dataModel_cz = new DataModel("橙子",R.drawable.cz);
            dataObjects.add(dataModel_cz);

            DataModel dataModel_pt = new DataModel("葡萄",R.drawable.pt);
            dataObjects.add(dataModel_pt);

            DataModel dataModel_xj = new DataModel("香蕉",R.drawable.xj);
            dataObjects.add(dataModel_xj);

            DataModel dataModel_yt = new DataModel("樱桃",R.drawable.yt);
            dataObjects.add(dataModel_yt);
        }
    }
}
