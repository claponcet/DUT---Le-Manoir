package vues;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import modele.gestion.Manager;

import java.io.IOException;

public class Accueil {

    @FXML
    private Button btnNouvelle;
    @FXML
    private Button btnCharger;

    private Manager m = new Manager();
    private EcranJeu ecranJeu;
    private NouvellePartie nouvellePartie;

    @FXML
    public void clicNouvellePartie(ActionEvent actionEvent) {
        try {
            m.initialiser();
            nouvellePartie = new NouvellePartie(m);
            FXMLLoader leLoader = new FXMLLoader(getClass().getResource("/fxml/NouvellePartie.fxml"));
            leLoader.setController(nouvellePartie);
            Region region = leLoader.load();
            Scene scene = new Scene(region);

            Stage stage = (Stage) btnNouvelle.getScene().getWindow(); //on récupère la stage courante
            stage.setScene(scene); //on lui affecte une nouvelle scène
            stage.show();
        }catch (IOException io){
            io.printStackTrace();
        }
    }

    @FXML
    public void clicChargerPartie(ActionEvent actionEvent) {
        try {
            m.chargerPartie();
            m.initialiser();
            ecranJeu = new EcranJeu(m);
            FXMLLoader leLoader = new FXMLLoader(getClass().getResource("/fxml/EcranJeu.fxml"));
            leLoader.setController(ecranJeu);
            Region region = leLoader.load();
            Scene scene = new Scene(region);

            Stage stage = (Stage) btnCharger.getScene().getWindow(); //on récupère la stage courante
            stage.setScene(scene); //on lui affecte une nouvelle scène
            stage.show();
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
