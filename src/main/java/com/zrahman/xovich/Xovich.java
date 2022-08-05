package com.zrahman.xovich;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Xovich extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/zrahman/xovich/view/XovichWindow.fxml"));
        Scene scene = new Scene(root, 500, 325);
        stage.setScene(scene);
        stage.setTitle("Xovich Java Edition");
        stage.setOnCloseRequest(event -> {
            Alert closeConfirmationDialog = new Alert(Alert.AlertType.WARNING, "Thanks for using Xovich Java Edition!", ButtonType.YES, ButtonType.NO);
            closeConfirmationDialog.setTitle("End");
            closeConfirmationDialog.setHeaderText("Are you sure you want to exit?");
            closeConfirmationDialog.showAndWait().filter(type -> type != ButtonType.YES).ifPresent(type -> event.consume());
        });
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
