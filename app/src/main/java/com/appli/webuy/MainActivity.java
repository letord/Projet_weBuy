package com.appli.webuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button mag_button=null;
    private Intent intent_acceuil=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acceuil_main);

        mag_button=findViewById(R.id.button_Mag);
        intent_acceuil = new Intent(getApplicationContext(), MagasinActivity.class);

        mag_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent_acceuil);
            }
        });
    }
}
