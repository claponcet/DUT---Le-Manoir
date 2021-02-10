package modele.gestion;

import modele.objets.Cle;
import modele.objets.Objet;

import java.util.List;

public class Manager {

    public Jeu leJeu;
    public Partie laPartie;

    public Piece pieceCourante;
    public List<Objet> objetsCourants;
    public Cle cleCourante;

    private CreateurJeu createurJeu =new CreateurJeu();
    private GestionnairePartie gestionPartie = new GestionnairePartie();


    public Manager(){
        leJeu = createurJeu.chargerJeu();
    }

    public void initialiser () {
        if (laPartie == null) {
            laPartie = new Partie(0,"pseudo");
        }
        pieceCourante = leJeu.lesPieces.get(laPartie.niveau);
        cleCourante = pieceCourante.getCle();
        objetsCourants = pieceCourante.getListeObjets();
    }

    public void chargerPartie() {
        laPartie=gestionPartie.charger();
    }

    public void sauverPartie() {
        gestionPartie.sauver(laPartie);
    }

    public void changementPiece(int newIndex) {
        pieceCourante = leJeu.lesPieces.get(newIndex);
        cleCourante = pieceCourante.getCle();
        objetsCourants = pieceCourante.getListeObjets();
        laPartie.niveau=newIndex;
    }
}
