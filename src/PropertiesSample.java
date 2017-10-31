import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class PropertiesSample extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Properties");

        Person billy = new Person();
        billy.firstNameProperty().addListener((v, oldValue, newValue) -> {
            System.out.println("Name changed to " + newValue);
            System.out.println("firstNameProperty(): " + billy.firstNameProperty());
            System.out.println("getFirstName: " + billy.getFirstName());
        }); // used when value od firstName changes
        //billy.setFirstName("Billy");


        Button button = new Button("Submit");
        button.setOnAction(e -> billy.setFirstName("Lucky"));

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);


        Scene scene = new Scene(layout, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
