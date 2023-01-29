package com.example.turistiando;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ImageButton botonHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar barra = getSupportActionBar();

        ColorDrawable colorDrawable=new ColorDrawable(Color.parseColor("#0F9D58"));
        barra.setBackgroundDrawable(colorDrawable);

        botonHoteles=findViewById(R.id.iconoHotel);


        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(MainActivity.this,Hoteles.class);
                startActivity(intent1);

            }
        });



    }



    //encargada de cambiar configuracion idioma telefono
    public void cambiarIdioma(String lenguaje){

        Locale idioma=new Locale(lenguaje);
        Locale.setDefault(idioma);

        Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=idioma;

        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());

    }



    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }



    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();

        switch(id){
            case R.id.opcion1:
                Intent intent1 = new Intent(MainActivity.this,Acercade.class);
                startActivity(intent1);
                break;

            case R.id.opcion2:
                this.cambiarIdioma("en");
                Intent intent2 = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent2);
                break;

            case R.id.opcion3:
                this.cambiarIdioma("es");
                Intent intent3 = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent3);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}