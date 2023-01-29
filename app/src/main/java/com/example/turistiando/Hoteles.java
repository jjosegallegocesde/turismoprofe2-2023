package com.example.turistiando;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Hoteles extends AppCompatActivity {

    ArrayList<Hotel> lista = new ArrayList<>();
    RecyclerView listaScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        listaScroll=findViewById(R.id.recycler);
        listaScroll.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        Adaptador adaptador = new Adaptador(lista);
        listaScroll.setAdapter(adaptador);

    }

    public void crearLista(){

        lista.add(new Hotel("La Casona","$ 150000 COP",R.drawable.hotel1));
        lista.add(new Hotel("Hacienda la bonita","$ 250000 COP",R.drawable.hotel2));


    }


}