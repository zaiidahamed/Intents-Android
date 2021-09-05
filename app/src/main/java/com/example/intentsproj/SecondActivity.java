package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText editNo1, editNo2;
    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent newIntent = getIntent();
        String no1 = newIntent.getStringExtra("EXTRA_MESSAGE1");
        String no2 = newIntent.getStringExtra("EXTRA_MESSAGE2");
        editNo1 = findViewById(R.id.editNo1);
        editNo2 = findViewById(R.id.editNo2);
        editNo1.setText(no1);
        editNo2.setText(no2);

    }

    public void sum(View view){

        results = findViewById(R.id.results);
        int no1 = Integer.parseInt(editNo1.getText().toString());
        int no2 = Integer.parseInt(editNo2.getText().toString());
        int ans = no1 + no2;

        results.setText(editNo1.getText().toString() + " + " + editNo2.getText().toString() + " = " + String.valueOf(ans));
    }

    public void minus(View view){

        results = findViewById(R.id.results);
        int no1 = Integer.parseInt(editNo1.getText().toString());
        int no2 = Integer.parseInt(editNo2.getText().toString());
        int ans = no1 - no2;

        results.setText(editNo1.getText().toString() + " - " + editNo2.getText().toString() + " = " + String.valueOf(ans));
    }

    public void multiply(View view){

        results = findViewById(R.id.results);
        int no1 = Integer.parseInt(editNo1.getText().toString());
        int no2 = Integer.parseInt(editNo2.getText().toString());
        int ans = no1 * no2;

        results.setText(editNo1.getText().toString() + " * " + editNo2.getText().toString() + " = " + String.valueOf(ans));
    }

    public void divide(View view){

        results = findViewById(R.id.results);
        int no1 = Integer.parseInt(editNo1.getText().toString());
        int no2 = Integer.parseInt(editNo2.getText().toString());
        float ans = (float) no1 / no2;

        results.setText(editNo1.getText().toString() + " / " + editNo2.getText().toString() + " = " + String.valueOf(ans));
    }

    public void clear(View view){

        results = findViewById(R.id.results);
        results.setText("");

        editNo1.getText().clear();
        editNo2.getText().clear();
    }

}