package com.teamj.android.hitchus;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.pavelsikun.seekbarpreference.PersistValueListener;
import com.pavelsikun.seekbarpreference.SeekBarPreference;
import com.pavelsikun.seekbarpreference.SeekBarPreferenceView;

import io.apptik.widget.MultiSlider;

public class SettingsActivity extends AppCompatActivity {


    //Attributes
    private CheckBox chkMale;
    private CheckBox chkFemale;
    private CheckBox chkOther;
    private CheckBox chkAll;
    private TextView txtMinAge;
    private TextView txtMaxAge;
    private MultiSlider mslRangeAge;
    private SeekBarPreferenceView sbHitchLevel;
    private SeekBarPreferenceView sbDistance;

    private SharedPreferences settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        initialize();
        mslRangeAge.setOnThumbValueChangeListener(new MultiSlider.OnThumbValueChangeListener() {
            @Override
            public void onValueChanged(MultiSlider multiSlider, MultiSlider.Thumb thumb, int thumbIndex, int value) {
                if (thumbIndex == 0) {
                    txtMinAge.setText(String.valueOf(value));
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putInt(getString(R.string.min_age),value);
                    editor.commit();
                } else {
                    txtMaxAge.setText(String.valueOf(value));
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putInt(getString(R.string.max_age),value);
                    editor.commit();
                }
            }
        });
        sbHitchLevel.setOnValueSelectedListener(new PersistValueListener() {
            @Override
            public boolean persistInt(int value) {
                SharedPreferences.Editor editor = settings.edit();
                editor.putInt(getString(R.string.hitch_lvl),value);
                editor.commit();
                return  true;
            }
        });
        sbDistance.setOnValueSelectedListener(new PersistValueListener() {
            @Override
            public boolean persistInt(int value) {
                SharedPreferences.Editor editor = settings.edit();
                editor.putInt(getString(R.string.distance),value);
                editor.commit();
                return  true;
            }
        });


    }


    public void initialize()
    {
        chkMale = (CheckBox) findViewById(R.id.checkbox_male);
        chkFemale = (CheckBox) findViewById(R.id.checkbox_female);
        chkOther = (CheckBox) findViewById(R.id.checkbox_other);
        chkAll = (CheckBox) findViewById(R.id.checkbox_all);
        txtMinAge = (TextView) findViewById(R.id.minAge);
        txtMaxAge = (TextView) findViewById(R.id.maxAge);
        mslRangeAge = (MultiSlider) findViewById(R.id.range_age);
        sbHitchLevel = (SeekBarPreferenceView) findViewById(R.id.slideHitch);
        sbDistance = (SeekBarPreferenceView) findViewById(R.id.slideDistance);
        // Restore or Initialize preferences
        settings = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        chkMale.setChecked(settings.getBoolean(getString(R.string.male),Boolean.valueOf(getString(R.string.prf_male))));
        chkFemale.setChecked(settings.getBoolean(getString(R.string.female),Boolean.valueOf(getString(R.string.prf_female))));
        chkOther.setChecked(settings.getBoolean(getString(R.string.other),Boolean.valueOf(getString(R.string.prf_other))));
        if(chkOther.isChecked() && chkFemale.isChecked() && chkMale.isChecked())
        {
            chkAll.setChecked(true);
        }
        mslRangeAge.getThumb(0).setValue(settings.getInt(getString(R.string.min_age),Integer.parseInt((getString(R.string.prf_min_age)))));
        mslRangeAge.getThumb(1).setValue(settings.getInt(getString(R.string.max_age),Integer.parseInt((getString(R.string.prf_max_age)))));
        txtMinAge.setText(settings.getInt(getString(R.string.min_age),Integer.parseInt((getString(R.string.prf_min_age))))+"");
        txtMaxAge.setText(settings.getInt(getString(R.string.max_age),Integer.parseInt((getString(R.string.prf_max_age))))+"");
        sbHitchLevel.setCurrentValue(settings.getInt(getString(R.string.hitch_lvl),Integer.parseInt((getString(R.string.prf_hitch_lvl)))));
        sbDistance.setCurrentValue(settings.getInt(getString(R.string.distance),Integer.parseInt((getString(R.string.prf_distance)))));

    }

    public void onCheckboxClicked(View view) {
        CheckBox chkAux = (CheckBox) view;
        boolean activate = chkAux.isChecked();
        chkMale.setChecked(activate);
        chkFemale.setChecked(activate);
        chkOther.setChecked(activate);

        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(getString(R.string.male),activate);
        editor.putBoolean(getString(R.string.female),activate);
        editor.putBoolean(getString(R.string.other),activate);
        editor.commit();
    }

    public void onChkMaleClicked(View view) {
        CheckBox chkAux = (CheckBox) view;
        boolean activate = chkAux.isChecked();
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(getString(R.string.male),activate);
        editor.commit();
    }

    public void onChkFemaleClicked(View view) {
        CheckBox chkAux = (CheckBox) view;
        boolean activate = chkAux.isChecked();
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(getString(R.string.female),activate);
        editor.commit();
    }

    public void onChkOtherClicked(View view) {
        CheckBox chkAux = (CheckBox) view;
        boolean activate = chkAux.isChecked();
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(getString(R.string.other),activate);
        editor.commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}
