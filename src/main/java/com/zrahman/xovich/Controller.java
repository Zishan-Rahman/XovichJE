package com.zrahman.xovich;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

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

    public void generateName() {}

    public void greyOutLastName() {
        lastNameField.setDisable(!lastNameField.isDisabled());
    }
}
