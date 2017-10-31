import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.stage.Stage;

public class PropertiesBindingStageZero extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception {

        IntegerProperty x = new SimpleIntegerProperty(3);
        IntegerProperty y = new SimpleIntegerProperty(); // no value

        y.bind(x.multiply(10));
        System.out.println("x: " + x.getValue());
        System.out.println("y: " + y.getValue()+ "\n");

        x.setValue(9);

        System.out.println("x: " + x.getValue());
        System.out.println("y: " + y.getValue()+ "\n");

    }


}
