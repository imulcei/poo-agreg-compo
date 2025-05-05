package fr.afpa;

import fr.afpa.model.bo.Batiment;
import fr.afpa.model.bo.Meuble;
import fr.afpa.model.bo.Piece;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Meuble table = new Meuble(150, 100, 90, "Table");
        Meuble chaise = new Meuble(80, 120, 80, "Chaise");

        Piece salleAManger = new Piece(500, 250, 400, "Salle à manger", 2);
        table.affiche();
        chaise.affiche();
        salleAManger.affiche();

        salleAManger.addMeubles(table);
        salleAManger.addMeubles(chaise);
        salleAManger.affiche();

        Batiment maison = new Batiment("123 rue de Brest", 5);
        maison.affiche();
        
    }
}
