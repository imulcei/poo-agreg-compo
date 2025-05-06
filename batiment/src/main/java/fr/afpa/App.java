package fr.afpa;

import fr.afpa.model.bo.Batiment;
import fr.afpa.model.bo.Meuble;
import fr.afpa.model.bo.Piece;

public class App {

    // TODO Gérer les messages avec des Exceptions au lieu de println()
    public static void main(String[] args) {
        Meuble table = new Meuble(150, 100, 90, "Table");
        Meuble chaise = new Meuble(80, 120, 80, "Chaise");

        Piece salleAManger = new Piece(400, 250, 250, "Salle à manger");
        salleAManger.addMeubles(table);
        salleAManger.addMeubles(chaise);
        salleAManger.affiche();

        Batiment maison = new Batiment("123 rue de Brest");
        maison.addPieces(400, 250, 300, 2, "Salon");
        maison.affiche();

    }
}
