package modele.objets;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import modele.actions.Trouver;

public class Cle extends Objet {

    private BooleanProperty trouvee = new SimpleBooleanProperty();
        public BooleanProperty trouveeProperty(){ return trouvee; }
        public Boolean isTrouvee() {return trouvee.get();}
        public void setTrouvee(boolean trouvee) {this.trouvee.set(trouvee);}


    public Cle(int positionX, int positionY) {
        super(positionX, positionY, "img/cle.png");
        this.setTrouvee(false);
        this.interaction=new Trouver();
    }
  /*  public boolean isTrouvee() { return trouvee; }

    public void setTrouvee(boolean trouvee) {
        this.trouvee = trouvee;
    }
  */
}
