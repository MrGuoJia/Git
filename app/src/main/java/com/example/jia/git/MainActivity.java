package com.example.jia.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sun.corba.se.impl.oa.toa.TOA;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Toast.makeText(this,"another_toast", Toast.LENGTH_LONG).show();
    }

    private void initView() {
    }
}
