import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
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

        //StackPane
        StackPane stackPane = new StackPane();
        ImageView bigPizzaImageView = new ImageView(new Image
                ("obrazki/pizza/pizza-cztery-sery-duza.png"));
        Label bigPizzaLabel = new Label("Four cheese: " +
                "mozzarella, feta, gouda, parmesan");
        bigPizzaLabel.setTextFill(Color.WHITE);
        stackPane.getChildren().addAll(bigPizzaImageView,bigPizzaLabel);
        stackPane.setAlignment(Pos.CENTER);
        stackPane.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY,Insets.EMPTY)));

        //FlowPane
        FlowPane flowPane = new FlowPane();
        ImageView pizza1ImageView = new ImageView(new Image("obrazki/pizza/pizza-cztery-sery.png"));
        ImageView pizza2ImageView = new ImageView(new Image("obrazki/pizza/pizza-funghi.png"));
        ImageView pizza3ImageView = new ImageView(new Image("obrazki/pizza/pizza-margaritta.png"));
        ImageView pizza4ImageView = new ImageView(new Image("obrazki/pizza/pizza-mexicana.png"));
        ImageView pizza5ImageView = new ImageView(new Image("obrazki/pizza/pizza-pepperoni.png"));
        ImageView pizza6ImageView = new ImageView(new Image("obrazki/pizza/pizza-salami.png"));
        flowPane.getChildren().addAll(pizza1ImageView,pizza2ImageView,pizza3ImageView,
        pizza4ImageView, pizza5ImageView, pizza6ImageView);
        flowPane.setOrientation(Orientation.HORIZONTAL);
        flowPane.setMaxWidth(150);
        flowPane.setVgap(10);
        flowPane.setHgap(5);
        flowPane.setPadding(new Insets(5,5,5,5));

        //GridPane
        Button minusButton = new Button("-");
        minusButton.setPrefSize(30,30);
        Button plusButton = new Button("+");
        Button okButton = new Button("OK");
        Button cancelButton = new Button("CANCEL");
        plusButton.setPrefSize(30,30);
        Label label = new Label("1");
        label.setPadding(new Insets(0,10,0,10));
        GridPane gridPane = new GridPane();
        Pane pane = new Pane();
        pane.setPrefWidth(50);
        gridPane.add(plusButton,0,0);
        gridPane.add(label,1,0);
        gridPane.add(minusButton,2,0);
        gridPane.add(pane,3,1);
        gridPane.add(okButton,4,1);
        gridPane.add(cancelButton,5,1);


        //BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBox);
        borderPane.setLeft(vBox);
        borderPane.setCenter(stackPane);
        borderPane.setRight(flowPane);
        borderPane.setBottom(gridPane);


        Scene scene = new Scene(borderPane,800,650);
        primaryStage.setTitle("Layout");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
