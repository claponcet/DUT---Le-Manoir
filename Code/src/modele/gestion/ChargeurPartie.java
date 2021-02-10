package modele.gestion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ChargeurPartie {

    // Permet de retourner/charger une partie
    public Partie charger() {
        Partie partie = new Partie(0,"pseudo");
        try {
            FileInputStream fileStream = new FileInputStream("savePartie");
            ObjectInputStream objectStream = new ObjectInputStream(fileStream);
            partie.setPseudo((String)objectStream.readObject());
            partie.niveau = (int)objectStream.readObject();
            objectStream.close();
            fileStream.close();
        } catch ( IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return partie;
    }
}
