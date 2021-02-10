package modele.actions;

import modele.objets.Objet;
import modele.objets.Vase;

public class Casser extends Interaction{

    @Override
    public void interagir(Objet objet) {
        if (objet instanceof Vase) {
            objet.setImg("img/vaseCasse.png");
            objet.setCliquable(false);
            objet.setPositionY(objet.getPositionY()+60);
        }
    }
}
