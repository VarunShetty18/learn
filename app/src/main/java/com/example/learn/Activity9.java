package com.example.learn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity9 extends AppCompatActivity implements View.OnClickListener{
    private Button button9;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);
        View button109 = findViewById(R.id.imageButton9);
        button109.setOnClickListener(this);
    }
    public void TenthActivity(View v) {
        startActivity(new Intent(Activity9.this, Activity10.class));
    }

    @Override
    public void onClick(View v) {
        // Play only one sound at a time
        if(mp != null) mp.release();

        // Find which ImageButton was pressed and take appropriate action

        switch (v.getId()) {

            case R.id.imageButton9:
                //Log.i("Test", "Sheep Button");
                mp = MediaPlayer.create(this, R.raw.wolf);
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
