package com.exemplo.checkboxcompras;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox cbArroz, cbLeite, cbCarne, cbFeijao, cbRefrigerante;
    Button btnCalcular;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbArroz = findViewById(R.id.cbArroz);
        cbLeite = findViewById(R.id.cbLeite);
        cbCarne = findViewById(R.id.cbCarne);
        cbFeijao = findViewById(R.id.cbFeijao);
        cbRefrigerante = findViewById(R.id.cbRefrigerante);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);

        btnCalcular.setOnClickListener(v -> {
            double total = 0;
            if (cbArroz.isChecked()) total += 2.69;
            if (cbLeite.isChecked()) total += 2.70;
            if (cbCarne.isChecked()) total += 16.70;
            if (cbFeijao.isChecked()) total += 3.38;
            if (cbRefrigerante.isChecked()) total += 3.00;

            tvResultado.setText("Total da compra: R$ " + String.format("%.2f", total));
        });
    }
}
