package com.example.learn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity14 extends AppCompatActivity implements View.OnClickListener  {
    private Button button14;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_14);
        View button114 = findViewById(R.id.imageButton14);
        button114.setOnClickListener(this);
    }
    public void FifteenthActivity(View v) {
        startActivity(new Intent(Activity14.this, Activity15.class));
    }
    @Override
    public void onClick(View v) {
        // Play only one sound at a time
        if(mp != null) mp.release();

        // Find which ImageButton was pressed and take appropriate action

        switch (v.getId()) {

            case R.id.imageButton14:
                //Log.i("Test", "Sheep Button");
                mp = MediaPlayer.create(this, R.raw.snake);
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
