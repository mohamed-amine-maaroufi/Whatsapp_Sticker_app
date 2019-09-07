package com.example.samplestickerapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MoreAppsActivity extends AddStickerPackActivity implements View.OnClickListener {

    ImageButton app1, app2, app3, app4, app5, app6;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_apps);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.title_activity_more_apps);
        }

        app1 = findViewById(R.id.app1);
        app2 = findViewById(R.id.app2);
        app3 = findViewById(R.id.app3);
        app4 = findViewById(R.id.app4);
        app5 = findViewById(R.id.app5);
        app6 = findViewById(R.id.app6);

        app1.setOnClickListener(this);
        app2.setOnClickListener(this);
        app3.setOnClickListener(this);
        app4.setOnClickListener(this);
        app5.setOnClickListener(this);
        app6.setOnClickListener(this);

        //Admob banner ads
        MobileAds.initialize(this,getString(R.string.appIDAdmob));
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    @Override
    public void onBackPressed() {

        finishAffinity();
        finish();

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.app1){
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.androidApplication.allah.adiia"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }else if(v.getId() == R.id.app2){
            Uri uri = Uri.parse("https://play.google.com"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        else if(v.getId() == R.id.app3){
            Uri uri = Uri.parse("https://play.google.com"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        else if(v.getId() == R.id.app4){
            Uri uri = Uri.parse("https://play.google.com"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        else if(v.getId() == R.id.app5){
            Uri uri = Uri.parse("https://play.google.com"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
        else if(v.getId() == R.id.app6){
            Uri uri = Uri.parse("https://play.google.com"); // missing 'http://' will cause crashed
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }

    }
}
