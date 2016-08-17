package com.teamj.android.hitchus;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

                Intent mainIntent = new Intent(SplashActivity.this, displayActivityFilterByPreferences());
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

    public Class displayActivityFilterByPreferences() {
        String userLogged;
        String passwordLogged;
        SharedPreferences settings;
        // Restore or Initialize preferences
        settings = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        userLogged = settings.getString(getString(R.string.user_logged),getString(R.string.prf_user_logged));
        passwordLogged = settings.getString(getString(R.string.password_logged),getString(R.string.prf_password_logged));
        if (userLogged.equals(getString(R.string.prf_user_logged)) && passwordLogged.equals(R.string.prf_password_logged)) {
            return StartActivity.class;
        } else {
            return LoginActivity.class;
        }
    }

}
