package com.oaso.todo.utils.observable;

public interface IObservable {

    void suscribir(IObservador observador);
    void cancelarSuscripcion(IObservador observador);
    void notificarCambiosEstadoAObservables();
}
