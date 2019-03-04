/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boton;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author jcarrero
 */
public class main extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Boton b = new Boton();
        b.show(primaryStage);
        
    }

}

// traer dos ventanas, una que tenga: nombre:_________, Dirección:______, Teléfono:________ y un boton Adicionar
//La otra ventana que tenga un textArea para mostrar la info anterior y un botón que diga regresar
