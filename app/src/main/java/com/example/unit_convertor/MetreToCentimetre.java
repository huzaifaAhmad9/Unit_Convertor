package com.example.unit_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MetreToCentimetre extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView textView;
//    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metre_to_centimetre);
        editText=findViewById(R.id.hint);
        btn=findViewById(R.id.click);
        textView=findViewById(R.id.his);
//        exit.findViewById(R.id.exit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no= String.valueOf(editText.getText());
                float C= Float.parseFloat(no);
                float F = (C * 100) ;
                textView.setText("Value in Centimetre is: " +F+" cm");
            }
        });

//           exit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MetreToCentimetre.this,MainActivity.class);
//                startActivity(intent);
//                finish();
//                onBackPressed();
//            }
//        });


            }
        }

