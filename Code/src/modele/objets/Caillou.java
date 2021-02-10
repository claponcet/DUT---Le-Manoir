package modele.objets;

import modele.actions.Deplacer;

public class Caillou extends Objet {

    public Caillou(int positionX, int positionY) {
        super(positionX, positionY, "img/caillou.png");
        this.interaction= new Deplacer();
    }
}
