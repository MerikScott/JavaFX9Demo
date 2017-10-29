import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleScenes extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label1 = new Label("Welcome to the first scene");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        // Layout 1 - children are laid in vertical column
        VBox layout1 = new VBox(20); //space 20 px
        layout1.getChildren().addAll(label1, button1);

        scene1 = new Scene(layout1, 200, 200);

        Label label2 = new Label("Welcome to the second scene");
        Button button2 = new Button("Go to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        // Layout 1 - children are laid in vertical column
        StackPane layout2 = new StackPane(); //space 20 px
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2, 600,300);

        window.setScene(scene1);
        window.setTitle("Best window");
        window.show();

    }
}
