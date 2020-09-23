import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
        Font font1 = Font.font("Arial", FontWeight.BOLD,15);

        //System.out.println(Font.getFamilies());
        //Color color = Color.web("#FFFF12");

        //Label control
        Label label = new Label("Sign in");
        label.setLayoutX(150);
        label.setLayoutY(30);
        //label.setFont(new Font(20));
        label.setFont(font);
        label.setTextFill(Color.BLACK);
        //label.setTextFill(color);
        label.setMaxWidth(100);
        //label.setWrapText(true);
        //label.setRotate(15);


        //ImageView control
        Image picture = new Image("email.png");
        ImageView imageView = new ImageView(picture);
        //label.setGraphic(imageView);
//      Label labelWithView = new Label("Label with picture",imageView);
//      labelWithView.setLayoutX(50);
//      labelWithView.setLayoutY(10);
        imageView.setLayoutX(50);
        imageView.setLayoutY(10);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);

        //Button:
        Button button = new Button("  Submit  ");
        //button.setText("Save e-mail");
        button.setLayoutX(160);
        button.setLayoutY(300);
        button.setTextFill(Color.BLACK);
        //button.setGraphic(imageView);
        button.setMaxWidth(300);
        button.setWrapText(true);
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("Clicked ");
//                String text = button.getText() + " wow ";
//                button.setText(text);
//                button.setDisable(true);
//            }
//        });

        //TextField
        TextField textField = new TextField();
        textField.setLayoutX(90);
        textField.setLayoutY(150);
        textField.setMaxWidth(300);
        textField.setPromptText("Enter email");
        textField.setPrefColumnCount(20);

        Label label2 = new Label("Email address");
        label2.setLayoutY(120);
        label2.setLayoutX(90);
        label2.setFont(font1);

        //PasswordField
        PasswordField passwordField = new PasswordField();
        passwordField.setLayoutX(90);
        passwordField.setLayoutY(240);
        passwordField.setMaxWidth(300);
        passwordField.setPromptText("Enter password");
        passwordField.setPrefColumnCount(20);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Email: " + textField.getText());
                System.out.println("Password: " + passwordField.getText());
                button.setDisable(true);

            }
        });

        Label label1 = new Label("Password");
        label1.setLayoutY(210);
        label1.setLayoutX(90);
        label1.setFont(font1);

        //root:
        Group group = new Group();
        group.getChildren().add(label);
        group.getChildren().add(imageView);
        //group.getChildren().add(labelWithView);
        group.getChildren().add(button);
        group.getChildren().add(textField);
        group.getChildren().add(label1);
        group.getChildren().add(passwordField);
        group.getChildren().add(label2);


        //scene
        Scene scene = new Scene(group,400,400, Color.WHITE);

        //stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Account login");
        primaryStage.show();

    }
}
