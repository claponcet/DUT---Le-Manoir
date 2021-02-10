package data;

import modele.gestion.Piece;

import java.util.List;

public abstract class Sauvegarde {

    public List<Piece> lesPieces;

    public abstract List<Piece> chargerDonnees();

    public abstract void sauverDonnees(List<Piece> lesPieces);
}
