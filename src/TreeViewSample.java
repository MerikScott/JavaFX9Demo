import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TreeViewSample extends Application{

    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("TreeView Sample");

        TreeItem<String> root, movies, fruits;

        root = new TreeItem<>();
        root.setExpanded(true); // when app starts everything will be expnded

        // movies branch (have to set parent)
        movies = makeBranch("Movies", root);
        makeBranch("Deerhunter", movies);
        makeBranch("E.T.", movies);
        makeBranch("StarWars", movies);

        fruits = makeBranch("Fruits", root);

        makeBranch("Apple", fruits);
        makeBranch("Orange", fruits);
        makeBranch("Plum", fruits);
        makeBranch("Pear", fruits);
        makeBranch("Lemon", fruits);

        // create tree
        tree = new TreeView<>(root);
        tree.setShowRoot(false); //root is just a container, not for show



        // fruits branch

        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout, 640, 280);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    // building branch
    private TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}
