package menu;

import modele.gestion.Manager;
import modele.gestion.Piece;
import modele.objets.Cle;
import modele.objets.Objet;

import java.util.List;

public class Test {
    Manager m = new Manager();
    Piece courante  = m.leJeu.lesPieces.get(0);
    List<Objet> objetsCourants = courante.getListeObjets();
    Cle cleCourante = courante.getCle();

    public void leTest() {
        m.chargerPartie();
        m.initialiser();
        System.out.println(m.laPartie.getPseudo());
        System.out.println(cleCourante.getPositionX());
        System.out.println(cleCourante.getPositionY());
        System.out.println(cleCourante.isTrouvee());
        cleCourante.getInteraction().interagir(cleCourante);
        System.out.println(cleCourante.isTrouvee());
        for (Objet o : objetsCourants) {
            System.out.println("Position objet avant interaction :");
            System.out.println(o.getPositionX());
            System.out.println(o.getPositionY());
            System.out.println("is cliquable ? :");
            System.out.println(o.isCliquable());
            o.getInteraction().interagir(o);
            System.out.println("Position objet après interaction :");
            System.out.println(o.getPositionX());
            System.out.println(o.getPositionY());
            System.out.println("is cliquable ? :");
            System.out.println(o.isCliquable());
        }
    }

}
