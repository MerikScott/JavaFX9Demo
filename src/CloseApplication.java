import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CloseApplication extends Application {
    Stage window;
    Button closeButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Close application");

        window.setOnCloseRequest(e -> {
            e.consume();
            closeApplication();
        });

        closeButton = new Button("Quit");
        closeButton.setOnAction(e -> closeApplication());

        StackPane layout = new StackPane();
        layout.getChildren().add(closeButton);

        Scene scene = new Scene(layout, 640, 480);
        window.setScene(scene);
        window.show();


    }

    private void closeApplication() {
        Boolean answer = ConfirmBox.display("Sure?", "Sure you want to close?");
        if (answer) {
            System.out.println("File is saved");
            window.close();
        }

    }
}
