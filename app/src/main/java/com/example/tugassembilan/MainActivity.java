package com.example.tugassembilan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btnshowMaps = findViewById(R.id.btnshowMaps);
        btnshowMaps.setOnClickListener(v -> {
            Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-6.324307,107.169273"));
            map.setPackage("com.google.android.apps.maps");
            startActivity(map);
        });
        findViewById(R.id.btnSetAlarm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil metode untuk mengatur alarm
                setAlarm();
            }
        });
    }
    private void setAlarm() {
        Intent alarm = new Intent(android.provider.AlarmClock.ACTION_SET_ALARM);
        startActivity(alarm);
    }

    public void btnHelloWorld(View view) {
        Intent helloworld = new Intent(MainActivity.this, HelloActivity.class);
        startActivity(helloworld);
    }

    public void btnCount(View view) {
        Intent count = new Intent(MainActivity.this, CountActivity.class);
        startActivity(count);
    }

    public void btnSianida(View view) {
        Intent sianida = new Intent(MainActivity.this, SianidaActivity.class);
        startActivity(sianida);
    }

    public void btnTwoActivity(View view) {
        Intent twoact = new Intent(MainActivity.this, TwoactActivity.class);
        startActivity(twoact);
    }

    public void showMap(Uri geoLocation){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }
    public void btnFragmentActivity(View view) {
        Intent fragact = new Intent(MainActivity.this, com.example.tugassembilan.FragmentActivity.class);
        startActivity(fragact);
    }
}