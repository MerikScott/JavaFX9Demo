import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Confirmation extends Application{
    Stage window;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage; //just for fun
        window.setTitle("Confirmation to get");

        Button button = new Button("Confirmation");

        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Confirmation Box", "Do you want to confirm?");
            System.out.println("Result is " + result);

        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 640, 480);
        window.setScene(scene);
        window.show();

    }
}
