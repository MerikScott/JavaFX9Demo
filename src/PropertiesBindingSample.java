import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PropertiesBindingSample extends Application{

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Properties Binding");

        IntegerProperty x = new SimpleIntegerProperty(3);
        IntegerProperty y = new SimpleIntegerProperty(); // no value

        y.bind(x.multiply(10));
        System.out.println("x: " + x.getValue());
        System.out.println("y: " + y.getValue()+ "\n");

        x.setValue(9);

        System.out.println("x: " + x.getValue());
        System.out.println("y: " + y.getValue()+ "\n");

        button = new Button("Submit");

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);

        Scene scene = new Scene(layout, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

// two properties will be created (x and y) & binded together
