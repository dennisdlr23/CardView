package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewNavegador;
    private RecyclerViewAdaptador AdaptadorNavegador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewNavegador = (RecyclerView) findViewById(R.id.recyclerNavegadores);
        recyclerViewNavegador.setLayoutManager(new LinearLayoutManager(this));

        AdaptadorNavegador= new RecyclerViewAdaptador(obtenerNavegadores());
        recyclerViewNavegador.setAdapter(AdaptadorNavegador);
    }

    public List<NavegadorModelo> obtenerNavegadores(){
        List<NavegadorModelo> navegador= new ArrayList<>();
        navegador.add(new NavegadorModelo("Google Chrome", "Google", R.drawable.chrome));
        navegador.add(new NavegadorModelo("Firefox", "Chris Hofmann", R.drawable.firefox));
        navegador.add(new NavegadorModelo("Microsoft Edge", "Microsoft", R.drawable.edge));
        navegador.add(new NavegadorModelo("Opera", "Jon Stephenson von Tetzchner y Geir Ivarsøy", R.drawable.opera));
        navegador.add(new NavegadorModelo("Safari", "Apple Inc", R.drawable.safari));

        return navegador;
    }
}