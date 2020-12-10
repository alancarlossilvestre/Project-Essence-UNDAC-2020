package com.example.doblenav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.lang.ref.ReferenceQueue;

public class Login extends AppCompatActivity {

     Button ir_login;
     Button ir_registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_login);

        ir_login = (Button) findViewById(R.id.btn_login);
        ir_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), talento_propio.class);
                startActivity(i);
            }
        });

        ir_registro = (Button) findViewById(R.id.id_btn_ir_regist);
        ir_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi) {
                Intent e = new Intent(getApplicationContext(), usuarioregistro.class);
                startActivity(e);
            }
        });

    }

}