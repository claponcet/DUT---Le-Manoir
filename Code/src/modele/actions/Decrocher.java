package modele.actions;

import modele.objets.Cadre;
import modele.objets.Objet;

public class Decrocher extends Interaction{

    @Override
    public void interagir(Objet objet) {
        if (objet instanceof Cadre) {
            objet.setCliquable(false);
            objet.setPositionY(163);
        }
    }
}
