import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewSample extends Application{

    ListView<String> listView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ListView Sample");

        Button button = new Button("Submit");

        listView = new ListView<>();
        listView.getItems().addAll("Iron Man", "Titanic", "Contact", "Deerhunter", "Platoon", "Inception", "Dr Who", "What happened to Monday",
                "Surrogates", "Halt and Catch Fire", "Silicon Valley", "War Games", "Empire Strikes Back");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        button.setOnAction(e -> buttonClicked());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(listView, button);

        Scene scene = new Scene(layout, 640, 280);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void buttonClicked() {
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems(); // returns all selected movies
        for (String movie : movies) {
            System.out.println(movie);

        }
    }
}
