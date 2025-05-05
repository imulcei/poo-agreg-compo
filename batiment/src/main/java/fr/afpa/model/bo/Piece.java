package fr.afpa.model.bo;

import java.util.ArrayList;
import java.util.List;

public class Piece {
    private int largeur;
    private int hauteur;
    private int profondeur;
    private String nom;
    final private int nbMeublesMaxi = 6;
    private int nbMeubles;
    private List<Meuble> tabMeubles;

    public Piece(int largeur, int hauteur, int profondeur, String nom, int nbMeubles) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.profondeur = profondeur;
        this.nom = nom;
        this.nbMeubles = nbMeubles;
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
            nbMeubles++;
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
                + " cm. Profondeur: " + profondeur + " cm. Nombre de meubles: " + nbMeubles
                + ".");
    }

}
