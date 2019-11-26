package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Picker extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spCountries;
    ArrayList<String>countrylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);
        spCountries = findViewById(R.id.spCountry);
        ArrayAdapter<CharSequence> marrayAdapter = ArrayAdapter.createFromResource(this,R.array.array_country,android.R.layout.simple_spinner_item);
        marrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spCountries.setAdapter(marrayAdapter);
        spCountries.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        Toast.makeText(this,parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
