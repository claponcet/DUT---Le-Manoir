package modele.objets;

import modele.actions.Decrocher;

public class Cadre extends Objet{

    public Cadre(int positionX, int positionY) {
        super(positionX, positionY, "img/cadre.png");
        this.interaction= new Decrocher();
    }
}
