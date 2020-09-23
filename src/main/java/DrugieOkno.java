import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DrugieOkno extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TextArea textArea = new TextArea();
        textArea.setLayoutX(130);
        textArea.setLayoutY(30);
        textArea.setMaxSize(100,100);


        Group root = new Group();
        root.getChildren().add(textArea);
        Scene scene = new Scene(root,400,400, Color.OLIVEDRAB);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Main application");
        primaryStage.show();


    }
}
