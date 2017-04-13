package com.example.biz.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button xSubmit;
    EditText xInputString, xInputNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent xMyIntent = new Intent(this, Main2Activity.class);

        xSubmit = (Button) findViewById(R.id.submit);
        xInputString = (EditText) findViewById(R.id.input_string);
        xInputNumber = (EditText) findViewById(R.id.input_number);

        xSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                xMyIntent.putExtra("ATTRIBUTO_STRINGOSO", xInputString.getText().toString());
                xMyIntent.putExtra("ATTRIBUTO_NUMEROSO", xInputString.getText());
                startActivity(xMyIntent);

            }
        });
    }
}
