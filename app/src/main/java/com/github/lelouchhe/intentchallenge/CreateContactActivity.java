package com.github.lelouchhe.intentchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class CreateContactActivity extends AppCompatActivity {

    EditText etName, etPhone, etWeb, etLocation;
    ImageView ivSad, ivNeutral, ivHappy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_contact_activity);

        this.etName = this.findViewById(R.id.etName);
        this.etPhone = this.findViewById(R.id.etPhone);
        this.etWeb = this.findViewById(R.id.etWeb);
        this.etLocation = this.findViewById(R.id.etLocation);

        this.ivSad = this.findViewById(R.id.ivSad);
        this.ivNeutral = this.findViewById(R.id.ivNeutral);
        this.ivHappy = this.findViewById(R.id.ivHappy);

        this.ivSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        this.ivNeutral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        this.ivHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
