/**
 * <h1>Events</h1>
 * This class demonstrates in depth understanding of handling a JavaFX event.
 *
 * @author  Craig Opie
 * @version 1.0, 11/02/19
 * @class   Events
 * @concept The core concept for this lesson is the ability to handle a JavaFX event.
 *
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

public class Events extends Application {

    public int operation = 0;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Events events = new Events();

        GridPane grid_ = new GridPane();

        Label label_01 = new Label("First Number:");
        Label label_02 = new Label("Second Number:");
        Label label_result = new Label("");

        TextField text_01 = new TextField();
        TextField text_02 = new TextField();

        Button button_add = new Button("+");
        Button button_subtract = new Button("-");
        Button button_multiply = new Button("*");
        Button button_divide = new Button("/");
        Button button_equals = new Button("=");

        grid_.setHgap(10);
        grid_.setVgap(10);

        grid_.add(label_01, 1, 0);
        grid_.add(text_01, 2, 0);
        grid_.add(button_add, 3, 1);
        grid_.add(button_subtract, 4, 1);
        grid_.add(button_multiply, 5, 1);
        grid_.add(button_divide, 6, 1);
        grid_.add(label_02, 1, 2);
        grid_.add(text_02, 2, 2);
        grid_.add(button_equals, 3, 3);
        grid_.add(label_result, 2, 4);

        Scene scene = new Scene(grid_);

        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();

        button_add.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                events.operation = 1;
            }
        }));

        button_subtract.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                events.operation = 2;
            }
        }));

        button_multiply.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                events.operation = 3;
            }
        }));

        button_divide.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                events.operation = 4;
            }
        }));

        button_equals.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {

                int firstNum = Integer.parseInt(text_01.getText());
                int secondNum = Integer.parseInt(text_02.getText());

                switch(events.operation) {
                    case 1: label_result.setText(Integer.toString(firstNum + secondNum));
                            break;
                    case 2: label_result.setText(Integer.toString(firstNum - secondNum));
                            break;
                    case 3: label_result.setText(Integer.toString(firstNum * secondNum));
                            break;
                    case 4: label_result.setText(Double.toString((double)firstNum/secondNum));
                            break;
                    default:label_result.setText("Please select an operation to perform");
                }
            }
        }));
    }
}
