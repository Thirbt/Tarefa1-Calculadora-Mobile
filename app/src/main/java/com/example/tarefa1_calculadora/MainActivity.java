package com.example.tarefa1_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNumero1;
    private EditText txtNumero2;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void somar(View view){
        int numero1 = Integer.parseInt(txtNumero1.getText().toString());
        int numero2 = Integer.parseInt(txtNumero2.getText().toString());
        int resultado = numero1 + numero2;
        txtResultado.setText(String.valueOf(resultado));
    }

    public void subtrair(View view){
        int numero1 = Integer.parseInt(txtNumero1.getText().toString());
        int numero2 = Integer.parseInt(txtNumero2.getText().toString());
        int resultado = numero1 - numero2;
        txtResultado.setText(String.valueOf(resultado));
    }

    public void multiplicar(View view){
        int numero1 = Integer.parseInt(txtNumero1.getText().toString());
        int numero2 = Integer.parseInt(txtNumero2.getText().toString());
        int resultado = numero1 * numero2;
        txtResultado.setText(String.valueOf(resultado));
    }

    public void dividir(View view){
        int numero1 = Integer.parseInt(txtNumero1.getText().toString());
        int numero2 = Integer.parseInt(txtNumero2.getText().toString());
        int resultado = numero1 / numero2;
        txtResultado.setText(String.valueOf(resultado));
    }

    public void limparTela(View view){
        txtResultado.setText(String.valueOf(0));
    }
}