package com.appli.webuy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class MagasinFicheRecyclerViewAdapteur extends RecyclerView.Adapter<MagasinFicheRecyclerViewAdapteur.ConteneurDeDonnee> {

    private ArrayList<Magasin> magasins;
    private static DetecteurDeClicSurRecycler detecteurDeClicSurRecycler;

    public MagasinFicheRecyclerViewAdapteur(ArrayList<Magasin> magasins) {
        this.magasins = magasins;
    }

    @Override
    public ConteneurDeDonnee onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.magasinfiche, parent, false);
        return new ConteneurDeDonnee(view);
    }

    @Override
    public void onBindViewHolder(ConteneurDeDonnee conteneur, int position) {
        conteneur.nom_magasin.setText("Carrefour");
        conteneur.adress.setText( "adress : "+ "5, Rue de la ville aux Clercs, Fontaine Raoul");
        conteneur.nb_promos.setText("5");
    }

    @Override
    public int getItemCount() {
        return magasins.size();
    }

    public void setDetecteurDeClicSurRecycler(DetecteurDeClicSurRecycler detecteurDeClicSurRecycler) {
        this.detecteurDeClicSurRecycler = detecteurDeClicSurRecycler;
    }
    public  static class ConteneurDeDonnee extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView nom_magasin;
        TextView adress;
        TextView nb_promos;

        public ConteneurDeDonnee(View itemView) {
            super(itemView);
            nom_magasin = (TextView) itemView.findViewById(R.id.nom_magasin);
            adress = (TextView) itemView.findViewById(R.id.hors_promo);
            nb_promos = (TextView) itemView.findViewById(R.id.promos);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            detecteurDeClicSurRecycler.clicSurRecyclerItem(getAdapterPosition(), v);
        }
    }
}