package com.appli.webuy;

import java.util.ArrayList;

public class Magasin {
    private String name;
    private String adress;
    private int cout_mag;
    private ArrayList<Article> articlesList =null;

    public Magasin(){

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCout_mag(int cout_mag) {
        this.cout_mag = cout_mag;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getCout_mag() {
        return cout_mag;
    }
}
