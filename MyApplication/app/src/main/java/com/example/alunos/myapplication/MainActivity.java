package com.example.alunos.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirFib(View i){
        Intent it = new Intent(this, FibActivity.class);
        startActivity(it);
    }
    public void abrirFatorial(View i){
        Intent it = new Intent(this, FatorialActivity.class);
        startActivity(it);
    }
    public void abrirCalculadora(View i){
        Intent it = new Intent(this, CalcActivity.class);
        startActivity(it);
    }
}
