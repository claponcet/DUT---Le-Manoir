package modele.gestion;

import data.Stub;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class CreateurJeu {

    // Permet de retourner/charger un Jeu.
    public Jeu chargerJeu() {
        Jeu jeu = new Jeu();
        List<Piece> listePieces = null;
        try {
            FileInputStream fileStream = new FileInputStream("saveManoir");
            ObjectInputStream objectStream = new ObjectInputStream(fileStream);
            listePieces = (List<Piece>) objectStream.readObject();
        } catch ( IOException | ClassNotFoundException e) {
            Stub stub = new Stub();
            listePieces=stub.chargerDonnees();
        }

        jeu.lesPieces=listePieces;
        return jeu;
    }
}
