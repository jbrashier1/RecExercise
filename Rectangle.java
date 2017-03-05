import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;

public class Rectangle extends Application {
    @Override

    public void start(Stage primaryStage) {
        TextInputDialog input = new TextInputDialog();
        input.setTitle("Rectangle Application");
        input.setHeaderText("Area and Perimeter of a Rectangle");
        input.setContentText("Enter the Length and Width of a Rectangle.");
        input.showAndWait();

        String inputString = input.getResult();
        String width = inputString.substring(0, (inputString.indexOf(" ")));
        String height = inputString.substring((inputString.indexOf(" ")+1), (inputString.length()));
        double w = Double.parseDouble(width);
        double h = Double.parseDouble(height);

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Rectangle");
        alert.setHeaderText("Perimeter and Area");
        alert.setContentText("The perimeter is " + ((2*w) + (2*h)) + ", and the area is " + (w*h) + ".");
        alert.showAndWait();
    }
}
