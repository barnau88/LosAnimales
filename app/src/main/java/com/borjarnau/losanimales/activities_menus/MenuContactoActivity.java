package com.borjarnau.losanimales.activities_menus;

/**
 * Created by ArnAu on 20/05/2016.
 */
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.borjarnau.losanimales.R;

public class MenuContactoActivity extends AppCompatActivity {

    private EditText etEmail;
    private EditText etNombreCompleto;
    private EditText etMensaje;

    String email;
    String nombre;
    String mensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_contacto);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Button btEnviarComentarios = (Button)findViewById(R.id.btEnviarComentarios);
        btEnviarComentarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etEmail = (EditText)findViewById(R.id.etEmail);
                etNombreCompleto = (EditText)findViewById(R.id.etNombreCompleto);
                etMensaje = (EditText)findViewById(R.id.etMensaje);

                email = etEmail.getText().toString();
                nombre = etNombreCompleto.getText().toString();
                mensaje = etMensaje.getText().toString();

                Toast.makeText(getBaseContext(), " Tu : " + nombre + " Quieres enviar este mensaje : " + mensaje + " a : " + email, Toast.LENGTH_LONG).show();


                Intent sendIntent = new Intent((Intent.ACTION_SEND));

                sendIntent.setType("plain/text");

                sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
                sendIntent.putExtra(Intent.EXTRA_TEXT, mensaje);
                sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Mensaje enviado por " + nombre);

                startActivity(Intent.createChooser(sendIntent, "Enviar mail atraves de "));

            }
        });
    }


}
