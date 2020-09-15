import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PierwszaAplikacja extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //Stage ->    Scene ->    StackPane ->    Text

        Text text = new Text("My graphic application");
        Text text2 = new Text("Text from application");
        Button button = new Button("My button");


        //StackPane == root(beginning), objects in the middle
        //StackPane root = new StackPane();
        //objects in horizontal position
        //HBox root = new HBox();
        //objects in vertical position
        VBox root = new VBox();
        //download related children and add text
        root.getChildren().add(text);
        root.getChildren().add(text2);
        root.getChildren().add(button);

        //canvas for drawing objects
        Scene scene = new Scene(root);


        //stage:
        primaryStage.setScene(scene);
        primaryStage.setTitle("My application");
        //setting window coordinates
        primaryStage.setX(500);
        primaryStage.setY(300);
        //setting the height and width of the window
        primaryStage.setWidth(500);
        primaryStage.setHeight(300);
        //setting style of the main window
        primaryStage.initStyle(StageStyle.DECORATED);
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        //primaryStage.initStyle(StageStyle.UNIFIED);
        //primaryStage.initStyle(StageStyle.UTILITY);
        //primaryStage.initStyle(StageStyle.TRANSPARENT);
        //full screen window:
        primaryStage.setFullScreen(false);
        //necessary for the application window to appear
        primaryStage.show();

    }
}
