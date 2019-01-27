package com.example.alvin.jobb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Companies extends AppCompatActivity {
    Button btnHootsuite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companies);
        btnHootsuite = (Button)findViewById(R.id.btnHootsuite);
        btnHootsuite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Hootsuite = new Intent(Companies.this, EnterInfo.class);
                startActivity(Hootsuite);
            }
        });
    }
}
