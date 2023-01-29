package com.example.turistiando;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.viewHolder> {

    public ArrayList<Hotel> lista;

    public Adaptador(ArrayList<Hotel> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public Adaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,null,false);

        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.viewHolder holder, int position) {

        holder.actualizarDatos(lista.get(position));

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView nombre;
        TextView precio;
        ImageView foto;

        public viewHolder(@NonNull View itemView) {

            super(itemView);
            nombre=itemView.findViewById(R.id.tituloItem);
            precio=itemView.findViewById(R.id.precioItem);
            foto=itemView.findViewById(R.id.fotoItem);

        }

        public void actualizarDatos(Hotel hotel) {

            nombre.setText(hotel.getNombre());
            precio.setText(hotel.getPrecio());
            foto.setImageResource(hotel.getFoto());

        }
    }
}
