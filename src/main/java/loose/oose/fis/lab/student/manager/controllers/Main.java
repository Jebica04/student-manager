package loose.oose.fis.lab.student.manager.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main {
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
        primaryStage.setTitle("FIS - Student Manager");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

}
