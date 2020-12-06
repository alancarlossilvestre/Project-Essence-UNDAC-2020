package com.example.doblenav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

     Button ir_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ir_login = (Button) findViewById(R.id.btn_login);
    }
    public void ir_a_principal(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}