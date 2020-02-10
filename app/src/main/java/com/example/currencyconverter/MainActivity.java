package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        EditText myTextField = (EditText) findViewById(R.id.editText);
        String str = myTextField.getText().toString();
        gotToActivity2(str);
    }

    public void gotToActivity2(String s){
        Intent intent = new Intent(this, Main2Activity.class);
        String str = String.valueOf(Double.valueOf(s)*0.77);
        intent.putExtra("message",str);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
