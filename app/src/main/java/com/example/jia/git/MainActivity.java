package com.example.jia.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();/*不要在我这里写东西*/
        Toast.makeText(this,"",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"3",Toast.LENGTH_LONG).show();
    }

    private void initView() {
    }
}
