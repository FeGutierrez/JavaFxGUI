/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        //Button btOK = new Button("Soy un botón");
        
        
        
        
        
        Button button1 = new Button("Number1");
        Button button2 = new Button("Number2");
        
        Label label = new Label("Search:");
        
        
        FileInputStream input = new FileInputStream("resources/img/if_Zoom_131895.png");
        Image img = new Image(input);
        Label label2 = new Label("Nombre:", new ImageView(img));
        
        FileInputStream inputButtonAccept = new FileInputStream("resources/img/if_Pin_131896.png");
        Image imgButton = new Image(inputButtonAccept);
        Button button3 = new Button("Accept", new ImageView(imgButton));
        
        
        

        HBox hbox = new HBox(button1, button2);
        TextField textField1 = new TextField();
        hbox.getChildren().add(label2);
        hbox.getChildren().add(button3);
        hbox.getChildren().add(label);
        hbox.getChildren().add(textField1);
        
        VBox vbox = new VBox();
        TextField textField2 = new TextField();
        vbox.getChildren().add(button1);
        vbox.getChildren().add(button3);
        
        //*************
        
        GridPane pane = new GridPane();
        vbox.getChildren().add(pane);
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        pane.add(new Label("First Name:"), 0, 0);
        pane.add(new TextField(), 1, 0);
        FileInputStream inputButtonYes = new FileInputStream("resources/img/if_Apply_131700.png");
        Image imgButtonYes = new Image(inputButtonYes);
        pane.add(new Button("",new ImageView(imgButtonYes)), 2, 0 );
        pane.add(new Label("MI:"), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Last Name:"), 0, 2);
        pane.add(new TextField(), 1, 2);
        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 1, 5);
        
        //*****************
        
        pane.add(new TextField(), 4, 2, 6, 2);
        
        //******************
        BorderPane root = new BorderPane();
        root.setTop(new Button("Top"));
        root.setRight(new Button("Right"));
        root.setBottom(new Button("Bottom"));
        
        root.setLeft(new Button("Left"));
        root.setCenter(new Button("Center"));
        
        
        
        
        //******************
        GridPane.setHalignment(btAdd,HPos.RIGHT);
        
        
        
        
        
        
        //**************************
        Scene scene = new Scene(root,500,625);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        
        
    }

    public static void main(String[] args) {     
        Application.launch(args);
    }
}
