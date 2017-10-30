import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExtractValidateData extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Extract and validate data");

        VBox layout = new VBox(20);
        layout.setPadding(new Insets(10));

        Label label = new Label("Integer number to send");

        TextField textField = new TextField();
        textField.setPromptText("enter your data here");

        Button button = new Button("Send data");
        button.setOnAction(e -> isInt(textField, textField.getText()));

        layout.getChildren().addAll(label, textField, button);

        Scene scene = new Scene(layout, 480, 140);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private boolean isInt(TextField inuput, String message) {
        try {
            int age = Integer.parseInt(message);
            System.out.println("User is: " + age);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Error: >> " + message + " << is not a number");
            return false;
        }
    }
}
