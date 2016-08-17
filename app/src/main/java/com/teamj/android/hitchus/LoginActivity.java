package com.teamj.android.hitchus;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.teamj.android.hitchus.model.Usuario;
import com.teamj.android.hitchus.service.remote.UsuarioRemote;

public class LoginActivity extends AppCompatActivity {

    //Attributes
    TextInputLayout tilCorreo;
    TextInputLayout tilPassword;
    TextInputEditText tietCorreo;
    TextInputEditText tietPassword;
    SharedPreferences settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        settings = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        if(hasSavedPreferences())
            logInWithPreferences();
        else
            initialize();
    }

    public void initialize()
    {
        tilCorreo = (TextInputLayout) findViewById(R.id.input_layout_mail);
        tilPassword = (TextInputLayout)findViewById(R.id.input_layout_password);
        tilCorreo.setErrorEnabled(true);
        tilPassword.setErrorEnabled(true);
        tietCorreo = (TextInputEditText)findViewById(R.id.input_mail);
        tietPassword = (TextInputEditText)findViewById(R.id.input_password);
    }

    public void onBtnLoginClicked(View view) {
        //Get Json User then Init The Application IF
        if(validateFields())
            //logInAndSavePreferences();
        {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            LoginActivity.this.startActivity(intent);
            LoginActivity.this.finish();
        }

    }

    public Boolean hasSavedPreferences()
    {
        String userLogged = "";
        String passwordLogged = "";

        // Restore or Initialize preferences
        userLogged = settings.getString("prf_user_logged", "");
        passwordLogged = settings.getString("prf_password_logged", "");
        if (userLogged.equals("") && passwordLogged.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public void logInWithPreferences()
    {
        final String userLogged = settings.getString("prf_user_logged", "");
        final String passwordLogged = settings.getString("prf_password_logged", "");
        UsuarioRemote usuarioRemote=new UsuarioRemote(this);
        usuarioRemote.logging(userLogged,passwordLogged, new Response.Listener<Usuario>() {
            @Override
            public void onResponse(Usuario response) {
                SharedPreferences settings;
                // Restore or Initialize preferences
                settings = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("prf_user_logged",userLogged);
                editor.putString("prf_password_logged",passwordLogged);
                editor.commit();
                Toast.makeText(LoginActivity.this,response.toString(),Toast.LENGTH_LONG).show();
                //System.out.println(response);
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                LoginActivity.this.startActivity(intent);
                LoginActivity.this.finish();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(LoginActivity.this,"Error:"+error,Toast.LENGTH_LONG).show();
            }
        });
    }

    public void logInAndSavePreferences()
    {
        UsuarioRemote usuarioRemote=new UsuarioRemote(this);
        usuarioRemote.logging(tietCorreo.getText().toString(), tietPassword.getText().toString(), new Response.Listener<Usuario>() {
            @Override
            public void onResponse(Usuario response) {
                SharedPreferences settings;
                // Restore or Initialize preferences
                settings = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("prf_user_logged",tietCorreo.getText().toString());
                editor.putString("prf_password_logged",tietPassword.getText().toString());
                editor.commit();
                Toast.makeText(LoginActivity.this,response.toString(),Toast.LENGTH_LONG).show();

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                LoginActivity.this.startActivity(intent);
                LoginActivity.this.finish();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(LoginActivity.this,"Error:"+error,Toast.LENGTH_LONG).show();
            }
        });


    }

    public Boolean validateFields() {
        Boolean isValidated = true;

        if (tietCorreo.getText().length() == 0) {
            tietCorreo.setError("Se requiere un correo electrónico");
            isValidated = false;
        } else {
            tietCorreo.setError(null);
        }

        if (tietPassword.getText().length() == 0) {
            tietPassword.setError("Se requiere una contraseña");
            isValidated = false;
        } else {
            tietPassword.setError(null);
        }

        return  isValidated;
    }
}
