package com.teamj.android.hitchus.service.remote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.teamj.android.hitchus.R;
import com.teamj.android.hitchus.adapter.UsuarioAdapter;
import com.teamj.android.hitchus.model.Usuario;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import me.wangyuwei.banner.BannerEntity;
import me.wangyuwei.banner.BannerView;
import me.wangyuwei.banner.OnBannerClickListener;

public class TestActivity extends AppCompatActivity {

    private BannerView mBannerView;
    private UsuarioRemote usuarioRemote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mBannerView = (BannerView) this.findViewById(R.id.banner_view);

        //   Banner banner = JSON.parseObject(readAssets(), Banner.class);
        usuarioRemote = new UsuarioRemote(this);
        usuarioRemote.retrieveCompatibleUsers("42", "19", "24", "20", "10", "_F_", new Response.Listener<Usuario[]>() {
            @Override
            public void onResponse(Usuario[] response) {
                final List<BannerEntity> entities = new ArrayList<>();
                System.out.println("contador:" + response.length);
                BannerEntity entity;

                for (int i = 0; i < response.length; i++) {
                    entity = new BannerEntity();
                    entity.imageUrl = UsuarioAdapter.SERVLET + response[i].getProfileImageURL() + ".jpg";
                    entity.title = response[i].getNickname();
                    entities.add(entity);
                }
                mBannerView.setEntities(entities);
                mBannerView.setOnBannerClickListener(new OnBannerClickListener() {
                    @Override
                    public void onClick(int position) {
                        Toast.makeText(TestActivity.this, position + "=> " + entities.get(position).title, Toast.LENGTH_SHORT).show();
                    }
                });

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(TestActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    private String readAssets() {
        String json = "";
        try {
            InputStream inputStream = this.getAssets().open("banner.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}

