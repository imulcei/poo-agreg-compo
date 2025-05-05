package fr.afpa.model.bo;

import java.util.ArrayList;
import java.util.List;

public class Batiment {
    private String adresse;
    final private int nbPiecesMaxi = 5;
    private int nbPieces;
    private List<Piece> tabPieces;

    public Batiment(String adresse, int nbPieces) {
        this.adresse = adresse;
        this.nbPieces = nbPieces;
        this.tabPieces = new ArrayList<>();
    }

    public List<Piece> nbPiecesDansBatiment() {
        return tabPieces;
    }

    public int nbPiecesMaxiDansBatiment() {
        return nbPiecesMaxi;
    }

    public List<Piece> addPieces(Piece piece) {
        if (tabPieces.size() < nbPiecesMaxi) {
            tabPieces.add(piece);
            nbPieces++;
        } else {
            System.out.println("Nombre maximum de pièces atteint !");
        }
        return tabPieces;
    }

    public int piecesLibres() {
        return nbPiecesMaxi - nbPieces;
    }

    public void affiche() {
        System.out.println("Adresse: " + adresse + ". Nombre de pièces maximum: " + nbPiecesMaxi + ". Il y a "
                + nbPieces + " dans le batiment. Et il reste " + piecesLibres() + " pièce(s) de libre.");
    }
}
