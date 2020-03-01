package com.appli.webuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MagasinActivity extends AppCompatActivity {

    ArrayList<Magasin> MagList = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magasin);

        Intent intent_magasin = new Intent(getApplicationContext(), AchatGroupe.class);
        //startActivity(intent_magasin);
    }
}
