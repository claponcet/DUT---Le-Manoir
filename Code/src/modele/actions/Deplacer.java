package modele.actions;

import modele.objets.Objet;

public class Deplacer extends Interaction{

    @Override
    public void interagir(Objet objet) {
        objet.setPositionX(objet.getPositionX()+80);
        objet.setCliquable(false);
    }
}
