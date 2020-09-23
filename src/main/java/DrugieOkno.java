import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
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


        Group root = new Group();
        root.getChildren().add(textArea);
        root.getChildren().add(radioButton);
        root.getChildren().add(radioButton2);

        Scene scene = new Scene(root,400,400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Main application");
        primaryStage.show();


    }
}
