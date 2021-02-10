package modele.gestion;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.Serializable;

public class Partie implements Serializable {
    public int niveau;

    private StringProperty pseudo = new SimpleStringProperty();
        public StringProperty pseudoProperty(){ return pseudo; }
        public String getPseudo() {return pseudo.get();}
        public void setPseudo(String valeur) {pseudo.set(valeur);}

    public Partie(int niveau, String pseudo) {
        this.niveau = niveau;
        this.pseudo.set(pseudo);
    }
}
