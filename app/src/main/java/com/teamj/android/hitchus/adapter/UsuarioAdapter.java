package com.teamj.android.hitchus.adapter;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.teamj.android.hitchus.R;
import com.teamj.android.hitchus.model.PaisOrigen;
import com.teamj.android.hitchus.model.Usuario;
import com.teamj.android.hitchus.utils.RequestWeb;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andres on 31/05/2016.
 */
public class UsuarioAdapter extends RecyclerView.Adapter {

    private OnRecyclerViewItemClickListener listener;
    List<Usuario> usuarios = new ArrayList<>();
    int selectedPosition = -1;

    public Usuario getItemAt(int position) {
        return usuarios.get(position);

    }

    public int getSelectedPosition() {
        return selectedPosition;
    }

    public void setListener(OnRecyclerViewItemClickListener listener) {
        this.listener = listener;
    }

    public void addNew(List<Usuario> usuarios) {
        this.usuarios.addAll(usuarios);
        notifyItemRangeInserted(this.usuarios.size() - usuarios.size(), usuarios.size());

    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
        notifyDataSetChanged();
    }

    public UsuarioAdapter(List<Usuario> usuarios, RecyclerView recyclerView) {
        this.usuarios = usuarios;
    }

    public void replaceAllItems(List<Usuario> usuarios) {
        this.usuarios.clear();
        this.usuarios.addAll(usuarios);
        notifyDataSetChanged();
    }

    public Usuario getSelectedItem() {
        return usuarios.get(selectedPosition);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_client, parent, false);
        // ClientViewHolder vh = new ClientViewHolder(v);
        RecyclerView.ViewHolder vh;
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_user_hitch_us, parent, false);
        vh = new UsuarioViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final Usuario usuario = usuarios.get(position);
        final ImageView imgProfile = ((UsuarioViewHolder) holder).imgProfilePicture;

        if (holder instanceof UsuarioViewHolder) {
            // we need to show the "normal" state

            holder.itemView.setBackgroundColor(Color.WHITE);
            //  holder.itemView.setActivated(selected);
            ((UsuarioViewHolder) holder).container.setVisibility(View.VISIBLE);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onRecyclerViewItemClicked(position, v.getId());
                }
            });
            //holder.container.setText(item);
            ((UsuarioViewHolder) holder).txtNickname.setText(usuario.getNickname());
            ((UsuarioViewHolder) holder).txtGenero.setText(usuario.getGenero());
            ((UsuarioViewHolder) holder).txtNivelHitch.setText(usuario.getNivelHitch() + "");
            ((UsuarioViewHolder) holder).txtEdad.setText(usuario.getEdad());


            // Retrieves an image specified by the URL, displays it in the UI.
            //ImageRequest request = new ImageRequest(usuario.getProfileImageURL(), new Response.Listener<Bitmap>() {
            ImageRequest request = new ImageRequest("http://lorempixel.com/400/400/sports/", new Response.Listener<Bitmap>() {

                        @Override
                        public void onResponse(Bitmap bitmap) {
                            imgProfile.setImageBitmap(bitmap);
                        }
                    }, 0, 0, null,
                    new Response.ErrorListener(){
                        public void onErrorResponse(VolleyError error) {
                            imgProfile.setImageResource(R.drawable.image_not_found);
                        }
                    });
            // Access the RequestQueue through your singleton class.
            RequestWeb.getInstance(holder.itemView.getContext()).addToRequestQueue(request);

            if(usuario.getPremium().equals("V"))
            {
                ((UsuarioViewHolder) holder).imgPremium.setImageResource(R.drawable.ic_check_circle);
            }else{
                ((UsuarioViewHolder) holder).imgPremium.setImageResource(R.drawable.ic_check_circle_disabled);
            }
            Float auxRate = usuario.getCalificacion().floatValue();
            auxRate = auxRate * 5.0f;
            ((UsuarioViewHolder) holder).rbCalificacion.setRating(auxRate);

        }

    }

    @Override
    public int getItemCount() {
        return usuarios == null ? 0 : usuarios.size();
    }

    public void remove(int position) {
        usuarios.remove(position);
        notifyItemRemoved(position);
    }

    public void add(Usuario usuario) {
        usuarios.add(usuario);
        notifyDataSetChanged();

    }

    public void modify(int pos, Usuario usuario) {
    /*    usuarios.get(pos).setCi(client.getCi());
        usuarios.get(pos).setDirection(client.getDirection());
        usuarios.get(pos).setName(client.getName());
        usuarios.get(pos).setEmail(client.getEmail());
        usuarios.get(pos).setPhone(client.getPhone());
        usuarios.get(pos).setSocialNetwork(client.getSocialNetwork());
        usuarios.get(pos).setApproved(client.isApproved());*/
        notifyItemChanged(pos);
    }


    public static class UsuarioViewHolder extends RecyclerView.ViewHolder {
        protected TextView txtNickname;
        protected TextView txtEdad;
        protected ImageView imgPremium;
        protected RatingBar rbCalificacion;
        protected TextView txtGenero;
        protected TextView txtNivelHitch;
        protected ImageView imgProfilePicture;
        protected LinearLayout container;

        public UsuarioViewHolder(View view) {
            super(view);
            imgProfilePicture = (ImageView) view.findViewById(R.id.img_profile_picture);
            rbCalificacion = (RatingBar) view.findViewById(R.id.rating_hitch_user);
            txtNickname = (TextView) view.findViewById(R.id.txt_user_name);
            imgPremium = (ImageView) view.findViewById(R.id.img_premium);
            txtEdad = (TextView) view.findViewById(R.id.txt_user_age);
            txtGenero = (TextView) view.findViewById(R.id.txt_user_gender);
            txtNivelHitch = (TextView) view.findViewById(R.id.txt_hitch_lvl);
            container = (LinearLayout) view.findViewById(R.id.container);
        }
    }


}

