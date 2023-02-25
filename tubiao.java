package com.example.daka;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;

public class tubiao extends MainActivity {

    private TextView tv1;
    Drawable icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_mainlv_top);
        tv1 = findViewById(R.id.item_mainlv_top_tv4);
        icon = getResources().getDrawable(R.drawable.shujumianban);
        icon.setBounds(0, 0, 20, 20);
        tv1.setCompoundDrawables(icon, null, null, null);
    }
}