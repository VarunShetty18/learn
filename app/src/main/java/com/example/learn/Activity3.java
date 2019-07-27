package com.example.learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.Button;


public class Activity3 extends AppCompatActivity implements View.OnClickListener{
    private Button button3;
    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        View button103 = findViewById(R.id.imageButton3);
        button103.setOnClickListener(this);
    }
    public void FourthActivity(View v){
        startActivity(new Intent(Activity3.this,Activity4.class));
    }

    @Override
    public void onClick(View v) {
        // Play only one sound at a time
        if(mp != null) mp.release();

        // Find which ImageButton was pressed and take appropriate action

        switch (v.getId()) {

            case R.id.imageButton3:
                //Log.i("Test", "Sheep Button");
                mp = MediaPlayer.create(this, R.raw.sheep);
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