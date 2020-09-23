import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class DrugieOkno extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Font font = Font.font("Arial", FontWeight.SEMI_BOLD,10);

        //TextArea
        TextArea textArea = new TextArea();
        textArea.setLayoutX(100);
        textArea.setLayoutY(30);
        textArea.setMaxSize(200,100);
        textArea.setFont(font);
        textArea.setPromptText("Enter email");



        Group root = new Group();
        root.getChildren().add(textArea);

        Scene scene = new Scene(root,400,400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Main application");
        primaryStage.show();


    }
}
