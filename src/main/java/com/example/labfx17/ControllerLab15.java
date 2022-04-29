package com.example.labfx17;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerLab15 {
    @FXML
    private Button PlusOne;

    @FXML
    private Button MinusOne;

    @FXML
    TextField Number;

    @FXML
    public void ClickPlusOne(ActionEvent event) {
        int value = Integer.parseInt(Number.getText());
        if (value < 10) {
            value++;
            Number.setText(Integer.toString(value));
        }
    }
    @FXML
    public void ClickMinusOne (ActionEvent event){
        int value = Integer.parseInt(Number.getText());
        if (value > -10) {
            value--;
            Number.setText(Integer.toString(value));
        }
    }

}