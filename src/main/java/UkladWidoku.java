import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class UkladWidoku extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //HBox
        Button menuButton = new Button("Menu");
        Button contactButton = new Button("Contact");
        Button orderButton = new Button("Order");
        HBox hBox = new HBox();
        hBox.getChildren().addAll(menuButton,contactButton,orderButton);


        //BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBox);


        Scene scene = new Scene(borderPane,500,500);
        primaryStage.setTitle("Layout");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
