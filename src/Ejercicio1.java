/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flexxo333
 */
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
import java.time.LocalDate;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio1 extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        //Label label = new Label("Search:");
        
        
//        FileInputStream input = new FileInputStream("resources/img/if_Zoom_131895.png");
//        Image img = new Image(input);
//        Label label2 = new Label("Nombre:", new ImageView(img));
//        
//        FileInputStream inputButtonAccept = new FileInputStream("resources/img/if_Pin_131896.png");
//        Image imgButton = new Image(inputButtonAccept);
        //Button button3 = new Button("Accept", new ImageView(imgButton));
        
        //vbox (5 filas) Contenedor global (?)
        VBox vbox = new VBox();
        
        
        
        //Menu Primera Fila
        MenuBar menuBar = new MenuBar();
        
        Menu menu = new Menu("File");
        Menu menu2 = new Menu("Edit");
        Menu menu3 = new Menu("Admin");
        Menu menu4 = new Menu("Summit");
        Menu menu5 = new Menu("Misc");
        Menu menu6 = new Menu("Window");
        Menu menu7 = new Menu("Help");
        
        MenuItem menuItem1 = new MenuItem("Item1");
        MenuItem menuItem2 = new MenuItem("Item2");
        
        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);
        
        menuBar.getMenus().add(menu);
        menuBar.getMenus().add(menu2);
        menuBar.getMenus().add(menu3);
        menuBar.getMenus().add(menu4);
        menuBar.getMenus().add(menu5);
        menuBar.getMenus().add(menu6);
        menuBar.getMenus().add(menu7);
        
        
        
        
        
        
        //Inicio Botones segunda fila
        HBox hbox = new HBox();
        
        //Sus botones
         //Exit
        FileInputStream inputExitButton = new FileInputStream("resources/ejercicio1/if_exit_3226_32x32.png");
        Image imgExitButton = new Image(inputExitButton);
        Button buttonExitButton = new Button("Exit:", new ImageView(imgExitButton));
         //Logout
        FileInputStream inputLogoutButton = new FileInputStream("resources/ejercicio1/if_logout_17364_32x32.png");
        Image imgLogoutButton = new Image(inputLogoutButton);
        Button buttonLogoutButton = new Button("Log Out:", new ImageView(imgLogoutButton));
         //Save
        FileInputStream inputSaveButton = new FileInputStream("resources/ejercicio1/if_save_87464 _32x32.png");
        Image imgSaveButton = new Image(inputSaveButton);
        Button buttonSaveButton = new Button("Save:", new ImageView(imgSaveButton));
         //Reload
        FileInputStream inputReloadButton = new FileInputStream("resources/ejercicio1/if_view-refresh_118801_32x32.png");
        Image imgReloadButton = new Image(inputReloadButton);
        Button buttonReloadButton = new Button("Reload:", new ImageView(imgReloadButton));
         //Create Help
        FileInputStream inputCreateHelpButton = new FileInputStream("resources/ejercicio1/if_pencil_2003_32x32.png");
        Image imgCreateHelpButton = new Image(inputCreateHelpButton);
        Button buttonCreateHelpButton = new Button("Create Help:", new ImageView(imgCreateHelpButton));
         //Orders
        FileInputStream inputOrdersButton = new FileInputStream("resources/ejercicio1/if_Order_tracking_73223_32x32.png");
        Image imgOrdersButton = new Image(inputOrdersButton);
        Button buttonOrdersButton = new Button("Orders:", new ImageView(imgOrdersButton));
         //Web Frame
        FileInputStream inputWebFrameButton = new FileInputStream("resources/ejercicio1/if_Junior_Icon_04_2_67828_32x32.png");
        Image imgWebFrameButton = new Image(inputWebFrameButton);
        Button buttonWebFrameButton = new Button("Web Frame:", new ImageView(imgWebFrameButton));
         //Flip Frame
        FileInputStream inputFlipFrameButton = new FileInputStream("resources/ejercicio1/if_save_87464 _32x32.png");
        Image imgFlipFrameButton = new Image(inputFlipFrameButton);
        Button buttonFlipFrameButton = new Button("Flip Frame:", new ImageView(imgFlipFrameButton));      
        hbox.getChildren().add(buttonExitButton);
        hbox.getChildren().add(buttonLogoutButton);
        hbox.getChildren().add(buttonSaveButton);
        hbox.getChildren().add(buttonReloadButton);
        hbox.getChildren().add(buttonCreateHelpButton);
        hbox.getChildren().add(buttonOrdersButton);
        hbox.getChildren().add(buttonWebFrameButton);
        hbox.getChildren().add(buttonFlipFrameButton);
        hbox.setSpacing(6);
        // Fin Botones segunda fila
        
        //Inicio Hbox Tercera fila
        Separator separatorHbox2_1 =  new Separator(Orientation.VERTICAL);
        Button userManagementButton = new Button("User Management");
        Button ordersButton = new Button("Orders");
        Button customersButton = new Button("Customers");
        HBox hbox2 = new HBox(separatorHbox2_1, userManagementButton, ordersButton, customersButton);
        hbox2.setSpacing(6);
        //Fin Hbox tercera fila
        
        //Inicio Stack
        

        StackPane stackPane = new StackPane();
        stackPane.setAlignment(Pos.CENTER);
        stackPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        
        //Fin Stack
        
        //Inicio HBox quinta fila
        
        
        Separator separatorHbox3_1 =  new Separator(Orientation.HORIZONTAL);
        Label label = new Label("Order Id");
        TextField textField1 = new TextField("Digite");
        HBox hbox3 = new HBox(separatorHbox3_1,label, textField1);
        hbox3.setSpacing(6);
        //Fin HBox quinta fila
        
        
        
        
        //Inicio Grid1
        GridPane gpane1 = new GridPane();
        Label labelPane1 = new Label("Date Ordered");
        Label labelPane2 = new Label("Customer Name ");
        Label labelPane3 = new Label("Customer Id");
        Label labelPane4 = new Label("Sales Rep Id");
        Label labelPane5 = new Label("Sales Rep Name");
        Label labelPane6 = new Label("Date Shipped");
        Label labelPane7 = new Label("Cash or Check");
        Label labelPane8 = new Label("On account");
        Label labelPane9 = new Label("Order filled");
        DatePicker datePicker1 = new DatePicker(LocalDate.now());
        ComboBox comboBoxId = new ComboBox();
        ComboBox comboBoxName = new ComboBox();
        ComboBox comboBoxSalesRepId = new ComboBox();
        ComboBox comboBoxSalesRepName = new ComboBox();
        DatePicker datePicker2 = new DatePicker();
        RadioButton radButton1 = new RadioButton();
        RadioButton radButton2 = new RadioButton();
        CheckBox checkBox1 = new CheckBox();
        
        
        gpane1.add(labelPane1, 0, 0);        
        gpane1.add(datePicker1, 0 , 1);
        gpane1.add(labelPane3, 1, 0);
        gpane1.add(comboBoxId, 1 , 1, 2,1);
        gpane1.add(labelPane2, 2, 0);
        gpane1.add(comboBoxName, 2 , 1);
        gpane1.add(labelPane4, 1, 2);
        gpane1.add(comboBoxSalesRepId, 1 , 3);
        gpane1.add(labelPane5, 2, 2);
        gpane1.add(comboBoxSalesRepName, 2 , 3);        
        gpane1.add(labelPane6, 0, 4);
        gpane1.add(datePicker2, 0, 5);
        gpane1.add(radButton1, 1, 5);
        gpane1.add(labelPane7, 2, 5);
        gpane1.add(radButton2, 3, 5);
        gpane1.add(labelPane8, 4, 5);
        gpane1.add(checkBox1, 5, 5);
        gpane1.add(labelPane9, 6, 5);
        
        gpane1.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        gpane1.setHgap(25);
        gpane1.setVgap(6);
        //Fin Grid1
        
        //Inicio Grid2
        GridPane gpane2 = new GridPane();
        
        ListView<String> list = new ListView<String>();
        ObservableList<String> items =FXCollections.observableArrayList (
        "Single", "Double", "Suite", "Family App","Single", "Double", "Suite", "Family App");
        list.setItems(items);
        ScrollPane scrollPane1 = new ScrollPane(list);
        scrollPane1.setPrefViewportHeight(200);
        scrollPane1.setPrefHeight(160);
        //scrollPane1.setMaxHeight(160);
        scrollPane1.setPrefWidth(125);
        scrollPane1.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        
        //Nordica Cruise 60 beginner ski boots.jpg
        ComboBox comboBoxProducto = new ComboBox();
        
