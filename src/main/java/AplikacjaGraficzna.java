import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AplikacjaGraficzna extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //primaryStage to nasze główne okno
    @Override
    public void start(Stage primaryStage) {
        //Stage ->    Scene ->    StackPane ->    Text

        Text text = new Text("Tekst z pierwszej aplikacji graficznej");

        //StackPane == root(korzeń/początek)
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(text);

        //płótno do rysowania obiektów
        Scene scene = new Scene(stackPane);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
