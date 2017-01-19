/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesshcam.iess.hcam.cs.principal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import lombok.Getter;

import lombok.Setter;

public class MainApp extends Application {

    @Getter
    @Setter
    private Stage stage;
    @Getter
    @Setter
    private AnchorPane rootAnchorPane;
    @Getter
    @Setter
    private BorderPane rootBorderPane;

    @Override
    public void start(Stage primaryStage) {
        this.stage = primaryStage;
        this.stage.setTitle("IESS - Hospital Carlos Andrade Marín");
        inicio();
    }

    /**
     *
     * <b>
     * Inicio Carga el Escenario inicial con template Scena. 1. Llama a cargar
     * Login BorderPane que se añade a la Scena
     * </b>
     * <p>
     * [$Author: ezamoram $, $Date: 18/11/2016]</p>
     */
    private void inicio() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/template/Scene.fxml"));
            rootAnchorPane = (AnchorPane) loader.load();
            Scene scene = new Scene(rootAnchorPane);
            scene.getStylesheets().add("styles/Styles.css");
            stage.setScene(scene);
            cargarSceneLogin();
            stage.setResizable(false);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * <b>
     * Carga el Login en Scena principal.
     * </b>
     * <p>
     * [$Author: ezamora $, $Date: 18/11/2016]</p>
     */
    private void cargarSceneLogin() throws IOException {
        // Load person overview.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/template/Login.fxml"));
        BorderPane borderPane = (BorderPane) loader.load();
        // Set person overview into the center of root layout.
        rootAnchorPane.getChildren().add(borderPane);
    }

    public void cargarRootLayout() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/template/Scene.fxml"));
        rootAnchorPane = (AnchorPane) loader.load();
        Scene scene = new Scene(rootAnchorPane);
        scene.getStylesheets().add("styles/Styles.css");
        cargarSceneRootLayout();
        stage = new Stage();
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();

    }

    private void cargarSceneRootLayout() throws IOException {
        // Load person overview.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/template/RootLayout.fxml"));
        BorderPane borderPane = (BorderPane) loader.load();
        FXMLLoader loaderDefault = new FXMLLoader(getClass().getResource("/fxml/Default.fxml"));
        AnchorPane anchorPaneDefault = (AnchorPane) loaderDefault.load();

        // Set person overview into the center of root layout.
        rootAnchorPane.getChildren().add(borderPane);
        borderPane.setCenter(anchorPaneDefault);
    }

    /**
     *
     * <b>
     * Constructor.
     * </b>
     * <p>
     * [$Author: ezamora $, $Date: 15/12/2016]</p>
     */
    public MainApp() {
    }

    /**
     *
     * <b>
     * Metodo Main.
     * </b>
     * <p>
     * [$Author: ezamora $, $Date: 18/11/2016]</p>
     */
    public static void main(String[] args) {
        launch(args);
    }

}
