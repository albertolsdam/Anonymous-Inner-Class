/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class AnonymousInnerClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Nuevo");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Nuevo Proceso");
            }
        });
        
        Button btn2 = new Button();
        btn2.setText("Abrir");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abrir Proceso");
            }
        });
        
        Button btn3 = new Button();
        btn3.setText("Guardar");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guardar Proceso");
            }
        });
        
        Button btn4 = new Button();
        btn4.setText("Imprimir");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Imprimir Proceso");
            }
        });
        
        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setHgap(10);
        gridpane.add(btn, 1, 0);
        gridpane.add(btn2, 2, 0);
        gridpane.add(btn3, 3, 0);
        gridpane.add(btn4, 4, 0);
        
        
        Scene scene = new Scene(gridpane, 300, 100);
        
        primaryStage.setTitle("Anonymous Handler Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
