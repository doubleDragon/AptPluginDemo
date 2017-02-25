package com.wsl.demo.aptdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }

    private void test() {
        Log.d("debug", new PersonBean("Septenary", "ShangHai").toString());
        Log.d("debug", new CompanyBean("XMX", "XinDong.RD").toString());
    }
}
