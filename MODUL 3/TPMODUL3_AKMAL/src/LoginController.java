import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private TextField password;

    @FXML
    private TextField username;

    @FXML
    void LoginF(ActionEvent event) throws IOException {
        String usn = username.getText();
        String pw = password.getText();

        Parent inventoryParent = FXMLLoader.load(getClass().getResource("InventoryPage.fxml"));
        Scene invScene = new Scene(inventoryParent);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        if (usn.equals("akmal") && pw.equals("123")) {
            stage.setScene(invScene);
            stage.show();
        } else {
            Alert alert = new Alert(javafx.scene.control.Alert.AlertType.ERROR);
            alert.setTitle("Username atau Password salah");
            alert.setContentText("Silahkan cek kembali Username atau Password anda");
            alert.show();
        }
    }
}
