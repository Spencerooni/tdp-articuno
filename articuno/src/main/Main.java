package main;

import gui.ApplicationFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by trainee on 18/08/16.
 */
public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        ApplicationFactory.INSTANCE.initialiseGui(primaryStage);
        Scene scene = ApplicationFactory.INSTANCE.getMainMenuScene();
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> doExit());
    }

    /**
     * Here we go.
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Exit the application gracefully.
     */
    private void doExit() {
        System.exit(0);
    }
}
