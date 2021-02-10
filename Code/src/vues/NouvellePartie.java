package vues;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import modele.gestion.Manager;

import java.io.IOException;

public class NouvellePartie {

    @FXML
    private TextField leFieldPseudo;
    @FXML
    private Button btnJouer;

    private Manager m;
    private EcranJeu ecranJeu;

    public NouvellePartie(Manager m) {
        this.m=m;
        m.initialiser();
    }

    public void initialize() {
        leFieldPseudo.textProperty().bindBidirectional(m.laPartie.pseudoProperty());
    }

    @FXML
    public void clicJouer(ActionEvent actionEvent) {
        try {
            ecranJeu =new EcranJeu(m);
            FXMLLoader leLoader = new FXMLLoader(getClass().getResource("/fxml/EcranJeu.fxml"));
            leLoader.setController(ecranJeu);
            Region region = leLoader.load();
            Scene scene = new Scene(region);

            Stage stage = (Stage) btnJouer.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }catch (IOException io){
            io.printStackTrace();
        }
    }

}
