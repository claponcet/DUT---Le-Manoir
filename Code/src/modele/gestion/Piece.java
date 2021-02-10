package modele.gestion;

import modele.objets.Cle;
import modele.objets.Objet;

import java.util.List;

public class Piece {
    private String img;
    private List<Objet> listeObjets;
    private Cle cle;

    public Piece(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public List<Objet> getListeObjets() {
        return listeObjets;
    }

    public void setListeObjets(List<Objet> listeObjets) {
        this.listeObjets = listeObjets;
    }

    public Cle getCle() {
        return cle;
    }

    public void setCle(Cle cle) {
        this.cle = cle;
    }
}
