package fr.afpa.model.bo;

import java.util.ArrayList;
import java.util.List;

public class Piece {
    private int largeur;
    private int hauteur;
    private int profondeur;
    private String nom;
    final private int nbMeublesMaxi = 6;
    private List<Meuble> tabMeubles;

    public Piece(int largeur, int hauteur, int profondeur, String nom) {
        setLargeur(largeur);
        setHauteur(hauteur);
        setProfondeur(profondeur);
        setNom(nom);
        this.tabMeubles = new ArrayList<>();
    }

    public Piece(List<Meuble> tabMeubles) {
        this.tabMeubles = tabMeubles;
    }

    public int howManyMeubles() {
        return tabMeubles.size();
    }

    public int howManyMeublesMaxi() {
        return this.nbMeublesMaxi;
    }

    public List<Meuble> addMeubles(Meuble meuble) {
        if (tabMeubles.size() < nbMeublesMaxi) {
            tabMeubles.add(meuble);
        } else {
            System.out.println("Nombre maximum de meubles atteint !");
        }
        return tabMeubles;
    }

    public long volume() {
        return largeur * profondeur * hauteur;
    };

    public long surface() {
        return largeur * profondeur;
    };

    public long surfaceMeubles() {
        long result = 0;
        for (Meuble meuble : tabMeubles) {
            result += meuble.surface();
        }
        return result;
    };

    public long surfaceLibre() {
        return surface() - surfaceMeubles();
    }

    public void affiche() {
        System.out.println("Nom: " + nom + ". Hauteur: " + hauteur + " cm. Largeur: " + largeur
                + " cm. Profondeur: " + profondeur + " cm. Nombre de meubles: " + howManyMeubles()
                + ".");
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getProfondeur() {
        return profondeur;
    }

    public void setProfondeur(int profondeur) {
        this.profondeur = profondeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbMeublesMaxi() {
        return nbMeublesMaxi;
    }

    public List<Meuble> getTabMeubles() {
        return tabMeubles;
    }

    public void setTabMeubles(List<Meuble> tabMeubles) {
        this.tabMeubles = tabMeubles;
    }

}
