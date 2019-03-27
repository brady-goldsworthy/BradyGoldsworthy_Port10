package com.example.portfolio10;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button ukeBTN, drumBTN;
    private MediaPlayer ukeMP, drumMP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ukeBTN = findViewById(R.id.ukeButton);
        drumBTN = findViewById(R.id.drumButton);

        ukeMP = new MediaPlayer();
        ukeMP = MediaPlayer.create(this, R.raw.ukulele);

        drumMP = new MediaPlayer();
        drumMP = MediaPlayer.create(this, R.raw.drums);

    } //end onCreate

    public void playUke(View view) {
        if (ukeMP.isPlaying()) {
            ukeMP.pause();

            //change button label
            ukeBTN.setText("Play Ukulele");
        }
        else {
            if (drumMP.isPlaying()) {
                drumMP.pause();

                drumBTN.setText("Play Drums");
            }
            //play uke
                ukeMP.start();

                ukeBTN.setText("Pause");
        }
    }

    public void playDrums(View view) {
        if (drumMP.isPlaying()) {
            drumMP.pause();

            //change button label
            drumBTN.setText("Play Drums");
        }
        else {
            if (ukeMP.isPlaying()) {
                ukeMP.pause();

                ukeBTN.setText("Play Ukulele");
            }
            //play drums
            drumMP.start();

            drumBTN.setText("Pause");
        }
    }

}
