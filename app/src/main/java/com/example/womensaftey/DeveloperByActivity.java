package com.example.womensaftey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class DeveloperByActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_by);


    }
    public void Dan(View v){
        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://https://www.linkedin.com/in/shashi-kumar-362226236//"));
        startActivity(implicit);
    }
}