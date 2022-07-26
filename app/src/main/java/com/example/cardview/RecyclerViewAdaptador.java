package com.example.cardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView navegador, creador;
        ImageView fotoNavegador;

        public ViewHolder(View itemView){
            super(itemView);
            navegador= (TextView) itemView.findViewById(R.id.txtnombre);
            creador= (TextView) itemView.findViewById(R.id.txtcreador);
            fotoNavegador=(ImageView) itemView.findViewById(R.id.imgNavegador);
        }
    }
    public List<NavegadorModelo> navegadorLista;

    public RecyclerViewAdaptador(List<NavegadorModelo> navegadorLista) {
        this.navegadorLista = navegadorLista;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_navegadores,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.navegador.setText(navegadorLista.get(position).getNavegador());
        holder.creador.setText(navegadorLista.get(position).getCreador());
        holder.fotoNavegador.setImageResource(navegadorLista.get(position).getImgNavegador());
    }

    @Override
    public int getItemCount() {
        return navegadorLista.size();
    }
}
