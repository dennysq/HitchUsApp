package com.teamj.android.hitchus.service.remote;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.teamj.android.hitchus.HitchusApplication;
import com.teamj.android.hitchus.model.Usuario;

import java.lang.reflect.Type;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dennys on 16/08/2016.
 */
public class UsuarioRemote {
    Context context;

public static final String URL="http://"+ HitchusApplication.DEV_HOST+":"+HitchusApplication.PORT+"/"
        +HitchusApplication.REQUEST_PATH;
public static final String RESOURCE_NAME="usuario";

    public UsuarioRemote(Context context) {
        this.context = context;
    }

    public void logging(String email, String password, Response.Listener<Usuario> listener, Response.ErrorListener errorListener) {
        // Get a RequestQueue
// ...

// Add a request (in this example, called stringRequest) to your RequestQueue.
//        Type type = new TypeToken<ArrayList<MyClass>>() {}.getType();
//        new GsonRequest<ArrayList<MyClass>>(Request.Method.GET, uriBuilder.build().toString(),
//
//                type, null, mResponseListListener, mReponseErrorListener));
         final String METHOD_NAME="loggin";


        Map<String,String> header=new HashMap<>();
//header.put("Content-Type", GsonRequest.APPLICATION_FORM_URLENCODED);
        Map<String,String> params=new HashMap<>();
        params.put("email", email);
        params.put("password", password);

        GsonRequest<Usuario> request=new  GsonRequest<>(Request.Method.POST, URL+"/"+RESOURCE_NAME+"/"+METHOD_NAME, Usuario.class, header,params,listener,errorListener);
        HitchusRequest.getInstance(context).addToRequestQueue(request);
        HitchusRequest.getInstance(context).
                getRequestQueue().start();

    }
    public void retrieveCompatibleUsers(String id,
                                        String edadMinima,
                                        String edadMaxima,
                                        String distancia,
                                        String nivelCompatibilidad,
                                        String genero, Response.Listener<Usuario[]> listener, Response.ErrorListener errorListener) {
        // Get a RequestQueue
// ...

// Add a request (in this example, called stringRequest) to your RequestQueue.
//        Type type = new TypeToken<ArrayList<MyClass>>() {}.getType();
//        new GsonRequest<ArrayList<MyClass>>(Request.Method.GET, uriBuilder.build().toString(),
//
//                type, null, mResponseListListener, mReponseErrorListener));
        final String METHOD_NAME="getUsuariosCompatibles";


        Map<String,String> header=new HashMap<>();

        Map<String,String> params=new HashMap<>();
        params.put("id", id);
        params.put("edadMinima", edadMinima);
        params.put("edadMaxima", edadMaxima);
        params.put("distancia", distancia);
        params.put("nivelCompatibilidad", nivelCompatibilidad);
        params.put("genero", genero);

        GsonRequest<Usuario[]> request= new GsonRequest<Usuario[]>(Request.Method.POST, URL+"/"+RESOURCE_NAME+"/"+METHOD_NAME,Usuario[].class, header,params,listener,errorListener);
        HitchusRequest.getInstance(context).addToRequestQueue(request);
        HitchusRequest.getInstance(context).
                getRequestQueue().start();

    }

}
