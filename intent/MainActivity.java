package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button b;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void inhib(View view) {

        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("Name","Hiba Bincy C");
        i.putExtra("Place","Manjeri");
        i.putExtra("Qualification","MCA");
        i.putExtra("College","KMCT COE");
        startActivity(i);

    }
}