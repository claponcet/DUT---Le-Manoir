package modele.objets;
import modele.actions.Casser;

public class Vase extends Objet {

    public Vase(int positionX, int positionY) {
        super(positionX, positionY, "img/vase.png");
        this.interaction= new Casser();
    }
}
