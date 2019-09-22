package com.example.harjoitukset4ja5;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText plusNum1, plusNum2;
    private Button plusNappi;
    private TextView plusTulos;
    private Button tyhjennaNappi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LogMsg.LOG,"Ohjelma käynnistyy");
        setContentView(R.layout.activity_main);
        addListenerPlusNappi();
        addListenerTyhjenna();
    }

    private void addListenerTyhjenna() {
        tyhjennaNappi = (Button) findViewById(R.id.tyhjennaNappi);
        plusTulos = (TextView) findViewById(R.id.plusTulos);

        tyhjennaNappi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plusTulos.setText("");
            }
        });
    }

    private void addListenerPlusNappi() {
        plusNum1 = (EditText) findViewById(R.id.plusEka);
        plusNum2 = (EditText) findViewById(R.id.plusToka);
        plusNappi = (Button) findViewById(R.id.plusNappi);
        plusTulos =(TextView) findViewById(R.id.plusTulos);

        plusNappi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstNum = plusNum1.getText().toString();
                String secondNum = plusNum2.getText().toString();
                int a = Integer.parseInt(firstNum);
                int b = Integer.parseInt(secondNum);
                int sum = a + b;
                plusTulos.setText(Integer.toString(sum));
            }
        });
    }
}
