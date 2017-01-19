package iesshcam.iess.hcam.cs.principal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginControlador implements Initializable {

    @FXML
    private TextField txtUsuario;
    @FXML
    private TextField txtContrasenia;
    @FXML
    private AnchorPane anchorPaneLogin;

    @FXML
    private MainApp mainApp;

//    @FXML
//    private MenuPrincipalControlador menuPrincipalControlador;
    @FXML
    private void bntAceptarOnAction(ActionEvent event) throws IOException {
        System.out.println("iesshcam.iess.hcam.cs.principal.FXMLController.bntAceptarOnAction()");
        System.out.println("datos" + txtUsuario.getText());
        if (txtUsuario.getText().equals("ezamora") && txtContrasenia.getText().equals("123")) {
            System.out.println("Usurio Correcto");

            mainApp.cargarRootLayout();

        } else {
            System.out.println("Usairo incorrecto");
        }

    }

    @FXML
    private void btnCancelarOnAction(ActionEvent event) {
        System.err.println("Hidee ....");
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("iesshcam.iess.hcam.cs.principal.LoginControlador.initialize()");
        mainApp = new MainApp();
    }

    /**
     *
     * <b>
     * Set a MainApp.
     * </b>
     * <p>
     * [$Author: ezamora $, $Date: 18/11/2016]</p>
     *
     * @param mainApp mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

    }

}
