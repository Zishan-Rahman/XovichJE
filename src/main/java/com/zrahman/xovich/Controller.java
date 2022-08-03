package com.zrahman.xovich;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller {
    @FXML
    private Button nameGenerationButton;
    @FXML
    private CheckBox ilyaBox;
    @FXML
    private CheckBox doubleNameBox;
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;

    public void generateName() {
        String name = makeovich();
        Alert newNameMessageBox = new Alert(Alert.AlertType.INFORMATION);
        newNameMessageBox.setTitle("Your New Name!");
        newNameMessageBox.setHeaderText("Your new name is " + name + "!");
        newNameMessageBox.setContentText("Thank you for using Xovich Java Edition!");
        newNameMessageBox.showAndWait();
    }

    private String makeovich() {
        String firstName = firstNameField.getText();
        String lastName = "";
        String newName = "";
        if (lastNameField.isDisabled()) {
            lastName = firstName;
        } else {
            lastName = lastNameField.getText();
        }
        if (ilyaBox.isSelected() && firstName.length() != 0) {
            newName = firstName + " Ilya " + lastName;
        } else if (firstName.length() != 0 && lastName.length() != 0) {
            newName = firstName + " " + lastName;
        } else if (firstName.length() == 0 && lastName.length() == 0 && ilyaBox.isSelected()) {
            newName = "Ilya I Don't Got No Name";
        } else if (firstName.length() == 0 && ilyaBox.isSelected()) {
            newName = "Ilya " + lastName;
        } else if (firstName.length() == 0) {
            newName = lastName;
        } else if (lastName.length() == 0) {
            newName = firstName;
        } else {
            newName = "I Don't Got No Name";
        }
        newName += "ovich";
        return newName;
    }

    public void greyOutLastName() {
        lastNameField.setDisable(!lastNameField.isDisabled());
    }
}
