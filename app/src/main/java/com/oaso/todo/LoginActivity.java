package com.oaso.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.oaso.todo.databinding.ActivityLoginBinding;
import com.oaso.todo.model.NuevoUsuario;
import com.oaso.todo.model.Usuario;
import com.oaso.todo.utils.observable.IObservador;

public class LoginActivity extends AppCompatActivity {

    //Objeto encargada para el enlace de datos
    private ActivityLoginBinding binding;
    private EventHandler handlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        handlers = new EventHandler(this);
        binding.setHandlers(handlers);

    }

    /*Clase encargada del manejo de eventos de los componentes view de Android*/
    public class EventHandler{

        Context context;

        public EventHandler(Context context){
            this.context = context;
        }

        public void onButtonClick(View view){
            Toast.makeText(context.getApplicationContext(), "Button Click!!", Toast.LENGTH_SHORT).show();
        }

        public void onSaludoClick(View view){

            Usuario usuario = new Usuario("Alejandro", "asd");
            IObservador observadorUsuario = new NuevoUsuario(usuario);
            usuario.setNombre("Omar");
            binding.textView.setText(usuario.getPassword());
            Snackbar snackbar = Snackbar.make(view, usuario.getNombre(), Snackbar.LENGTH_SHORT);
            snackbar.show();

        }
    }
}
