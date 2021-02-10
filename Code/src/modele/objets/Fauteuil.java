package modele.objets;

import modele.actions.Deplacer;

public class Fauteuil extends Objet {

    public Fauteuil(int positionX, int positionY) {
        super(positionX, positionY, "img/fauteuil.png");
        this.interaction= new Deplacer();
    }
}
