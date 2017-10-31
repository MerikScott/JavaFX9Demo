import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    //String firstName = "";
    private StringProperty firstName = new SimpleStringProperty(this, "firstNae", "");
    // parameters
    // 1) object that contains it  (this)
    // 2) name
    // 3) default value
    //it's string property that you can read and write to
    // StringProperty - abstract class

    // return the firstName value (as normal getter)
    public String getFirstName() {
        return firstName.get();
    }

    //returns StringProperty object
    public StringProperty firstNameProperty() {
        return firstName;
    }

    // sets firstName value
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }



/*    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }*/


}
