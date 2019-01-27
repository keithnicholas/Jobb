package com.example.alvin.jobb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WhatFieldAreYouIn extends AppCompatActivity {
    private Button btnNextPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_field_are_you_in);
        btnNextPage = (Button)findViewById(R.id.btnNextPage);
        btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(WhatFieldAreYouIn.this, WhenCanYouStartWork.class);
                startActivity(nextPage);
            }
        });
    }
}
