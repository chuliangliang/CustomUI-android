package com.customui.chuliangliang.customui;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_layout);

        ActionBar bar = getSupportActionBar();
        if (bar != null)
        {
            bar.hide();
        }

        NavigationLayout navBar = (NavigationLayout)findViewById(R.id.nav_bar);
        navBar.hideToLeftButton();


        Button btn = (Button)findViewById(R.id.button_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeActivity.this,ListViewActivity.class);
                startActivity(intent);
            }
        });

        Button cBtn = (Button)findViewById(R.id.button_2);
        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,CustomActivity.class);
                startActivity(intent);
            }
        });
    }
}
