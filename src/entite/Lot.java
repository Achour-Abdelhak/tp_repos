/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

/**
 *
 * @author achab
 */
public class Lot {
    
private int type;
private String description;
private int nombre_droits_passage,nombre_services;
private double superficie;

 public Lot(int type) {
        this.type = type;
    } 

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNombre_droits_passage() {
        return nombre_droits_passage;
    }

    public void setNombre_droits_passage(int nombre_droits_passage) {
        this.nombre_droits_passage = nombre_droits_passage;
    }

    public int getNombre_services() {
        return nombre_services;
    }

    public void setNombre_services(int nombre_services) {
        this.nombre_services = nombre_services;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Lot{" + "type=" + type + ", description=" + description + ", nombre_droits_passage=" + nombre_droits_passage + ", nombre_services=" + nombre_services + ", superficie=" + superficie + '}';
    }

    
}