import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
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
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(10,5,10,5));
        hBox.setBackground(new Background(new BackgroundFill(Color.LIGHTSEAGREEN, CornerRadii.EMPTY,Insets.EMPTY)));
        hBox.getChildren().addAll(menuButton,contactButton,orderButton);

        //VBox
        VBox vBox = new VBox();
        ImageView pizzaImageView = new ImageView(new Image("obrazki/ikony/pizza.png"));
        Label pizzaLabel = new Label("Pizza",pizzaImageView);
        ImageView hamburgerImageView = new ImageView(new Image("obrazki/ikony/hamburger.png"));
        Label hamburgerLabel = new Label("Hamburger",hamburgerImageView);
        ImageView drinksImageView = new ImageView(new Image("obrazki/ikony/napoje.png"));
        Label drinksLabel = new Label("Drinks",drinksImageView);
        vBox.getChildren().addAll(pizzaLabel,hamburgerLabel,drinksLabel);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10,10,10,10));
        vBox.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY,Insets.EMPTY)));



        //BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBox);
        borderPane.setLeft(vBox);


        Scene scene = new Scene(borderPane,400,400);
        primaryStage.setTitle("Layout");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
