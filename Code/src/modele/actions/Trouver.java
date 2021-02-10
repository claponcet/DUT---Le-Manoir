package modele.actions;

import modele.objets.Cle;
import modele.objets.Objet;

public class Trouver extends Interaction{

    @Override
    public void interagir(Objet objet) {
        if (objet instanceof Cle && !((Cle) objet).isTrouvee()) {
            ((Cle) objet).setTrouvee(true);
            objet.setPositionX(538);
            objet.setPositionY(355);
            objet.setCliquable(false);
        }
    }
}
