package com.appli.webuy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class ArticlesFicheRecyclerViewAdapteur extends RecyclerView.Adapter<ArticlesFicheRecyclerViewAdapteur.ConteneurDeDonnee> {

    private ArrayList<Article> articles;
    private static DetecteurDeClicSurRecycler detecteurDeClicSurRecycler;

    public ArticlesFicheRecyclerViewAdapteur(ArrayList<Article> articles) {
        this.articles = articles;
    }

    @Override
    public ConteneurDeDonnee onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.articlesfiche, parent, false);
        return new ConteneurDeDonnee(view);
    }

    @Override
    public void onBindViewHolder(ConteneurDeDonnee conteneur, int position) {
        Article article =articles.get(position);
        conteneur.nom_article.setText(article.getNom());
        conteneur.prix_horsPromo.setText( "prix hors promos :"+ article.getHorsPromoPrice()+"€");
        conteneur.prix_promos.setText("prix promos"+article.getPromoPrice()+"€");
        conteneur.qteMin.setText("quantité min :"+article.getQteMin());
        conteneur.qte_a_acheter.setText("quantité à acheter :"+article.getQteNecessaire());
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    public void setDetecteurDeClicSurRecycler(DetecteurDeClicSurRecycler detecteurDeClicSurRecycler) {
        this.detecteurDeClicSurRecycler = detecteurDeClicSurRecycler;
    }
    public  static class ConteneurDeDonnee extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView nom_article;
        TextView prix_horsPromo;
        TextView prix_promos;
        TextView qteMin;
        TextView qte_a_acheter;

        public ConteneurDeDonnee(View itemView) {
            super(itemView);
            nom_article = (TextView) itemView.findViewById(R.id.nom_article);
            prix_horsPromo = (TextView) itemView.findViewById(R.id.hors_promo);
            prix_promos = (TextView) itemView.findViewById(R.id.prix_promo);
            qteMin = (TextView) itemView.findViewById(R.id.qteMin);
            qte_a_acheter = (TextView) itemView.findViewById(R.id.Qte_acheter);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            detecteurDeClicSurRecycler.clicSurRecyclerItem(getAdapterPosition(), v);
        }
    }
}