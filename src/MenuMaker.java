import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
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
        fileMenu.getItems().add(new MenuItem("New..."));
        fileMenu.getItems().add(new MenuItem("Open..."));
        fileMenu.getItems().add(new MenuItem("Save..."));
        fileMenu.getItems().add(new MenuItem("Settings..."));
        fileMenu.getItems().add(new MenuItem("Exit"));

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);


        Scene scene = new Scene(layout, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
