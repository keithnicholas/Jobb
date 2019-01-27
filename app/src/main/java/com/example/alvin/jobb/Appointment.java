package com.example.alvin.jobb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Appointment extends AppCompatActivity {
    ImageButton btnMor;
    ImageButton btnWed;
    ImageButton btnFri;
    ImageButton btnConfirm;

    public void enableAll(){
        btnMor.setEnabled(true);
        btnMor.setAlpha(1.0f);
        btnWed.setEnabled(true);
        btnWed.setAlpha(1.0f);
        btnFri.setEnabled(true);
        btnFri.setAlpha(1.0f);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        btnMor = (ImageButton)findViewById(R.id.btnMor);
        btnMor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableAll();
                btnMor.setEnabled(false);
                btnMor.setAlpha(0.5f);
            }
        });
        btnWed = (ImageButton)findViewById(R.id.btnWed);
        btnWed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableAll();
                btnWed.setEnabled(false);
                btnWed.setAlpha(0.5f);
            }
        });
        btnFri = (ImageButton)findViewById(R.id.btnFri);
        btnFri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableAll();
                btnFri.setEnabled(false);
                btnFri.setAlpha(0.5f);
            }
        });
        btnConfirm = (ImageButton)findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
