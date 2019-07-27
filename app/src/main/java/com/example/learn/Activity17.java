package com.example.learn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity17 extends AppCompatActivity implements View.OnClickListener {
    private Button button17;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_17);
        View button117 = findViewById(R.id.imageButton17);
        button117.setOnClickListener(this);
    }
    public void EighteenthActivity(View v) {
        startActivity(new Intent(Activity17.this, Activity18.class));
    }
    @Override
    public void onClick(View v) {
        // Play only one sound at a time
        if(mp != null) mp.release();

        // Find which ImageButton was pressed and take appropriate action

        switch (v.getId()) {

            case R.id.imageButton17:
                //Log.i("Test", "Sheep Button");
                mp = MediaPlayer.create(this, R.raw.deer);
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
