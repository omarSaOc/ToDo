package com.oaso.todo.model;

import android.util.Log;
import android.widget.Toast;

import com.oaso.todo.utils.observable.IObservable;
import com.oaso.todo.utils.observable.IObservador;

public class NuevoUsuario implements IObservador {

    private IObservable observable;
    private String nombreNuevo;

    public NuevoUsuario(IObservable observable){
        this.observable = observable;
        observable.suscribir(this);
    }


    @Override
    public void actualizar(Usuario usuario) {
        if (!usuario.equals(nombreNuevo)){
            Log.e("TAG", "Nombre Actualizado");
        }
    }
}
