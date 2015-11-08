package com.example.franprimo.mathdice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Creo un array con las opciones que tendra el menu
        String[] opcionesMenu = {"PERFIL", "JUEGO", "INSTRUCCIONES", "INFO"};
        Integer[] imagenesMenu = {R.mipmap.perfil, R.mipmap.juego, R.mipmap.instrucciones, R.mipmap.info};
        //Creo un arrayList para obtener una lista
        ArrayList<String> listaMenu = new ArrayList<String>(Arrays.asList(opcionesMenu));
        ArrayList<Integer> listaImagenes = new ArrayList<Integer>(Arrays.asList(imagenesMenu));

        MenuAdapter adapter = new MenuAdapter(this, listaMenu, listaImagenes);

        final ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
