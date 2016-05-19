package com.hfad.joke;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;

public class MusicService extends IntentService {



    public MusicService() {
        super("MusicService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.society); //try with this
        mediaPlayer.start();
        synchronized (this) {
            try {
                wait(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        mediaPlayer.stop();
    }


}