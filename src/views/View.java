package views;

import models.EspeceDetail;
import models.Observation;
import services.ServiceFormatageDate;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import ctrl.IControllerForView;

public class View implements IViewForController, Initializable {

    @FXML
    private Button btnChercherObservations;

    @FXML
    private Button btnEnregistrerObservation;

    @FXML
    private TextField txtflChercherObservations;

    @FXML
    private TextField txtflLieu;

    @FXML
    private TextField txtfAuteur;

    @FXML
    private Label lblDateObservation;

    @FXML
    private Label lblEspeceObservation;

    @FXML
    private Label lblLieuObservation;

    @FXML
    private Label lblAuteurObservation;

    @FXML
    private Label lblNbrObservation;

    @FXML
    private ComboBox<String> cbbxNomCommun;

    @FXML
    private ComboBox<String> cbbxFiltreParNomCommun;

    @FXML
    private CheckBox chkbxFiltreParDate;

    @FXML
    private CheckBox chkbxFiltreParNomCommun;

    @FXML
    private DatePicker dtpckDate;

    @FXML
    private DatePicker dtpckFiltreParDate;

    @FXML
    private GridPane grdpnDetailEspece;

    @FXML
    private ImageView imgvEspece;

    @FXML
    private ImageView imgvRepartition;

    @FXML
    private Label lblEnvergure;

    @FXML
    private Label lblHabitat;

    @FXML
    private Label lblNom;

    @FXML
    private Label lblNomScientifique;

    @FXML
    private Label lblNombreDePontes;

    @FXML
    private Label lblNourriture;

    @FXML
    private Label lblPoids;

    @FXML
    private Label lblStatut;

    @FXML
    private Label lblTaille;

    @FXML
    private TextArea txtaDescription;

    @FXML
    private ListView<EspeceDetail> lstvEspeces;

    @FXML
    private ListView<Observation> lstvObservations;

    private final IControllerForView controller;

    private ServiceFormatageDate serviceFormatageDate;

    public View(IControllerForView controller) {
        this.controller = controller;
        serviceFormatageDate = new ServiceFormatageDate();
    }

    @Override
    public void start() {
        Platform.startup(() -> {
            try {
                Stage mainStage = new Stage();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view.fxml"));
                fxmlLoader.setControllerFactory(type -> {
                    return this;
                });
                Parent root = (Parent) fxmlLoader.load();
                Scene principalScene = new Scene(root);
                principalScene.getStylesheets().add("views/css/style.css");
                mainStage.setScene(principalScene);
                mainStage.setTitle("Ornithologie - v1.0 par Daniel Bütschi");
                mainStage.setMinWidth(1420);
                mainStage.setMaxWidth(1420);
                mainStage.setMinHeight(1030);
                mainStage.setMaxHeight(1030);
                mainStage.show();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
                Platform.exit();
            }
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        lstvEspeces.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> afficheEspece(newValue));

        lstvObservations.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> afficheObseration(newValue));

        controller.actionIndexerObservations();

        controller.actionIndexerEspeces();
        controller.actionTriParNomScientifique();
        lstvEspeces.getSelectionModel().selectFirst();

        // initialisation des combobox
        cbbxNomCommun.getItems().addAll(controller.getlstNomCommun());
        cbbxFiltreParNomCommun.getItems().addAll(controller.getlstNomCommun());
        // initialiation des datePicker
        dtpckDate.setValue(LocalDate.now());
        dtpckFiltreParDate.setValue(LocalDate.now());
    }

    @Override
    public void afficheListeEspeces(List<EspeceDetail> listEspeceDetails) {

        lstvEspeces.getItems().clear();

        for (EspeceDetail especeDetail : listEspeceDetails) {
            lstvEspeces.getItems().add(especeDetail);
        }
    }

