import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuMaker extends Application{

    BorderPane layout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Menu Maker");

        //File menu
        Menu fileMenu = new Menu("File");

        MenuItem newFile = new MenuItem("New...");
        newFile.setOnAction(e -> System.out.println("Create new file..."));
        fileMenu.getItems().add(new MenuItem("New..."));

        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new SeparatorMenuItem());
        fileMenu.getItems().add(new MenuItem("Exit"));

        //Edit menu
        Menu editMenu = new Menu("_Edit"); // _should indicate shortcut
        editMenu.getItems().add(new MenuItem("Cut"));
        editMenu.getItems().add(new MenuItem("Copy"));

        MenuItem paste = new MenuItem("Paste");
        paste.setOnAction(e -> System.out.println("Pasting something"));
        editMenu.getItems().add(paste);
        paste.setDisable(true);

        // help menu
        Menu helpMenu = new Menu("_Help"); // _should indicate shortcut
        CheckMenuItem showLines = new CheckMenuItem("Show line numbers");
        showLines.setOnAction(e -> {
            if (showLines.isSelected())
                System.out.println("Program will now display line numbers");
            else
                System.out.println("Hiding the line numbers");
        });
        CheckMenuItem autoSave = new CheckMenuItem("Enable Autosave");
        autoSave.setSelected(true);

        helpMenu.getItems().addAll(showLines, autoSave);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);


        layout = new BorderPane();
        layout.setTop(menuBar);


        Scene scene = new Scene(layout, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
