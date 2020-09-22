import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
        Font font = Font.font("Arial", FontWeight.BOLD,30);
        System.out.println(Font.getFamilies());
        Color color = Color.web("#FFFF12");

        //Label control
        Label label = new Label("My first label");
        label.setLayoutX(250);
        label.setLayoutY(350);
        //label.setFont(new Font(20));
        label.setFont(font);
        label.setTextFill(Color.VIOLET);
        //label.setTextFill(color);
        label.setMaxWidth(100);
        label.setWrapText(true);
        label.setRotate(15);


        //ImageView control
        Image picture = new Image("sosa2.png");
        ImageView imageView = new ImageView(picture);
        //label.setGraphic(imageView);
        Label labelWithView = new Label("Label with picture",imageView);
        labelWithView.setLayoutX(100);
        labelWithView.setLayoutY(100);
        imageView.setFitHeight(100);
        imageView.setFitWidth(150);
        imageView.setPreserveRatio(true);



        //root:
        Group group = new Group();
        group.getChildren().add(label);
        //group.getChildren().add(imageView);
        group.getChildren().add(labelWithView);

        //scene
        Scene scene = new Scene(group,800,600, Color.GRAY);

        //stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Aplication controls");
        primaryStage.show();

    }
}