//        FileInputStream inputCreateHelpButton = new FileInputStream("resources/ejercicio1/if_pencil_2003_32x32.png");
//        Image imgCreateHelpButton = new Image(inputCreateHelpButton);
//        Button buttonCreateHelpButton = new Button("Create Help:", new ImageView(imgCreateHelpButton));
        FileInputStream inputImagenProducto = new FileInputStream("resources/ejercicio1/Nordica Cruise 60 beginner ski boots.jpg");
        Image imgPreviewProducto = new Image(inputImagenProducto);
        Label labelProducto = new Label("", new ImageView(imgPreviewProducto));
        VBox vbox2 = new VBox(labelProducto, comboBoxProducto);
        vbox2.setSpacing(6);
        gpane2.add(scrollPane1, 0, 0);
        gpane2.add(gpane1, 1, 0);
        gpane2.add(vbox2, 2, 0);
        
        //Fin Grid2
        
        
        //Inicio Hbox
        
        TableView table1 = new TableView();
        TableColumn nameCol = new TableColumn("Name");
        TableColumn shortDescCol = new TableColumn("Short Desc");
        TableColumn priceCol = new TableColumn("Price");
        TableColumn quantityCol = new TableColumn("Quantity");
        TableColumn quantityShippedCol = new TableColumn("Quantity Shipped");
        TableColumn itemTotalCol = new TableColumn("Item Total");
        table1.getColumns().addAll(nameCol, shortDescCol, priceCol, quantityCol, quantityShippedCol, itemTotalCol);
        
        nameCol.prefWidthProperty().bind(table1.widthProperty().multiply(0.37));
        shortDescCol.prefWidthProperty().bind(table1.widthProperty().multiply(0.15));
        priceCol.prefWidthProperty().bind(table1.widthProperty().multiply(0.11));
        quantityCol.prefWidthProperty().bind(table1.widthProperty().multiply(0.11));
        quantityShippedCol.prefWidthProperty().bind(table1.widthProperty().multiply(0.11));
        itemTotalCol.prefWidthProperty().bind(table1.widthProperty().multiply(0.15));
        
        
        table1.setPrefSize(1000, 100);
        
        VBox vbox3 = new VBox();
        FileInputStream inputPlusButton = new FileInputStream("resources/ejercicio1/if_plus_add_green_61658_32x32.png");
        Image imgPlusButton = new Image(inputPlusButton);
        Button buttonPlusButton = new Button("", new ImageView(imgPlusButton));

        FileInputStream inputRedCrossButton = new FileInputStream("resources/ejercicio1/if_cross-circle_26048_32x32.png");
        Image imgRedCrossButton = new Image(inputRedCrossButton);
        Button buttonRedCrossButton = new Button("",new ImageView(imgRedCrossButton));

        FileInputStream inputEditButton = new FileInputStream("resources/ejercicio1/if_pencil_2003_32x32.png");
        Image imgEditButton = new Image(inputEditButton);
        Button buttonEditButton = new Button("", new ImageView(imgEditButton));

        FileInputStream inputSearchButton = new FileInputStream("resources/ejercicio1/if_gnome-searchtool_39022_32x32.png");
        Image imgSearchButton = new Image(inputSearchButton);
        Button buttonSearchButton = new Button("", new ImageView(imgSearchButton));

        FileInputStream inputDownloadButton = new FileInputStream("resources/ejercicio1/if_arrow_down_green_48_10254_32x32.png");
        Image imgDownloadButton = new Image(inputDownloadButton);
        Button buttonDownloadButton = new Button("", new ImageView(imgDownloadButton));
        
        

        
        vbox3.getChildren().addAll(buttonPlusButton, buttonRedCrossButton, buttonEditButton, buttonSearchButton, buttonDownloadButton);
        vbox3.setSpacing(5);
        
        
        HBox hbox4 = new HBox(vbox3,table1);
        hbox4.setSpacing(15);
        //Fin Hbox
        
        
        //Anchor
        FileInputStream inputStockButton = new FileInputStream("resources/ejercicio1/if_exclamation-circle-frame_basic_blue_69492_32x32.png");
        Image imgStockButton = new Image(inputStockButton);
        Button buttonStockButton = new Button("Stock", new ImageView(imgStockButton)); 
        
        Label label1= new Label("OrderTotal");
        AnchorPane stock = new AnchorPane();
        stock.getChildren().add(buttonStockButton);
        stock.getChildren().add(label1);
        stock.setRightAnchor(label1, 18.0);
        //Fin anchor
        
        
        
        //Añadir componentes al VBox
        vbox.getChildren().add(menuBar);
        vbox.getChildren().add(hbox);
        vbox.getChildren().add(hbox2);
        vbox.getChildren().add(hbox3);
        vbox.getChildren().add(gpane2);
        vbox.getChildren().add(hbox4);
        vbox.getChildren().add(stock);
        vbox.setSpacing(14);
        
        
        //**************************
        
        Scene scene = new Scene(vbox,1200,850);
        primaryStage.setTitle("Ejercicio1");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        

        
        
        
    }

    public static void main(String[] args) {     
        Application.launch(args);
    }
}


