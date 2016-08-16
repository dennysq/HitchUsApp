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
                    editor.putInt("prf_min_age",value);
                    editor.commit();
                } else {
                    txtMaxAge.setText(String.valueOf(value));
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putInt("prf_max_age",value);
                    editor.commit();
                }
            }
        });
        sbHitchLevel.setOnValueSelectedListener(new PersistValueListener() {
            @Override
            public boolean persistInt(int value) {
                SharedPreferences.Editor editor = settings.edit();
                editor.putInt("prf_hitch_lvl",value);
                editor.commit();
                return  true;
            }
        });
        sbDistance.setOnValueSelectedListener(new PersistValueListener() {
            @Override
            public boolean persistInt(int value) {
                SharedPreferences.Editor editor = settings.edit();
                editor.putInt("prf_distance",value);
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
        chkMale.setChecked(settings.getBoolean("prf_male",true));
        chkFemale.setChecked(settings.getBoolean("prf_female",true));
        chkOther.setChecked(settings.getBoolean("prf_other",false));
        if(chkOther.isChecked() && chkFemale.isChecked() && chkMale.isChecked())
        {
            chkAll.setChecked(true);
        }
        mslRangeAge.getThumb(0).setValue(settings.getInt("prf_min_age",18));
        mslRangeAge.getThumb(1).setValue(settings.getInt("prf_max_age",35));
        txtMinAge.setText(settings.getInt("prf_min_age",18)+"");
        txtMaxAge.setText(settings.getInt("prf_max_age",35)+"");
        sbHitchLevel.setCurrentValue(settings.getInt("prf_hitch_lvl",35));
        sbDistance.setCurrentValue(settings.getInt("prf_distance",5));

    }

    public void onCheckboxClicked(View view) {
        CheckBox chkAux = (CheckBox) view;
        boolean activate = chkAux.isChecked();
        chkMale.setChecked(activate);
        chkFemale.setChecked(activate);
        chkOther.setChecked(activate);

        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("prf_male",activate);
        editor.putBoolean("prf_female",activate);
        editor.putBoolean("prf_other",activate);
        editor.commit();
    }

    public void onChkMaleClicked(View view) {
        CheckBox chkAux = (CheckBox) view;
        boolean activate = chkAux.isChecked();
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("prf_male",activate);
        editor.commit();
    }

    public void onChkFemaleClicked(View view) {
        CheckBox chkAux = (CheckBox) view;
        boolean activate = chkAux.isChecked();
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("prf_female",activate);
        editor.commit();
    }

    public void onChkOtherClicked(View view) {
        CheckBox chkAux = (CheckBox) view;
        boolean activate = chkAux.isChecked();
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("prf_other",activate);
        editor.commit();
    }






}
