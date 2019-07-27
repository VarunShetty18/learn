package com.example.learn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        View button100 = findViewById(R.id.imageButton);
        button100.setOnClickListener(this);
}

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {


        // Play only one sound at a time
        if(mp != null) mp.release();

                // Find which ImageButton was pressed and take appropriate action

                switch (v.getId()) {

                // The cow button
                case R.id.imageButton:
                //Log.i("Test", "Cow Button");
                mp = MediaPlayer.create(this, R.raw.cow);
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