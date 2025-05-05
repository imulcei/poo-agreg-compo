package fr.afpa.model.bo;

public class Meuble {
    private int largeur;
    private int hauteur;
    private int profondeur;
    private String nom;

    public Meuble(int largeur, int hauteur, int profondeur, String nom) {
        setLargeur(largeur);
        setHauteur(hauteur);
        setProfondeur(profondeur);
        setNom(nom);
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

}
