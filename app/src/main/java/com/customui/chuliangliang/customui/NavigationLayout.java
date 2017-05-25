package com.customui.chuliangliang.customui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by chuliangliang on 2017/5/24.
 */

public class NavigationLayout extends LinearLayout {
    public NavigationLayout(Context ctx, AttributeSet attrs)
    {
        super(ctx,attrs);
        LayoutInflater.from(ctx).inflate(R.layout.navigation,this);

        Button leftButton = (Button)findViewById(R.id.button_nav_left);
        Button rightButton = (Button)findViewById(R.id.button_nav_right);

        leftButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });

        rightButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "点击右侧按钮了 ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void hideToLeftButton()
    {
        Button leftButton = (Button)findViewById(R.id.button_nav_left);
        leftButton.setVisibility(View.INVISIBLE);
    }
}
