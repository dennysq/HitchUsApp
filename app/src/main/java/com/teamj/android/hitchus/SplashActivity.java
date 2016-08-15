package com.teamj.android.hitchus;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pl.bclogic.pulsator4droid.library.PulsatorLayout;

public class SplashActivity extends AppCompatActivity {

    /**
     * Duration of wait
     **/
    private final int SPLASH_DISPLAY_LENGTH = 4000;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        PulsatorLayout pulsator = (PulsatorLayout) findViewById(R.id.pulsator);
        pulsator.start();
        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashActivity.this, StartActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

}
