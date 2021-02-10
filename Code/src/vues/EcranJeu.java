package vues;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import modele.gestion.Manager;
import modele.objets.Objet;

import java.io.IOException;

public class EcranJeu {

    @FXML
    private Pane lePane;
    @FXML
    private Label leLabel;
    @FXML
    private Label numPiece;
    @FXML
    private Button laCle;

    private Manager m;

    public EcranJeu(Manager manager) {
        this.m = manager;
    }

    public void initialize() {
        leLabel.setText(m.laPartie.getPseudo());
        int numeroPiece=m.leJeu.lesPieces.indexOf(m.pieceCourante);
        numPiece.setText("Pièce n°"+(numeroPiece+1));
        this.chargerObjet((Objet)m.cleCourante);
        for (Objet o: m.objetsCourants) {
            chargerObjet(o);
        }
        lePane.setBackground(new Background(new BackgroundImage(new Image(m.pieceCourante.getImg()),BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT)));
    }

    @FXML
    public void clicSauve(ActionEvent actionEvent) throws IOException {
        m.sauverPartie();
        Platform.exit();
    }

    @FXML
    public void clicPorte(ActionEvent actionEvent) throws IOException {
        if (m.cleCourante.isTrouvee()) {
            int numeroPiece=m.leJeu.lesPieces.indexOf(m.pieceCourante);
            if ((numeroPiece+1)==m.leJeu.lesPieces.size()) {
                ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
                Parent container = FXMLLoader.load(getClass().getResource("/fxml/Bravo.fxml"));
                Stage stage=new Stage();
                Scene scene=new Scene(container);
                stage.setScene(scene);
                stage.setTitle("Félicitations !");
                stage.show();
            }
            else {
                //suppression de tous les objets + clé
                suppressionObjet((Objet)m.cleCourante);
                if (m.objetsCourants!=null) {
                    for (Objet o : m.objetsCourants) {
                        suppressionObjet(o);
                    }
                }
                //on change la piece du côté du manager
                m.changementPiece(numeroPiece+1);
                numeroPiece=m.leJeu.lesPieces.indexOf(m.pieceCourante);
                numPiece.setText("Pièce n°"+(numeroPiece+1));
                //on charge les objets et la clé
                chargerObjet((Objet)m.cleCourante);
                for (Objet o: m.objetsCourants) {
                    chargerObjet(o);
                }
                //on actualise le fond
                lePane.setBackground(new Background(new BackgroundImage(new Image(m.pieceCourante.getImg()),BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT)));
            }
        }
    }

    public void chargerObjet(Objet objet)
    {
        ImageView img = new ImageView(objet.getImg());
        objet.imgProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldImg, String newImg) {
                img.setImage(new Image(newImg));
            }
        });
        img.layoutXProperty().bind(objet.positionXProperty());
        img.layoutYProperty().bind(objet.positionYProperty());
        img.setUserData(objet); //pour pouvoir retrouver le bon imageView et le supprimer lors du changement de pièce
        img.setPickOnBounds(true); //pour pouvoir cliquer dans une zone vide
        img.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent mouseEvent) {
                if (objet.isCliquable()) {objet.getInteraction().interagir(objet);}
            }
        });
        lePane.getChildren().add(img);
    }

    public void suppressionObjet(Objet objet) {
        //on cherche l'objet parmi les children du pane
        Node objetASupprimer=new ImageView();
        for (Node node : lePane.getChildren()) {
            if (node.getUserData() == objet) {
                objetASupprimer=node;
            }
        }
        //on supprime l'objet
        lePane.getChildren().remove(objetASupprimer);
    }
}
