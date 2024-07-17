package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Helloworld1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a layout for the scene
        StackPane root = new StackPane();
        // Add a label to the layout
        root.getChildren().add(new Label("Hello, JavaFX!"));
        
        // Create a scene with the layout
        Scene scene = new Scene(root, 300, 200);
        
        // Set the title of the stage
        primaryStage.setTitle("Hello JavaFX!");
        // Add the scene to the stage
        primaryStage.setScene(scene);
        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
