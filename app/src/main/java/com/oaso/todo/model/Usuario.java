package com.oaso.todo.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

public class Usuario extends BaseObservable{

    public static ObservableField<String> nombre = new ObservableField<>();
    public static ObservableField<String> password = new ObservableField<>();

    public ObservableField<String> getNombre() {
        return nombre;
    }

    public ObservableField<String> getPassword() {
        return password;
    }
}
