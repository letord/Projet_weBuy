package com.appli.webuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MagasinActivity extends AppCompatActivity implements DetecteurDeClicSurRecycler {

    private RecyclerView mRecyclerView;
    private MagasinFicheRecyclerViewAdapteur mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private Intent intent_magasin=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magasin);

        intent_magasin = new Intent(getApplicationContext(), AchatGroupe.class);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MagasinFicheRecyclerViewAdapteur(getDataSource());
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<Magasin> getDataSource() {
        ArrayList results = new ArrayList<Magasin>();
        for (int index = 0; index < 20; index++) {
            Magasin mag = new Magasin("Carrefour","Maison ", 4);
            results.add(index, mag);
        }
        return results;
    }
    @Override
    protected void onResume() {
        super.onResume();
        mAdapter.setDetecteurDeClicSurRecycler(this);
    }

    @Override
    public void clicSurRecyclerItem(int position, View v) {
        intent_magasin.putExtra("id_magasin",position);
        startActivity(intent_magasin);
    }
}
