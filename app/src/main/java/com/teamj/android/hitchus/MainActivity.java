package com.teamj.android.hitchus;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.tusharchoudhary.timeline.Timeline;
import com.tusharchoudhary.timeline.TimelineView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Timeline timeline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        initialize();


    }

    public void initialize()
    {
        timeline = (Timeline) findViewById(R.id.timeline_main_view);
        List<TimelineView.TimelineDataItem> list = new ArrayList<>();
        addDummy(list);
        timeline.bindView(list,timeline);


    }

    private void addDummy(List<TimelineView.TimelineDataItem> list) {
        list.add(new TimelineView.TimelineDataItem((long) 1423743132*1000,"http://buscandovideos.com/wp-content/uploads/2015/11/buscandovideos-440.jpg" ));
        list.add(new TimelineView.TimelineDataItem((long) 1423743132*1000,"http://as01.epimg.net/ocio/imagenes/2015/01/28/album/1422455681_541732_1423859946_album_grande.jpg" ));
        list.add(new TimelineView.TimelineDataItem((long) 1453662903*1000,"http://as.com/ocio/imagenes/2015/01/28/album/1422455681_541732_1422550443_album_grande.jpg"));
        list.add(new TimelineView.TimelineDataItem((long) 1463055132*1000,"http://zqjo0g.bay.livefilestore.com/y1p3IEK3VBhfBpUsePFuG_CwJeX6-yauQdC73WJH1zPpOX_szZ7sTyeJxhpDN3Cj8bYeI5UDTEZ4J5mdG-NtzlVzQ/ScarlettJohansson10.jpg"));
        list.add(new TimelineView.TimelineDataItem((long) 1463055132*1000,"http://www.etcfn.com/wp-content/uploads/2015/05/Emma-Watson-Hot-4.jpg"));
        list.add(new TimelineView.TimelineDataItem((long) 1463055132*1000,"http://los40es00.epimg.net/los40/imagenes/2014/12/19/album/1418994731_779804_1418994839_album_normal.jpg"));
        list.add(new TimelineView.TimelineDataItem((long) 1434934861*1000,"http://mcdn.i24web.com/wp-content/uploads/2016/02/lauren-cohan1.jpg"));
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_hitch_us) {
            // Handle the camera action
        } else if (id == R.id.nav_hitch_chats) {
            Intent intent = new Intent(MainActivity.this, HitchatsActivity.class);
            MainActivity.this.startActivity(intent);


        } else if (id == R.id.nav_settings) {
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            MainActivity.this.startActivity(intent);

        } else if (id == R.id.nav_exit) {
            exitToApp();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void exitToApp()
    {
        SharedPreferences settings;
        // Restore or Initialize preferences
        settings = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.clear();
        editor.commit();
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        MainActivity.this.startActivity(intent);
        MainActivity.this.finish();

    }

}
