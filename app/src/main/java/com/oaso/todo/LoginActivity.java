package com.oaso.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.oaso.todo.databinding.ActivityLoginBinding;
import com.oaso.todo.model.Usuario;

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

            Usuario.nombre.set("Omar");
            Usuario.password.set("1234");
            binding.textView.setText(Usuario.nombre.get());
            Snackbar snackbar = Snackbar.make(view, Usuario.nombre.get(), Snackbar.LENGTH_SHORT);
            snackbar.show();

        }
    }
}
