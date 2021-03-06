package com.borjarnau.losanimales.fragment;

/**
 * Created by ArnAu on 20/05/2016.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.borjarnau.losanimales.R;
import com.borjarnau.losanimales.adapter.MascotaAdaptador;
import com.borjarnau.losanimales.pojo.Mascota;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment { //se hereda de android.support.v4.app

    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false); //en una actividad se utiliza el setContentView, y en un frgament esta linea

        listaMascotas = (RecyclerView)v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

        return  v;

    }

    public MascotaAdaptador adaptador;
    public void inicializarAdaptador(){

        adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);

    }


    public void inicializarListaMascotas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.perro2, "Dady", 3));
        mascotas.add(new Mascota(R.drawable.perro3, "Dudú", 10));
        mascotas.add(new Mascota(R.drawable.perro4, "Caly", 6));
        mascotas.add(new Mascota(R.drawable.perro5, "Carola", 2));
        mascotas.add(new Mascota(R.drawable.perro6, "Mulero", 14));
        mascotas.add(new Mascota(R.drawable.perro7, "Truncate", 22));
        mascotas.add(new Mascota(R.drawable.perro8, "Nino", 4));


    }




}
