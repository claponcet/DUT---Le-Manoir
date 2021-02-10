package menu;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;



public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception {

        Region region = FXMLLoader.load(getClass().getResource("/fxml/Accueil.fxml"));
        Scene scene = new Scene (region);
        stage.setResizable(false);
        stage.setTitle("Le Manoir");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        Application.launch(args);
        //Test test=new Test();
        //test.leTest();
    }

}
