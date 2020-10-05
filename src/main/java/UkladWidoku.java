import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class UkladWidoku extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //BorderPane
        BorderPane borderPane = new BorderPane();
        TextField textFieldTop = new TextField("Top");
        borderPane.setTop(textFieldTop);
        TextField textFieldBottom = new TextField("Bottom");
        borderPane.setBottom(textFieldBottom);
        TextField textFieldCenter = new TextField("Center");
        borderPane.setCenter(textFieldCenter);
        TextField textFieldLeft = new TextField("Left");
        borderPane.setLeft(textFieldLeft);
        TextField textFieldRight = new TextField("Right");
        borderPane.setRight(textFieldRight);


        Scene scene = new Scene(borderPane,500,500);
        primaryStage.setTitle("Layout");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
