import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UkladWidoku extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Group group = new Group();
        Scene scene = new Scene(group,300,300);
        primaryStage.setTitle("Layout");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
