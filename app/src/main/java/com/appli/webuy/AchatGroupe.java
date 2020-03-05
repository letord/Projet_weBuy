package com.appli.webuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class AchatGroupe extends AppCompatActivity implements DetecteurDeClicSurRecycler{

    private RecyclerView mRecyclerView;
    private ArticlesFicheRecyclerViewAdapteur mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private Intent intent_article=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magasin);

        Bundle extras = getIntent().getExtras();
        int id = extras.getInt("magasins_id");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        intent_article = new Intent(getApplicationContext(), AchatGroupeDetail.class);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new ArticlesFicheRecyclerViewAdapteur(getDataSource());
        mRecyclerView.setAdapter(mAdapter);
    }
    private ArrayList<Article> getDataSource() {
        ArrayList results = new ArrayList<Article>();
        for (int index = 0; index < 20; index++) {
            Article art = new Article("Lait Lactel",8, 6, 2,2, 5);
            results.add(index, art);
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
        intent_article.putExtra("id_article",position);
        startActivity(intent_article);
    }
}
