package com.github.lelouchhe.intentchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class CreateContactActivity extends AppCompatActivity implements View.OnClickListener {

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

        this.ivSad.setOnClickListener(this);
        this.ivNeutral.setOnClickListener(this);
        this.ivHappy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name = this.etName.getText().toString().trim();
        String phone = this.etPhone.getText().toString().trim();
        String web = this.etWeb.getText().toString().trim();
        String location = this.etLocation.getText().toString().trim();

        if (name.isEmpty() || phone.isEmpty() || web.isEmpty() || location.isEmpty()) {
            Toast.makeText(this, "fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        String mood;

        switch (v.getId()) {
            case R.id.ivSad:
                mood = "sad";
                break;

            case R.id.ivNeutral:
                mood = "neutral";
                break;

            case R.id.ivHappy:
                mood = "happy";
                break;

            default:
                Toast.makeText(this, "mood doesn't exist", Toast.LENGTH_SHORT).show();
                return;
        }

        Intent intent = new Intent();
        intent.putExtra("name", name);
        intent.putExtra("phone", phone);
        intent.putExtra("web", web);
        intent.putExtra("location", location);
        intent.putExtra("mood", mood);

        this.setResult(RESULT_OK, intent);
        this.finish();
    }
}
