package vues;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Bravo {

    @FXML
    private Button btnAccueil;

    public void clicAccueil(ActionEvent actionEvent) {
        try {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            Parent container = FXMLLoader.load(getClass().getResource("/fxml/Accueil.fxml"));
            Stage stage=new Stage();
            Scene scene=new Scene(container);
            stage.setScene(scene);
            stage.setTitle("Le Manoir");
            stage.show();
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}

