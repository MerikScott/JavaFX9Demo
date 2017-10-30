import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CheckBoxes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CheckBox Example");

        //Checkboxes
        CheckBox carrotBox = new CheckBox("Carrot");
        CheckBox orangeBox = new CheckBox("Orange");
        carrotBox.setSelected(true);

        Button button = new Button("Order now");
        button.setOnAction(e -> handleOptions(carrotBox, orangeBox));


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(carrotBox, orangeBox, button);


        Scene scene = new Scene(layout, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void handleOptions(CheckBox box1, CheckBox box2) {
        String message = "User ordered juice with: ";

        if (box1.isSelected()) {
            message += "carrot ";
        }

        if (box2.isSelected()) {
            message += "orange ";
        }

        System.out.println(message);
    }
}
