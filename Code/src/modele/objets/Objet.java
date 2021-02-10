package modele.objets;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import modele.actions.Interaction;

public abstract class Objet {

    private IntegerProperty positionX = new SimpleIntegerProperty();
        public IntegerProperty positionXProperty() { return positionX; }
        public int getPositionX() { return positionX.get(); }
        public void setPositionX(int value) { positionX.set(value);}
    private IntegerProperty positionY = new SimpleIntegerProperty();
        public IntegerProperty positionYProperty() { return positionY; }
        public int getPositionY() { return positionY.get(); }
        public void setPositionY(int value) { positionY.set(value);}
    private StringProperty img = new SimpleStringProperty();
        public StringProperty imgProperty() { return img; }
        public String getImg() { return img.get(); }
        public void setImg(String value) { img.set(value); }
        
    private boolean cliquable=true;
    protected Interaction interaction;

    public Objet(int positionX, int positionY, String img){
        this.positionX.set(positionX);
        this.positionY.set(positionY);
        this.img.set(img);
    }

    public boolean isCliquable() {
        return cliquable;
    }

    public void setCliquable(boolean cliquable) {
        this.cliquable = cliquable;
    }

    public Interaction getInteraction() {
        return interaction;
    }

    public void setInteraction(Interaction interaction) {
        this.interaction = interaction;
    }
}
