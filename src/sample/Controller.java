package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Random;

public class Controller {

    @FXML
    private Label headerName;

    @FXML
    private TextField textField;
    private Random random;

    @FXML
    void doAction() {
        random = new Random();

        String message = textField.getText();
        if (!message.isBlank()) {
            int number = Integer.parseInt(message);
        }
    }
}