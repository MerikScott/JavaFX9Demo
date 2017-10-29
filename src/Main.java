import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class Main extends Application {

    Button button, button1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Just the title");


        GridPane gridPaneLayout = new GridPane();
        //gridPaneLayout.setGridLinesVisible(true);
        gridPaneLayout.setPadding(new Insets(10));
        gridPaneLayout.setHgap(5);
        gridPaneLayout.setVgap(5);
        ColumnConstraints column1 = new ColumnConstraints(100);
        ColumnConstraints column2 = new ColumnConstraints(50, 150, 300);
        column2.setHgrow(Priority.ALWAYS);
        gridPaneLayout.getColumnConstraints().addAll(column1, column2);

        button = new Button();
        button.setText("Click me");
        button.setOnAction(e -> System.out.println("Lambda is coming"));

        button1 = new Button();
        button1.setText("Or click me");
        button1.setLayoutX(10);
        button1.setLayoutY(10);
        button1.setOnAction(e -> System.out.println("Panda is coming"));



        gridPaneLayout.add(button, 0, 0);
        gridPaneLayout.add(button1, 1, 0);
       // gridPaneLayout.getChildren().add(button);
        //gridPaneLayout.getChildren().add(button1);

        Scene scene = new Scene(gridPaneLayout, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
