package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice1);

        final TextView text = findViewById(R.id.title);
        final EditText editText = findViewById(R.id.Edit_view1);
        Button button = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = text.getText().toString();
                b = b.substring(0, b.length()-1);


                text.setText(b);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();

                text.setText(text.getText() + a);
            }
        });

    }
}
