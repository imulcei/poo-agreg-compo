package fr.afpa.model.bo;

public class Meuble {
    private int largeur;
    private int hauteur;
    private int profondeur;
    private String nom;

    // TODO
    // Utiliser les setters pour mettre à jour les attributs
    public Meuble(int largeur, int hauteur, int profondeur, String nom) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.profondeur = profondeur;
        this.nom = nom;
    }

    public long volume() {
        return this.largeur * this.hauteur * this.profondeur;
    }

    public long surface() {
        return largeur * profondeur;
    }

    public void affiche() {
        System.out.println("Nom: " + this.nom + ". Hauteur: " + this.hauteur + " cm. Largeur: " + this.largeur
                + " cm. Profondeur: " + this.profondeur + " cm.");
    }
}
