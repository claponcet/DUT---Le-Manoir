package modele.gestion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SauvegardePartie {

    public void sauver(Partie partie) {
        try
        {
            FileOutputStream fileStream = new FileOutputStream("savePartie");
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
            objectStream.writeObject(partie.getPseudo());
            objectStream.writeObject(partie.niveau);
            objectStream.close();
            fileStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
