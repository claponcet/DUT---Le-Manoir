package modele.actions;

import modele.objets.Armoire;
import modele.objets.Objet;

public class Ouvrir extends Interaction{

    @Override
    public void interagir(Objet objet) {
        if (objet instanceof Armoire) {
            objet.setImg("img/armoireOuverte.png");
            objet.setCliquable(false);
        }
    }
}
