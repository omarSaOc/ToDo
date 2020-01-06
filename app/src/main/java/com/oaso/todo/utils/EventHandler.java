package com.oaso.todo.utils;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

/*Clase encargada del manejo de eventos de los componentes view de Android*/

public class EventHandler {

    Context context;

    public EventHandler(Context context){
        this.context = context;
    }

    public void onButtonClick(View view){
        Toast.makeText(context.getApplicationContext(), "Button Click!!", Toast.LENGTH_SHORT).show();
    }

    public void onSaludoClick(View view){

        Snackbar snackbar = Snackbar.make(view, "Hola Mundo", Snackbar.LENGTH_SHORT);
        snackbar.show();

    }
}
