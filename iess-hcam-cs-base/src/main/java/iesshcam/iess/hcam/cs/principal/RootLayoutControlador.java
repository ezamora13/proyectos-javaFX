/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesshcam.iess.hcam.cs.principal;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author ezamora
 */
public class RootLayoutControlador implements Initializable {

    @FXML
    private BorderPane borderPaneRootLayout;
    @FXML
    private TreeView<String> treeViewMenu;
    
    
       

    @FXML
    private MainApp mainApp;

    /**
     *
     *
     * <b>
     * Constructor.
     * </b>
     * <p>
     * [$Author: ezamora $, $Date: 15/12/2016]</p>
     */
    public RootLayoutControlador() {

    }

    private void tmpDatosTree() {
       // treeViewMenu.setVisible(true);
        TreeItem<String> treeItemRoot = new TreeItem<>("Root");

        TreeItem<String> nodeItemA = new TreeItem<>("Item A");
        TreeItem<String> nodeItemB = new TreeItem<>("Item B");
        TreeItem<String> nodeItemC = new TreeItem<>("Item C");
        treeItemRoot.getChildren().addAll(nodeItemA, nodeItemB, nodeItemC);

        TreeItem<String> nodeItemA1 = new TreeItem<>("Item A1");
        TreeItem<String> nodeItemA2 = new TreeItem<>("Item A2");
        TreeItem<String> nodeItemA3 = new TreeItem<>("Item A3");
        nodeItemA.getChildren().addAll(nodeItemA1, nodeItemA2, nodeItemA3);

        treeViewMenu.setRoot(treeItemRoot);

    }

    /**
     * Is called by the main application to give a reference back to itself.
     *
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

    }

    
    @FXML
    private void treeVwMenuOnEditStar() {
        System.out.println("iesshcam.iess.hcam.cs.principal.RootLayoutControlador.treeVwMenuOnEditStar()");

    }

    @FXML
    private void treeViewMenuOnMouseClicked() {
        System.out.println("iesshcam.iess.hcam.cs.principal.RootLayoutControlador.treeVwMenuOnMouseClicked()");
        String v = treeViewMenu.getSelectionModel().getSelectedItem().getValue();

        System.out.println("" + v
        );
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //To change body of generated methods, choose Tools | Templates.
        tmpDatosTree();
    }

}
