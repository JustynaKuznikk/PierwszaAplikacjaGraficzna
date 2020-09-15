import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AplikacjaGraficzna extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //primaryStage to nasze główne okno
    @Override
    public void start(Stage primaryStage) {
        //Stage ->    Scene ->    StackPane ->    Text

        Text text = new Text("Moja aplikacja graficzna");

        //StackPane == root(korzeń/początek)
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(text);

        //płótno do rysowania obiektów
        Scene scene = new Scene(stackPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Moja aplikacja");
        //ustawianie współrzędnych ustawiania okna
        primaryStage.setX(500);
        primaryStage.setY(300);
        //ustawienie wysokości i szerokości okna
        primaryStage.setWidth(500);
        primaryStage.setHeight(300);
        //ustawianie stylu
        primaryStage.initStyle(StageStyle.DECORATED);
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        //primaryStage.initStyle(StageStyle.UNIFIED);
        //primaryStage.initStyle(StageStyle.UTILITY);
        //primaryStage.initStyle(StageStyle.TRANSPARENT);
        //okienko na cała szerokość ekranu
        //primaryStage.setFullScreen(true);

        primaryStage.show();

    }
}
