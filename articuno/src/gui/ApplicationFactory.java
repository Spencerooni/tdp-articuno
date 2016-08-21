package gui;

import javafx.scene.Scene;
import javafx.stage.Stage;

public enum ApplicationFactory {
    INSTANCE;

    private Scene mainMenuScene, addEmployeeScene, viewRecordsScene;
    private Stage primaryStage;
    private static final int WIDTH = 900;
    private static final int HEIGHT = 600;

    /**
     * Sets up and initialises the GUI
     *
     * @param primaryStage the primaryStage of the GUI
     */
    public void initialiseGui(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Articuno Applications");
        this.primaryStage.setResizable(false);
        this.primaryStage.setMaxHeight(900);
        this.primaryStage.setMaxWidth(800);
    }

    /**
     * @return the primaryStage of the GUI
     */
    public Stage getPrimaryStage() {
        return this.primaryStage;
    }

    /**
     * Sets the Scene on the primaryStage to the MainMenuScene
     */
    public void showMainMenuScene() {
        this.getPrimaryStage().setScene(this.getMainMenuScene());
    }

    /**
     * @return the Main Menu Scene
     */
    public Scene getMainMenuScene() {
        if(this.mainMenuScene == null) {
            this.mainMenuScene = new Scene(new MainMenuPane(), WIDTH, HEIGHT);
        }
        return this.mainMenuScene;
    }

    /**
     * Sets the Scene on the primaryStage to the AddEmployeeScene
     */
    public void showAddEmployeeScene() {
        this.getPrimaryStage().setScene(this.getAddEmployeeScene());
    }

    /**
     * @return the Add Employee Scene
     */
    public Scene getAddEmployeeScene() {
        if(this.addEmployeeScene == null) {
            this.addEmployeeScene = new Scene(new AddEmployeePane(), WIDTH, HEIGHT);
        }
        return this.addEmployeeScene;
    }

    /**
     * Sets the Scene on the primaryStage to the ViewRecordsScene
     */
    public void showViewRecordsScene() {
        this.getPrimaryStage().setScene(this.getViewRecordsScene());
    }

    /**
     * @return the View Reports Scene
     */
    public Scene getViewRecordsScene() {
        if (this.viewRecordsScene == null) {
            this.viewRecordsScene = new Scene(new ViewReportsPane(), WIDTH, HEIGHT);
        }

        return this.viewRecordsScene;
    }
}
