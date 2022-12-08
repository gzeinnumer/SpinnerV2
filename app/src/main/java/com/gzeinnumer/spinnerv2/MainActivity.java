package com.gzeinnumer.spinnerv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

//https://www.wildantechnoart.net/2018/01/belajar-cara-membuat-spinner-di-android-studio.html
public class MainActivity extends AppCompatActivity {

    private String[] Item = {"Bakso","Ayam Goreng","Mie Rebus","Nasi Padang",
            "Ikan Bakar","Seblak","Gorengan","Mie Ayam"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner List = findViewById(R.id.listItem);

        //Inisialiasi Array Adapter dengan memasukkan String Array
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item,Item);

        //Memasukan Adapter pada Spinner
        List.setAdapter(adapter);

        //Mengeset listener untuk mengetahui event/aksi saat item dipilih
        List.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Saya Memesan "+adapter.getItem(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView adapterView) {

            }
        });

        Button Submit = findViewById(R.id.submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Saya Memesan "+List.getSelectedItem(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}