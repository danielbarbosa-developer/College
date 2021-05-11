package com.example.senaifirstapp;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText _firstName;
    private EditText _lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _firstName = (EditText) findViewById(R.id.firstNameText);
        _lastName = (EditText) findViewById(R.id.secondNameText);
    }

    public void onClickShow(View v){

        Toast.makeText(MainActivity.this, "Hello " + _firstName.getText() + " " + _lastName.getText(), Toast.LENGTH_LONG).show();
    }

    public void onClickClear(View r){

        _firstName.setText(null);
        _lastName.setText(null);

        _firstName.requestFocus();
    }
}