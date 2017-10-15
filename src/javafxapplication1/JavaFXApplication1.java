/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.sql.Connection;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static javafxapplication1.JavaFXApplication1.mycon;

/**
 *
 * @author RBS
 */
public class JavaFXApplication1 extends Application {
    
    static Connection mycon;
    @Override
    public void start(Stage stage) throws Exception {
        mycon = MyBdConnection.getInstanceBD().getConnection();
       
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
       
        Scene scene = new Scene(root);
        
        
        stage.setScene(scene);
        
        stage.show();
        
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        launch(args);
        
    }
    
}
