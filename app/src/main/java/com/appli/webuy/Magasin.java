package com.appli.webuy;

import android.widget.ImageView;

import java.util.ArrayList;

public class Magasin {

    private ImageView logo;
    private String name;
    private String adress;
    private int count_mag;
    private ArrayList<Article> articlesList =null;

    public Magasin(String name, String adress, int count){
        this.name=name;
        this.adress=adress;
        this.count_mag=count;
        this.articlesList=new ArrayList<Article>();
    }
    public Magasin(String name, String adress, int count, ArrayList<Article> listeArticle){
        this.name=name;
        this.adress=adress;
        this.count_mag=count;
        this.articlesList=listeArticle;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCout_mag(int cout_mag) {
        this.count_mag = cout_mag;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getCout_mag() {
        return count_mag;
    }

    public ArrayList<Article> getArticlesList() {
        return articlesList;
    }

    public void setArticlesList(ArrayList<Article> articlesList) {
        this.articlesList = articlesList;
    }

}
