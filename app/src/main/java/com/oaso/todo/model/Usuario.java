package com.oaso.todo.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

import com.oaso.todo.utils.observable.IObservable;
import com.oaso.todo.utils.observable.IObservador;

import java.util.ArrayList;

public class Usuario implements IObservable {

    private String nombre;
    private String password;
    ArrayList<IObservador> observadores = new ArrayList<>();

    public Usuario(){}

    public Usuario(String nombre, String password){
        this.nombre = nombre;
        this.password = password;
    }


    @Override
    public void suscribir(IObservador observador) {
        if(!observadores.contains(observador)){
            observadores.add(observador);
        }
    }

    @Override
    public void cancelarSuscripcion(IObservador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarCambiosEstadoAObservables() {
        for(IObservador observador : observadores){
            observador.actualizar(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(this.nombre != nombre){
            this.nombre = nombre;
            notificarCambiosEstadoAObservables();
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(this.password != password){
            this.password = password;
            notificarCambiosEstadoAObservables();
        }
    }
}
