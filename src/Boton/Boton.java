/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author jcarrero
 */
public class Boton{
    private Button boton;
    private HBox hb;
    private Scene scene;
    
    
    public Boton(){
        Button b = new Button("Validar");
        HBox h = new HBox();
        h.getChildren().add(b);
        scene = new Scene(h,300, 300);
        b.setOnAction(new ActionButton());
    }
    
    
   public void show(Stage stage) {
      stage.setTitle("Bienvenido");
      stage.setScene(scene);
      stage.show();
      
   }
}
   


