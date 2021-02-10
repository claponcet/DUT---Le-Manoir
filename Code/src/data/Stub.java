package data;

import modele.gestion.Piece;
import modele.objets.*;

import java.util.ArrayList;
import java.util.List;

public class Stub extends Sauvegarde{

    @Override
    public List<Piece> chargerDonnees() {
        List<Piece> lesPieces=new ArrayList<>();
        Piece piece0=new Piece("img/fondPiece0.jpg");
        piece0.setCle(new Cle(200,250));
        List<Objet> lesObjets0 = new ArrayList<Objet>();
        lesObjets0.add(new Caillou(190,240));
        piece0.setListeObjets(lesObjets0);
        Piece piece1=new Piece("img/fondPiece.jpg");
        List<Objet> lesObjets1 = new ArrayList<Objet>();
        lesObjets1.add(new Vase(480,25));
        lesObjets1.add(new Caillou(450,250));
        lesObjets1.add(new Cadre(300,50));
        lesObjets1.add(new Fauteuil(90,150));
        piece1.setListeObjets(lesObjets1);
        piece1.setCle(new Cle(100,200));
        Piece piece2=new Piece("img/fondPiece.jpg");
        List<Objet> lesObjets2 = new ArrayList<>();
        lesObjets2.add(new Vase(280,180));
        lesObjets2.add(new Armoire(100,0));
        lesObjets2.add(new Fauteuil(50,150));
        lesObjets2.add(new Fauteuil(300,150));
        piece2.setListeObjets(lesObjets2);
        piece2.setCle(new Cle(300,200));

        lesPieces.add(piece0);
        lesPieces.add(piece1);
        lesPieces.add(piece2);

        return lesPieces;
    }

    @Override
    public void sauverDonnees(List<Piece> lesPieces) {
        return;
    }
}
