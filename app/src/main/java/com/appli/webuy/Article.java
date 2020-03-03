package com.appli.webuy;

public class Article {
    private String Nom;
    private double horsPromoPrice;
    private double PromoPrice;
    private int QteMin;
    private int QteNecessaire;
    private int QteRestante;

    public  Article (String nom, double horsPromo, double promoPrice, int qteMin, int QteNecessaire, int QteRestante){
        this.Nom=nom;
        this.horsPromoPrice=horsPromo;
        this.PromoPrice=promoPrice;
        this.QteMin=qteMin;
        this.QteNecessaire=QteNecessaire;
        this.QteRestante=QteRestante;
    }
    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }
    public double getHorsPromoPrice() {
        return horsPromoPrice;
    }

    public void setHorsPromoPrice(double horsPromoPrice) {
        this.horsPromoPrice = horsPromoPrice;
    }

    public double getPromoPrice() {
        return PromoPrice;
    }

    public void setPromoPrice(double promoPrice) {
        PromoPrice = promoPrice;
    }

    public int getQteMin() {
        return QteMin;
    }

    public void setQteMin(int qteMin) {
        QteMin = qteMin;
    }

    public int getQteNecessaire() {
        return QteNecessaire;
    }

    public void setQteNecessaire(int qteNecessaire) {
        QteNecessaire = qteNecessaire;
    }

    public int getQteRestante() {
        return QteRestante;
    }

    public void setQteRestante(int qteRestante) {
        QteRestante = qteRestante;
    }
}
