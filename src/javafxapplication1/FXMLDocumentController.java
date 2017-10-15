/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import com.sun.javafx.robot.impl.FXRobotHelper;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author RBS
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
 @FXML private TextField username,password;    
    @FXML
    
    
   /* private void loginButtonClicked() {
        System.out.println("hello");
        label.setText("hello");
        username.setText("hello");
        
        
       
    }*/
    private void handleloginAction(ActionEvent event) throws IOException {

    System.out.println("");
   
    if((password.getText().equals("123"))&&(username.getText().equals("racem"))){
    label.setText("Welcome "+username.getText());
    Parent root = FXMLLoader.load(getClass().getResource("FXMLmainpage.fxml"));
    Scene newScene= new Scene(root);
    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
       window.setScene(newScene);
       window.show();
       
    }
    else{
        label.setText("login ou mot de passe incorrecte");
    }


}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
        
    }    
    
}
