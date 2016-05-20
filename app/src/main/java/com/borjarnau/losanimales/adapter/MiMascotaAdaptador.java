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

public class MiMascotaAdaptador extends  RecyclerView.Adapter<MiMascotaAdaptador.MiMascotaViewHolder>{

    ArrayList<Mascota> mascotas;
    public MiMascotaAdaptador(ArrayList<Mascota>mascotas){
        this.mascotas = mascotas;
    }

    public MiMascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //aqui indicamos cual es el layout que estara reciclando el recycleview
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mi_mascota,parent, false);
        return new MiMascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MiMascotaAdaptador.MiMascotaViewHolder miMascotaViewHolder, int position) {

        final Mascota mascota = mascotas.get(position);
        miMascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());

        miMascotaViewHolder.tvNumMeGustas.setText(Integer.toString(mascota.getNumMegustas()));

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }





    public static  class MiMascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView tvNumMeGustas;


        //Este constructor se ha puesto automaticamente, poniendome
        //alado de RecyclerView.ViewHolder cuando me salia la linea entera en rojo
        //apretando Alt+enter y me a sugerido el constructor


        public MiMascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView)itemView.findViewById(R.id.imgFoto);

            tvNumMeGustas = (TextView) itemView.findViewById(R.id.tvNumMeGustas);



        }

    }

}