    public void afficheEspece(EspeceDetail especeDetail) {

        if (especeDetail != null) {
            lblNom.setText(especeDetail.getNomCommun());
            lblNomScientifique.setText(especeDetail.getNomScientifique());
            lblStatut.setText(especeDetail.getStatutDeMenace().getListeRougeCH());
            imgvEspece.setImage(new Image(especeDetail.getImage().getEspeceImagePath()));
            imgvRepartition.setImage(new Image(especeDetail.getImage().getRepartitionImagePath()));
            txtaDescription.setText(especeDetail.getDescription());
            lblTaille.setText(especeDetail.getCaracteristiques().getTailleCm());
            lblEnvergure.setText(especeDetail.getCaracteristiques().getEnvergureCm());
            lblPoids.setText(especeDetail.getCaracteristiques().getPoidsG());
            lblNourriture.setText(especeDetail.getCaracteristiques().getHabitat());
            lblNombreDePontes.setText(String.valueOf(especeDetail.getCaracteristiques().getNombreDePontes()));

            // Filtre des observations par espèces
            cbbxFiltreParNomCommun.getSelectionModel().select(especeDetail.getNomCommun());
            chkbxFiltreParNomCommun.setSelected(true);
            evaluerFiltre();

            // mise à jour de l'espèce pour la nouvelle observation
            cbbxNomCommun.getSelectionModel().select(especeDetail.getNomCommun());
        }
    }

    @Override
    public void afficheListeObservations(List<Observation> listObservations) {

        lstvObservations.getItems().clear();
        lstvObservations.getItems().addAll(listObservations);
        lblNbrObservation.setText(String.valueOf(listObservations.size()));
        // Selection de la première observation de la liste et affichage de son détail
        lstvObservations.getSelectionModel().selectFirst();
    }

    public void afficheObseration(Observation observation) {

        if (observation != null) {
            lblEspeceObservation.setText(observation.getNomCommun());
            lblDateObservation.setText(serviceFormatageDate.formaterDate(observation.getDate()));
            lblLieuObservation.setText(observation.getLieu());
            lblAuteurObservation.setText(observation.getAuteur());
        }
    }

    @FXML
    void actionEnregistrerObservation(ActionEvent event) {

        LocalDate date = dtpckDate.getValue();
        if (txtflLieu.getText().isEmpty())
            messageErreur("Entrez un lieu");
        else if (txtfAuteur.getText().isEmpty())
            messageErreur("Entrez un auteur");
        else {
            Observation observation = new Observation(date,
                    txtfAuteur.getText(),
                    null,
                    cbbxNomCommun.getValue(),
                    txtflLieu.getText());

            controller.actionAjouterObservation(observation);
            evaluerFiltre();
        }
    }

    @FXML
    void actionTriParNomCommun(ActionEvent event) {
        controller.actionTriParNomCommun();
    }

    @FXML
    void actionTriParNomScientifique(ActionEvent event) {
        controller.actionTriParNomScientifique();
    }

    @FXML
    void actionTriParPonte(ActionEvent event) {
        controller.actionTriParPonte();
        evaluerFiltre();
    }

    @FXML
    void actionChangeDateFiltre(ActionEvent event) {
        chkbxFiltreParDate.setSelected(true);
        // si la checkbox est déjà selectionnée
        evaluerFiltre();
    }

    @FXML
    void actionChangeNomFiltre(ActionEvent event) {
        chkbxFiltreParNomCommun.setSelected(true);
        // si la checkbox est déjà selectionnée
        evaluerFiltre();
    }

    @FXML
    void actionFiltreObservationParNom(ActionEvent event) {
        evaluerFiltre();
    }

    @FXML
    void actionFiltreObservationsParDate(ActionEvent event) {
        evaluerFiltre();
    }

    @Override
    public void messageInfo(String message) {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
            alert.setHeaderText(null);
            alert.showAndWait();
        });
    }

    @Override
    public void messageErreur(String message) {
        // Platform.runLater(() -> {
        Alert alert = new Alert(Alert.AlertType.ERROR, message, ButtonType.OK);
        alert.setHeaderText(null);
        alert.showAndWait();
        // });
    }

    @FXML
    public void actionQuitter() {
        controller.actionQuitter();
        Platform.exit();
        System.exit(0);
    }

    private void evaluerFiltre() {
        if (chkbxFiltreParNomCommun.isSelected() && chkbxFiltreParDate.isSelected()) {
            controller.actionChargerObservationsParEspeceEtDate(cbbxFiltreParNomCommun.getValue(),
                    dtpckFiltreParDate.getValue());
        } else if (chkbxFiltreParNomCommun.isSelected()) {
            controller.actionChargerObservationsParEspece(cbbxFiltreParNomCommun.getValue());
        } else if (chkbxFiltreParDate.isSelected()) {
            controller.actionChargerObservationParDate(dtpckFiltreParDate.getValue());
        } else {
            controller.actionChargerObservations();
        }
    }

}
