import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryController {

    @FXML
    private TextField JudulAlbm;

    @FXML
    private TextField JumlahRent;

    @FXML
    private TextField JumlahTot;

    @FXML
    private TableColumn<Album, String> KolomAlbumName;

    @FXML
    private TableColumn<Album, String> KolomArtist;

    @FXML
    private TableColumn<Album, Integer> KolomAvailable;

    @FXML
    private TableColumn<Album, Integer> KolomTotal;

    @FXML
    private TextField NamaArt;

    @FXML
    private TableView<Album> tabelAlbum;

    ObservableList<Album> dataTabel = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        KolomAlbumName.setCellValueFactory(new PropertyValueFactory<>("albumName"));
        KolomArtist.setCellValueFactory(new PropertyValueFactory<>("artist"));
        KolomTotal.setCellValueFactory(new PropertyValueFactory<>("total"));
        KolomAvailable.setCellValueFactory(new PropertyValueFactory<>("available"));

        tabelAlbum.setItems(dataTabel);
    }

    @FXML
    void HapusFunc(ActionEvent event) {
        Album pilih = tabelAlbum.getSelectionModel().getSelectedItem();
        if (pilih != null) {
            dataTabel.remove(pilih);
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Tidak Ada Album yang Terpilih");
            alert.setContentText("Pilih album yang ingin dihapus!");
            alert.show();
        }
    }

    @FXML
    void RentFunc(ActionEvent event) {
        Album sewa = tabelAlbum.getSelectionModel().getSelectedItem();
        if (sewa != null) {
            if (sewa.getAvailable() > 0) {
                sewa.setAvailable(sewa.getAvailable() - 1);
                sewa.setAvailable(sewa.getRented() + 1);

                tabelAlbum.refresh();
            } else {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Maaf");
                alert.setContentText("Album Tidak Tersedia!");
                alert.show();
            }
        } else {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Tidak Ada Album yang Terpilih");
            alert.setContentText("Pilih Album yang Ingin Disewa!");
            alert.show();
        }
    }

    @FXML
    void TambahFunc(ActionEvent event) {
        String judul = JudulAlbm.getText();
        String artis = NamaArt.getText();
        int total = Integer.parseInt(JumlahTot.getText());
        int rented = Integer.parseInt(JumlahRent.getText());
        int available = total - rented;

        Album albumBaru = new Album(judul, artis, total, available, rented);
        dataTabel.add(albumBaru);

        JudulAlbm.clear();
        NamaArt.clear();
        JumlahTot.clear();
        JumlahRent.clear();
    }

    @FXML
    void UpdateFunc(ActionEvent event) {

    }

}
