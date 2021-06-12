package com.example.gestionetudiant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void afficher(View view) {
        Intent intent = new Intent(MainActivity.this ,AfficherEtudiants.class) ;
        startActivity(intent) ;
    }

    public void ajouter(View view) {
        Intent intent = new Intent(MainActivity.this ,AjouterEtudiant.class) ;
        startActivity(intent) ;
    }
}