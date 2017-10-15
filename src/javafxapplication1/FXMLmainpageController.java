/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author RBS
 */
public class FXMLmainpageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label welcomelabel;
        @FXML private void handledeconnectionAction(ActionEvent event) throws IOException {
         
Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    Scene newScene= new Scene(root);
    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
       window.setScene(newScene);
       window.show();
        }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     // welcomelabel.setText("welcome racem");
        // TODO
    }    
    
    
    
}
