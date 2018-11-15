package com.github.lelouchhe.intentchallenge;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivMood, ivPhone, ivWeb, ivLocation;
    Button btnCreate;
    final int CREATE_CONTACT_ACTIVITY = 1;

    String mood, phone, web, location;

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

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phone));
                MainActivity.this.startActivity(intent);
            }
        });

        this.ivWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + web));
                MainActivity.this.startActivity(intent);

            }
        });

        this.ivLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0.0?q=" + location));
                MainActivity.this.startActivity(intent);

            }
        });

        this.btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CreateContactActivity.class);
                MainActivity.this.startActivityForResult(intent, CREATE_CONTACT_ACTIVITY);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode != CREATE_CONTACT_ACTIVITY || resultCode != RESULT_OK) {
            return;
        }

        this.ivMood.setVisibility(View.VISIBLE);
        this.ivPhone.setVisibility(View.VISIBLE);
        this.ivWeb.setVisibility(View.VISIBLE);
        this.ivLocation.setVisibility(View.VISIBLE);

        mood = data.getStringExtra("mood");
        phone = data.getStringExtra("phone");
        web = data.getStringExtra("web");
        location = data.getStringExtra("location");

        switch (mood) {
            case "sad":
                this.ivMood.setImageResource(R.drawable.sad);
                break;

            case "neutral":
                this.ivMood.setImageResource(R.drawable.neutral);
                break;

            case "happy":
                this.ivMood.setImageResource(R.drawable.happy);
                break;

            default:
                return;
        }
    }
}
