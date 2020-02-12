/**
 * <h1>Text Editor</h1>
 * This class demonstrates in depth understanding of creating a JavaFX GUI supporting a Text Editor.
 *
 * @author  Craig Opie
 * @version 1.0, 11/02/19
 * @class   TextEditor
 * @concept The core concept for this lesson is the ability to layout a JavaFX GUI and add controls to it.
 *
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;

/**
 * <h2>TextEditor Class</h2>
 * Creates a GUI TextEditor object
 *
 */
public class TextEditor extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        TextArea text_ = new TextArea();

        Scene scene = new Scene(text_, 800, 600);
        text_.prefWidthProperty().bind(scene.widthProperty());
        text_.prefHeightProperty().bind(scene.heightProperty());
        text_.setWrapText(true);

        stage.setTitle("Text Editor");
        stage.setScene(scene);
        stage.show();
    }
}
