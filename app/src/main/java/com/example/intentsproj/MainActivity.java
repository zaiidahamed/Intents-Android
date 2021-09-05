package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNo1, editTextNo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadSecondActivity (View view){

        Intent intent = new Intent(this, SecondActivity.class);
        editTextNo1 = findViewById(R.id.editTextNo1);
        editTextNo2 = findViewById(R.id.editTextNo2);

        //assign to string variables
        String no1 = editTextNo1.getText().toString();
        String no2 = editTextNo2.getText().toString();

        //putExtra to carry on to next activity
        intent.putExtra("EXTRA_MESSAGE1", no1);
        intent.putExtra("EXTRA_MESSAGE2", no2);

        startActivity(intent);

        Toast.makeText(this, "Do your calculations!", Toast.LENGTH_SHORT).show();

    }
}