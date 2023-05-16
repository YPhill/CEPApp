package br.com.etecia.cepapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    Button btnBuscaCEP, btnCadastrar, btnAlterar, btnExcluir, btnLimpar;

    EditText txtCep;

    TextView lblCEP, lblNumero, lblBairro, lblCidade, lblComplemento;

    Spinner idSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBuscaCEP = findViewById(R.id.btnBuscaCEP);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnAlterar = findViewById(R.id.btnExcluir);
        btnExcluir = findViewById(R.id.btnExcluir);
        btnLimpar = findViewById(R.id.btnLimpar);
        txtCep = findViewById(R.id.txtCep);
        lblCEP = findViewById(R.id.lblCEP);
        lblNumero = findViewById(R.id.txtCep);
        lblBairro = findViewById(R.id.lblBairro);
        lblCidade = findViewById((R.id.lblCidade);
        lblComplemento = findViewById(R.id.lblComplemento);
        idSpinner = findViewById(R.id.idSpinner);

        btnBuscaCEP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });




    }
}