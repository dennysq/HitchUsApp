package com.teamj.android.hitchus;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.teamj.android.hitchus.adapter.OnRecyclerViewItemClickListener;
import com.teamj.android.hitchus.adapter.UsuarioAdapter;
import com.teamj.android.hitchus.model.CiudadResidencia;
import com.teamj.android.hitchus.model.PaisOrigen;
import com.teamj.android.hitchus.model.Usuario;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, OnRecyclerViewItemClickListener {

    private List<Usuario> usuarios;
    private RecyclerView mRecyclerView;
    private UsuarioAdapter usuarioAdapter;
    private int selectedItem = -1;

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
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_contract_list);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(llm);
        usuarios = new ArrayList<>();

        usuarioAdapter = new UsuarioAdapter(usuarios, mRecyclerView);

        usuarioAdapter.setListener(this);
        //getDataFromFile();
        mRecyclerView.setAdapter(usuarioAdapter);
        setDummyData();

    }

    public void setDummyData()
    {
        Usuario aux = new Usuario(1,"SeductoraHot","1234","sed@hotmail.com",1993,2,new BigDecimal(1.7f),true,"V","0995373041","Soltera",new BigDecimal(0.2f),"Masculino","Sex a lot","Delgada","Primaria","Ingles y Español",new BigDecimal(69),false,new Date(),new PaisOrigen(1,"Ecuador"),new CiudadResidencia(1,"Quito"),98,null,null);
        Usuario aux1 = new Usuario(2,"SeductoraHot","1234","sed@hotmail.com",1993,2,new BigDecimal(1.7f),true,"P","0995373041","Soltera",new BigDecimal(0.3f),"Masculino","Sex a lot","Delgada","Primaria","Ingles y Español",new BigDecimal(69),false,new Date(),new PaisOrigen(1,"Ecuador"),new CiudadResidencia(1,"Quito"),98,null,null);
        Usuario aux2 = new Usuario(3,"SeductoraHot","1234","sed@hotmail.com",1993,2,new BigDecimal(1.7f),true,"N","0995373041","Soltera",new BigDecimal(0.5f),"Masculino","Sex a lot","Delgada","Primaria","Ingles y Español",new BigDecimal(69),false,new Date(),new PaisOrigen(1,"Ecuador"),new CiudadResidencia(1,"Quito"),98,null,null);
        Usuario aux3 = new Usuario(4,"SeductoraHot","1234","sed@hotmail.com",1993,2,new BigDecimal(1.7f),true,"V","0995373041","Soltera",new BigDecimal(1.0f),"Masculino","Sex a lot","Delgada","Primaria","Ingles y Español",new BigDecimal(69),false,new Date(),new PaisOrigen(1,"Ecuador"),new CiudadResidencia(1,"Quito"),98,null,null);
        usuarios.add(aux);
        usuarios.add(aux1);
        usuarios.add(aux2);
        usuarios.add(aux3);


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


    @Override
    public void onRecyclerViewItemRemoveClicked(int position, int id) {

    }

    @Override
    public void onRecyclerViewItemClicked(int position, int id) {

    }

    @Override
    public void onRecyclerViewItemLongClicked(int position, int id) {

    }

    @Override
    public void onRecyclerViewItemModifyClicked(int position, int id) {

    }
}
