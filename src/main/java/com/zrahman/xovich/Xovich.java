package com.zrahman.xovich;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Xovich extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/zrahman/xovich/view/XovichWindow.fxml"));
        Scene scene = new Scene(root, 500, 325);
        stage.setScene(scene);
        stage.setTitle("Xovich Java Edition");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
