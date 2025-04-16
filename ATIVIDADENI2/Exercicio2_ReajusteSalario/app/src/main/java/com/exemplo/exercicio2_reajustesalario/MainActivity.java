package com.exemplo.reajustesalario;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etSalario;
    RadioGroup rgAumento;
    Button btnCalcular;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSalario = findViewById(R.id.etSalario);
        rgAumento = findViewById(R.id.rgAumento);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);

        btnCalcular.setOnClickListener(v -> {
            double salario = Double.parseDouble(etSalario.getText().toString());
            int id = rgAumento.getCheckedRadioButtonId();
            double aumento = 0;

            if (id == R.id.rb40) aumento = 0.40;
            else if (id == R.id.rb45) aumento = 0.45;
            else if (id == R.id.rb50) aumento = 0.50;

            double novoSalario = salario + (salario * aumento);
            tvResultado.setText("Novo salário: R$ " + String.format("%.2f", novoSalario));
        });
    }
}
