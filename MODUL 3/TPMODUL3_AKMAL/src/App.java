import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage awal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Scene scene = new Scene(root);

        awal.setTitle("Zeppeli's listening bar");
        awal.setScene(scene);
        awal.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
