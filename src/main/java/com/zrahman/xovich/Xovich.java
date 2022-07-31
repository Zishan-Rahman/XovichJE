package com.zrahman.xovich;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Xovich extends Application {
    
    @Override
    public void start(Stage stage) {
        Label label = new Label("Welcome to Xovich Java Edition!");
        Scene scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.setTitle("Xovich Java Edition");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
