package com.example.yazan.deskleds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void colorOnclickListner(View view) {
        Intent intent = new Intent(MainActivity.this,Colors.class);
        startActivity(intent);
    }
}