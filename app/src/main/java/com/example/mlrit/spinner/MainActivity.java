package com.example.mlrit.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spn1,spn2;

    String[] names={"A","B","C","D","E"};
    String[] name={"CSE","ECE","IT","AERO","MECH"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn1=(Spinner) findViewById(R.id.s1);
        spn2=(Spinner) findViewById(R.id.s2);

        ArrayAdapter ad1=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,names);
        spn1.setAdapter(ad1);

        ArrayAdapter ad2=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,name);
        spn2.setAdapter(ad2);
    }
}
