package com.appli.webuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class AchatGroupe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achat_groupe);

        Intent intent_magasin = new Intent(getApplicationContext(), AchatGroupeDetail.class);
        //startActivity(intent_magasin);
    }
}
