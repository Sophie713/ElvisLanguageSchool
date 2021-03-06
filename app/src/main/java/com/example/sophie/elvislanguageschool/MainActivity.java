package com.example.sophie.elvislanguageschool;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void address(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW);
        map.setData(Uri.parse("geo:50.0581047,14.4301882"));
        if (map.resolveActivity(getPackageManager()) != null) {
        startActivity(map);}
    }

    public void call(View view) {
        Intent call = new Intent(Intent.ACTION_CALL);
        call.setData(Uri.parse("tel:+420602350632"));
        if (call.resolveActivity(getPackageManager()) != null) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                return;
            }
            startActivity(call);}
    }

    public void email(View view){
        Intent email = new Intent(Intent.ACTION_SENDTO);
        email.setData(Uri.parse("mailto:elvis@elvis.cz"));
        if (email.resolveActivity(getPackageManager()) != null) {
        startActivity(email);}
    }

    public void web(View view) {
        Intent web = new Intent(Intent.ACTION_VIEW);
        web.setData(Uri.parse("http://www.elvis.cz/"));
        if (web.resolveActivity(getPackageManager()) != null) {
        startActivity(web);}
    }
}
