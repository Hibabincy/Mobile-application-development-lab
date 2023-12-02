package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.data);

        Bundle extra = getIntent().getExtras();
        String t1 = extra.getString("Name");
        String t2 = extra.getString("Place");
        String t3 = extra.getString("Qualification");
        String t4 = extra.getString("College");
        tv.setText("Name: "+t1+"\nPlace: "+t2+"\nQualification: "+t3+"\nCollege: "+t4);

    }
}