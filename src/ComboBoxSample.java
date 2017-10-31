import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxSample extends Application {

    ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Combo Box Example");


        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Good will hunting",
                "Deerhunter",
                "Black Hawk Down"
        );
        comboBox.setPromptText("Select favorite movie");
        comboBox.setOnAction(e -> System.out.println("User selected " + comboBox.getValue()));
        comboBox.setEditable(true);

        Button button = new Button("Submit");
        button.setOnAction(e -> printMovie());

        VBox layout = new VBox(20);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(comboBox, button);

        Scene scene = new Scene(layout, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void printMovie() {
        System.out.println(comboBox.getValue());
    }
}
