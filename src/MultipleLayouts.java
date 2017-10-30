import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleLayouts extends Application {

    Stage window;
    Button closeButton;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Multiple layouts");

        HBox topMenu = new HBox();
        Button fileBtn = new Button("File");
        Button editBtn = new Button("Edit");
        Button viewBtn = new Button("View");
        topMenu.getChildren().addAll(fileBtn, editBtn, viewBtn);

        VBox leftMenu = new VBox();
        Button categoryBtn = new Button("Category");
        Button auctionBtn = new Button("Auction");
        Button bidBtn = new Button("Bid");
        leftMenu.getChildren().addAll(categoryBtn, auctionBtn, bidBtn);


        closeButton = new Button("Quit");

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);
        borderPane.setBottom(closeButton);



        Scene scene = new Scene(borderPane, 640, 480);

        window.setScene(scene);
        window.show();


    }
}
