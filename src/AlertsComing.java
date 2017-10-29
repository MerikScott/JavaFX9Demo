import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class AlertsComing extends Application{
    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Alert is coming");

        button = new Button("Click me");
        button.setOnAction(e -> AlertBox.display("Title", "There is important message"));
        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);

        Scene scene = new Scene(layout, 600 ,500);
        window.setScene(scene);
        window.show();

    }
}
