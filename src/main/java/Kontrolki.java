import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Kontrolki extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Font font = Font.font("Arial", FontWeight.BOLD,16);
        System.out.println(Font.getFamilies());
        Color color = Color.web("#FFFF12");
        //Label control
        Label label = new Label("My first label");
        label.setLayoutX(10);
        label.setLayoutY(35);
        //label.setFont(new Font(20));
        label.setFont(font);
        //label.setTextFill(Color.VIOLET);
        label.setTextFill(color);
        label.setMaxWidth(50);

        //root:
        Group group = new Group();
        group.getChildren().add(label);
        Scene scene = new Scene(group,800,600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Aplication controls");
        primaryStage.show();

    }
}
