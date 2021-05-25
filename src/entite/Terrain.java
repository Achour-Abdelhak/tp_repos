/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author achab
 */
public class Terrain {
    private int type_Terrain;

    public int getType_Terrain() {
        return type_Terrain;
    }

    public void setType_Terrain(int type_Terrain) {
        this.type_Terrain = type_Terrain;
    }

    public double getPrix_m2_min() {
        return prix_m2_min;
    }

    public void setPrix_m2_min(double prix_m2_min) {
        this.prix_m2_min = prix_m2_min;
    }

    public double getPrix_m2_max() {
        return prix_m2_max;
    }

    public void setPrix_m2_max(double prix_m2_max) {
        this.prix_m2_max = prix_m2_max;
    }
    private double prix_m2_min;
    private double prix_m2_max;
    private ArrayList<Lot> lotissement ; 

    public Terrain() {
        lotissement = new ArrayList<>();
    }

    public ArrayList<Lot> getLotissement() {
        return lotissement;
    }

    
    
}
