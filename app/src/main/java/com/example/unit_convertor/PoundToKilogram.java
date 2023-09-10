package com.example.unit_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PoundToKilogram extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView textView;
//    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pound);
        editText=findViewById(R.id.hint);
        btn=findViewById(R.id.click);
        textView=findViewById(R.id.his);
//        exit.findViewById(R.id.exit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no= String.valueOf(editText.getText());
                float C= Float.parseFloat(no);
                 float F = (float) (C * 0.45359237);
                textView.setText("Value in Kilogram is: " +F+" Kg");
            }
        });



    }
}

