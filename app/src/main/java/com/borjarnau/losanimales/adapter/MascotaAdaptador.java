package com.borjarnau.losanimales.adapter;

/**
 * Created by ArnAu on 20/05/2016.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.borjarnau.losanimales.R;
import com.borjarnau.losanimales.pojo.Mascota;

import java.util.ArrayList;

public class MascotaAdaptador extends  RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{


    ArrayList<Mascota> mascotas;
    public MascotaAdaptador(ArrayList<Mascota>mascotas){
        this.mascotas = mascotas;
    }



    //inflar o dar vida a el layout (cardview) y lo pasara al viewholder para el obtenga los views
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //aqui indicamos cual es el layout que estara reciclando el recycleview
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent, false);
        return new MascotaViewHolder(v);
    }

    //asocia cada elemento de nuestra lista con cada view
    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {

        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombreCV.setText(mascota.getNombre());
        //mascotaViewHolder.tvNumMeGustas.setInputType(mascota.getNumMegustas());
        mascotaViewHolder.tvNumMeGustas.setText(Integer.toString(mascota.getNumMegustas()));

        mascotaViewHolder.ibHuesoBlanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mascotaViewHolder.ibHuesoBlanco.setImageResource(R.drawable.huesoamarillo);
                mascotaViewHolder.tvNumMeGustas.setText(Integer.toString(mascota.getNumMegustas() + 1));


            }
        });


    }

    @Override
    public int getItemCount() { //cantidad de elementos que contiene mi lista
        return mascotas.size();
    }




    public static  class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView tvNombreCV;
        private TextView tvNumMeGustas;

        private ImageButton ibHuesoBlanco;

        //Este constructor se ha puesto automaticamente, poniendome
        //alado de RecyclerView.ViewHolder cuando me salia la linea entera en rojo
        //apretando Alt+enter y me a sugerido el constructor


        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView)itemView.findViewById(R.id.imgFoto);
            tvNombreCV = (TextView)itemView.findViewById(R.id.tvNombreCV);
            tvNumMeGustas = (TextView) itemView.findViewById(R.id.tvNumMeGustas);

            ibHuesoBlanco = (ImageButton)itemView.findViewById(R.id.ibHuesoBlanco);

        }

    }


}
