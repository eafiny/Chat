package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;
    @FXML
    public void clickBtn1(ActionEvent actionEvent) {
        textArea.append(textField.getText() + "\n");
        textField.setText("");
        textField.requestFocus();
        //System.out.println("working");
    }
}
