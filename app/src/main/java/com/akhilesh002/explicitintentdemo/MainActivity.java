package com.akhilesh002.explicitintentdemo;

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

    public void callSecondActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("Value1", "ABCDEFGHI");
        intent.putExtra("Value2", "1234567890");
        // Set the request code to any code you like, you can identify the
        // callback via this code
        startActivity(intent);
    }
}
