import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class CssThemesAndStyles extends Application{


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("GridPane Sample");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);
        //gridPane.setGridLinesVisible(true);

        //name label
        Label nameLbl = new Label("Username");
        GridPane.setConstraints(nameLbl, 0,0);
        nameLbl.setStyle("-fx-text-fill: antiquewhite");
        nameLbl.setId("bold-label");

        //name input
        TextField nameInput = new TextField("Billy");
        GridPane.setConstraints(nameInput, 1, 0);

        //pass label
        Label passwordLbl = new Label("Password");
        GridPane.setConstraints(passwordLbl, 0,1);
        nameLbl.setStyle("-fx-text-fill: #e8e8e8");


        //pass input
        PasswordField passwordInput = new PasswordField();
        passwordInput.setPromptText("password");
        GridPane.setConstraints(passwordInput, 1, 1);

        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 1,2);

        loginButton.setOnAction(e -> {
            //setUserAgentStylesheet(STYLESHEET_CASPIAN);
        });

        Button signUpButton = new Button("Sign Up");
        signUpButton.getStyleClass().add("button-blue");
        GridPane.setConstraints(signUpButton,1,3);

        gridPane.getChildren().addAll(nameLbl, nameInput, passwordLbl, passwordInput, loginButton,signUpButton);


        Scene scene = new Scene(gridPane, 640, 480);
        scene.getStylesheets().add("Viper.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
