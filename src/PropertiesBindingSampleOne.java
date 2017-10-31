import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PropertiesBindingSampleOne extends Application{

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Properties Binding");

        //Input and labels
        TextField userInput = new TextField();
        userInput.setMaxWidth(200);
        Label welcomeLabel = new Label("Welcome to the site ");
        Label bindedLabel = new Label();

        HBox bottomText = new HBox(welcomeLabel, bindedLabel);
        bottomText.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(10, userInput, bottomText);
        vBox.setAlignment(Pos.CENTER);

        bindedLabel.textProperty().bind(userInput.textProperty());

        Scene scene = new Scene(vBox, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

// two properties will be created (x and y) & binded together
