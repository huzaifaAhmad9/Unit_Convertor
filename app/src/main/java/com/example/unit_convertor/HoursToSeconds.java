package com.example.unit_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HoursToSeconds extends AppCompatActivity {

    EditText hi;
    Button cli;
    TextView te;
//    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hours_to_seconds);
        hi=findViewById(R.id.hi);
        cli=findViewById(R.id.cli);
        te=findViewById(R.id.te);
        cli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no= String.valueOf(hi.getText());
                float C= Float.parseFloat(no);
                float F = (C * 3600) ;
                te.setText("Total Seconds Are: "  +F+ " Sec");
            }
        });


    }
}

