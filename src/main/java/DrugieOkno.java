import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class DrugieOkno extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Font font = Font.font("Arial", FontWeight.SEMI_BOLD,10);

        //TextArea
        TextArea textArea = new TextArea();
        textArea.setLayoutX(100);
        textArea.setLayoutY(30);
        textArea.setMaxSize(200,100);
        textArea.setFont(font);
        textArea.setPromptText("Enter answer");

        //RadioButton
        RadioButton radioButton = new RadioButton("Yes");
        radioButton.setLayoutX(100);
        radioButton.setLayoutY(250);

        RadioButton radioButton2 = new RadioButton("No");
        radioButton2.setLayoutX(100);
        radioButton2.setLayoutY(280);

        //ToggleGroup -> connection between radiobutton
        ToggleGroup toggleGroup = new ToggleGroup();
        radioButton.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);
        toggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observableValue, Toggle toggle, Toggle t1) {
                RadioButton selected = (RadioButton) t1;
                System.out.println("Selected radiobutton: " + selected.getText());
            }
        });

        //ChoiceBox
        String[] choice = {"Male", "Female"};
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.setLayoutX(150);
        choiceBox.setLayoutY(350);
        choiceBox.getItems().addAll(choice);
        choiceBox.getSelectionModel().selectedIndexProperty()
                .addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue,
                                Number number, Number t1) {
                //System.out.println("Choice index: " + t1.intValue());
                String chosen = choice[t1.intValue()];
                System.out.println("Chosen option from ChoiceBox: " + chosen);
            }
        });

        //ListView
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll(choice);
        listView.setLayoutX(150);
        listView.setLayoutY(300);
        listView.setMaxSize(70,30);
        listView.getSelectionModel().selectedIndexProperty()
                .addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue,
                                Number number, Number t1) {
                String chosenElement = choice[t1.intValue()];
                System.out.println("Chosen element from ListView: " + chosenElement);

            }
        });

        //ProgressBar
        ProgressBar progressBar = new ProgressBar();
        progressBar.setLayoutX(100);
        progressBar.setLayoutY(200);
        progressBar.setProgress(0.5);


        Group root = new Group();
        root.getChildren().add(textArea);
        root.getChildren().add(radioButton);
        root.getChildren().add(radioButton2);
        root.getChildren().add(choiceBox);
        root.getChildren().add(listView);
        root.getChildren().add(progressBar);

        Scene scene = new Scene(root,400,400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Main application");
        primaryStage.show();


    }
}
