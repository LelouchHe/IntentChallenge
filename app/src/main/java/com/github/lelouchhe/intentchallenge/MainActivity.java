package com.github.lelouchhe.intentchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivMood, ivPhone, ivWeb, ivLocation;
    Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        this.ivMood = this.findViewById(R.id.ivMood);
        this.ivPhone = this.findViewById(R.id.ivPhone);
        this.ivWeb = this.findViewById(R.id.ivWeb);
        this.ivLocation = this.findViewById(R.id.ivLocation);
        this.btnCreate = this.findViewById(R.id.btnCreate);

        this.ivMood.setVisibility(View.GONE);
        this.ivPhone.setVisibility(View.GONE);
        this.ivWeb.setVisibility(View.GONE);
        this.ivLocation.setVisibility(View.GONE);

        this.ivPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        this.ivWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        this.ivLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        this.btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
