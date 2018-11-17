package com.example.saksh.bookme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Activity2 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void go_back(View view){
        Intent intent = new Intent(Activity2.this, MainActivity.class);
        startActivity(intent);
    }
}
