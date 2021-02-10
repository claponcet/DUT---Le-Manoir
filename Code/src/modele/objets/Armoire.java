package modele.objets;

import modele.actions.Ouvrir;

public class Armoire extends Objet {

    public Armoire(int positionX, int positionY) {
        super(positionX, positionY, "img/armoireFermee.png");
        this.interaction= new Ouvrir();
    }
}
