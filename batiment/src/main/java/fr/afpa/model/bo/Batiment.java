package fr.afpa.model.bo;

import java.util.ArrayList;
import java.util.List;

public class Batiment {
    private String adresse;
    final private int nbPiecesMaxi = 5;
    private List<Piece> tabPieces;

    public Batiment(String adresse) {
        setAdresse(adresse);
        this.tabPieces = new ArrayList<>();
    }

    public int nbPiecesDansBatiment() {
        return tabPieces.size();
    }

    public int nbPiecesMaxiDansBatiment() {
        return nbPiecesMaxi;
    }

    public List<Piece> addPieces(int largeur, int hauteur, int profondeur, int nbMeubles, String nom) throws Exception {
        if (tabPieces.size() < nbPiecesMaxi) {
            Piece piece = new Piece(largeur, hauteur, profondeur, nom);
            tabPieces.add(piece);
        } else {
            throw new Exception("Nombre maximum de pièces atteint !");
        }
        return tabPieces;
    }

    public int piecesLibres() {
        return nbPiecesMaxi - nbPiecesDansBatiment();
    }

    public void affiche() {
        System.out.println("Adresse: " + adresse + ". Nombre de pièces maximum: " + nbPiecesMaxi + ". Il y a "
                + nbPiecesDansBatiment() + " pièces dans le batiment. Et il reste " + piecesLibres()
                + " pièce(s) de libre.");
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbPiecesMaxi() {
        return nbPiecesMaxi;
    }

    public List<Piece> getTabPieces() {
        return tabPieces;
    }

    public void setTabPieces(List<Piece> tabPieces) {
        this.tabPieces = tabPieces;
    }

}
