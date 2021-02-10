package data;

import modele.gestion.Piece;

import java.io.*;
import java.util.List;

public class Binaire extends Sauvegarde {

    // Charge les données à partir du fichier de sauvegarde
    @Override
    public List<Piece> chargerDonnees() {
        List<Piece> lesPieces = null;
        //Stub stub = new Stub();
        //lesPieces=stub.chargerDonnees();
        try
        {
            FileInputStream fileStream = new FileInputStream("saveManoir");
            ObjectInputStream objectStream = new ObjectInputStream(fileStream);
            lesPieces= (List<Piece>) objectStream.readObject();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return lesPieces;
    }

    // Sauvegarde des données / Liste des différentes pieces du jeu.
    @Override
    public void sauverDonnees(List<Piece> lesPieces) {
        try
        {
            FileOutputStream fileStream = new FileOutputStream("saveManoir");
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
            objectStream.writeObject(lesPieces);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
