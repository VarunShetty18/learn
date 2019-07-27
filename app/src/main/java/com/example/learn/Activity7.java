package com.example.learn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity7 extends AppCompatActivity implements View.OnClickListener {
    private Button button7;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
        View button107 = findViewById(R.id.imageButton7);
        button107.setOnClickListener(this);
    }

    public void EigthActivity(View v) {
        startActivity(new Intent(Activity7.this, Activity8.class));
    }
    @Override
    public void onClick(View v) {
        // Play only one sound at a time
        if(mp != null) mp.release();

        // Find which ImageButton was pressed and take appropriate action

        switch (v.getId()) {

            case R.id.imageButton7:
                //Log.i("Test", "Sheep Button");
                mp = MediaPlayer.create(this, R.raw.elephant);
                break;
        }
        mp.seekTo(0);
        mp.start();
    }

    @Override
    public void onPause() {
        super.onPause();
        // Release the MediaPlayer if going into background if it isn't null
        if(mp != null) mp.release();
    }
}