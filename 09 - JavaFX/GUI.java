/**
 * <h1>GUI</h1>
 * This class demonstrates in depth understanding of creating a JavaFX GUI.
 *
 * @author  Craig Opie
 * @version 1.0, 11/02/19
 * @class   GUI
 * @concept The core concept for this lesson is the ability to create a JavaFX GUI.
 *
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;



/**
 * <h2>GUI Class</h2>
 * Creates a GUI object using JavaFX libraries
 *
 */
 public class GUI extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label label = new Label("This is Craig Opie's JavaFX GUI");
        stage.setTitle("Craig Opie");
        stage.setScene(new Scene(label, 250, 100));
        stage.show();
    }
}
