import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DropDownMenu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Drop Down Menu");

        Button button = new Button("Click Me");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        // getItems returns ObservableList object which you can add items to
        choiceBox.getItems().add("Fruits");
        choiceBox.getItems().add("  Apples");
        choiceBox.getItems().add("  Bananas");
        choiceBox.getItems().add("  Pears");
        choiceBox.getItems().add("  Oranges");
        choiceBox.getItems().add("  Lemons");
        choiceBox.getItems().addAll("  Plums", "  Pineapples");

        choiceBox.setValue("Fruits");
        
        button.setOnAction(e-> makeChoice(choiceBox));




        layout.getChildren().addAll(choiceBox, button);

        Scene scene = new Scene(layout, 640, 480);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void makeChoice(ChoiceBox<String> choiceBox) {
        String food = choiceBox.getValue();
        System.out.println(food);
    }

}
