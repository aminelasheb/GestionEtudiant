package com.example.gestionetudiant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class AjouterEtudiant extends AppCompatActivity {
     ArrayAdapter arrayAdapter;
     AutoCompleteTextView sexe ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter_etudiant);
        List<String> items=new ArrayList<String>();
        sexe=findViewById(R.id.sexe) ;
        items.add("Male") ;
        items.add("Female") ;
        arrayAdapter = new ArrayAdapter<String>(this,R.layout.list_item,items);
        sexe.setAdapter(arrayAdapter);



    }

    public void ajouter(View view) {
    }
}