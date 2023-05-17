package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.splashvid; // Replace "video_file" with the actual video file name in res/raw directory

// Set the video path or URI
        videoView.setVideoPath(videoPath);

// Start playing the video
        videoView.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i= new Intent(getApplicationContext(),MusicPlayerActivity.class);
                startActivity(i);
            }
        },5000);
    }
}