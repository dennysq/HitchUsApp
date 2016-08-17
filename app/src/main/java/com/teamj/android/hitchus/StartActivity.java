package com.teamj.android.hitchus;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chyrta.onboarder.OnboarderActivity;
import com.chyrta.onboarder.OnboarderPage;

import java.util.ArrayList;
import java.util.List;

public class StartActivity extends OnboarderActivity {

    List<OnboarderPage> onboarderPages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_start);
        onboarderPages = new ArrayList<OnboarderPage>();

        // Create your first page
        OnboarderPage onboarderPage1 = new OnboarderPage("Hitches", "Tus Hitches son personas con tus mismos intereses y gustos con los que podrás encontrarte.",R.drawable.ic_favorite);
        OnboarderPage onboarderPage2 = new OnboarderPage("HitChats", "Cuadra tu encuentro en 3 mensajes y lo mejor de todo ¡Ninguna evidencia quedará!",R.drawable.ic_message);
        OnboarderPage onboarderPage3 = new OnboarderPage("HitchUs Premium", "Suscripciones PREMIUM para una cuenta más segura y con más beneficios.",R.drawable.ic_recent_actors);

        // You can define title and description colors (by default white)
        onboarderPage1.setTitleColor(R.color.white);
        onboarderPage1.setDescriptionColor(R.color.white);
        onboarderPage1.setBackgroundColor(R.color.colorPrimaryHitchUs);

        onboarderPage2.setTitleColor(R.color.colorPrimaryHitchUs);
        onboarderPage2.setDescriptionColor(R.color.colorTextHitchUs);
        onboarderPage2.setBackgroundColor(R.color.white);

        onboarderPage3.setTitleColor(R.color.white);
        onboarderPage3.setDescriptionColor(R.color.white);
        onboarderPage3.setBackgroundColor(R.color.colorPrimaryHitchUs);

        // Don't forget to set background color for your page


        // Add your pages to the list
        onboarderPages.add(onboarderPage1);
        onboarderPages.add(onboarderPage2);
        onboarderPages.add(onboarderPage3);

        // And pass your pages to 'setOnboardPagesReady' method
        setOnboardPagesReady(onboarderPages);
    }

    @Override
    public void onFinishButtonPressed() {
          /* Create an Intent that will start the Menu-Activity. */
        Intent intent = new Intent(StartActivity.this, LoginActivity.class);
        StartActivity.this.startActivity(intent);
        StartActivity.this.finish();

    }

    @Override
    protected void onSkipButtonPressed() {
        super.onSkipButtonPressed();
        Intent intent = new Intent(StartActivity.this, LoginActivity.class);
        StartActivity.this.startActivity(intent);
        StartActivity.this.finish();
    }
}
