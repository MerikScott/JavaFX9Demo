import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewSample extends Application{

    TableView<Product> table;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("TableViewSample");

        // name column
        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMaxWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("name")); // which values to store in column

        TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMaxWidth(120);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<Product, Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMaxWidth(120);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);



        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(table);


        Scene scene = new Scene(vBox, 640, 480);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Get all of the products - usually connected to database or file
    public ObservableList<Product> getProduct() {

        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("HP", 859.0,20));
        products.add(new Product("iPad", 459.0,10));
        products.add(new Product("Magic Mouse", 59.90,30));
        products.add(new Product("Surface", 159.0,100));
        products.add(new Product("Asus 56 Screener", 859.0,17));
        products.add(new Product("WD Caviar 10TB", 159.90,4));

        return products;
    }
}
