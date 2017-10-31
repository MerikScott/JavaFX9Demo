import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewSample extends Application{

    TableView<Product> table;
    TextField nameInput, priceInput, quantityInput;

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

        // name, price & quantity input
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);

        priceInput = new TextField();
        priceInput.setPromptText("Price");
        priceInput.setMinWidth(100);

        quantityInput = new TextField();
        quantityInput.setPromptText("Quantity");
        quantityInput.setMinWidth(100);

        // here goes buttons
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClicked());
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e -> deleteButtonClicked());

        HBox manipulateBox = new HBox();
        manipulateBox.setPadding(new Insets(10));
        manipulateBox.setSpacing(10);
        manipulateBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);

        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(table, manipulateBox);


        Scene scene = new Scene(vBox, 640, 480);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addButtonClicked() {
        Product product = new Product();
        product.setName(nameInput.getText());
        product.setPrice(Double.parseDouble(priceInput.getText()));
        product.setQuantity(Integer.parseInt((quantityInput.getText())));
        table.getItems().add(product);
        nameInput.clear();
        priceInput.clear();
        quantityInput.clear();
    }

    private void deleteButtonClicked(){
        ObservableList<Product> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();

        productSelected.forEach(allProducts::remove);

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
