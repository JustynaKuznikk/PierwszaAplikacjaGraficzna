import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class KontrolkiZadanie extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Font font = Font.font("Arial", FontWeight.BOLD,15);

        Label label = new Label("Downloading progress");
        label.setLayoutY(50);
        label.setLayoutX(70);
        label.setFont(font);

        Label label2 = new Label("Finished successfully");
        label2.setLayoutY(180);
        label2.setLayoutX(80);
        label2.setFont(font);
        label2.setVisible(false);

        ProgressBar progressBar = new ProgressBar();
        progressBar.setLayoutY(80);
        progressBar.setLayoutX(100);
        progressBar.setProgress(0);


        Button button2 = new Button("Restart");
        button2.setLayoutY(120);
        button2.setLayoutX(140);
        button2.setDisable(true);

        Button button = new Button("Start");
        button.setLayoutY(120);
        button.setLayoutX(80);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <=100 ; i++) {
                    double progressValue = 0.01 *i;

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(progressValue);
                        }
                    });
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                thread.start();
            }
        });




        Group group = new Group();
        group.getChildren().add(label);
        group.getChildren().add(label2);
        group.getChildren().add(progressBar);
        group.getChildren().add(button);
        group.getChildren().add(button2);

        Scene scene = new Scene(group,300,300);
        primaryStage.setTitle("Downloading");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
