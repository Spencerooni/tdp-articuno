package gui;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 * Main Menu pane
 */
public class MainMenuPane extends GridPane {

    /**
     * Default Constructor
     */
    public MainMenuPane() {
        this.setAlignment(Pos.CENTER);

        //Main Image
        ImageView mainImage = ComponentFactory.getImageView("./assets/articuno_main.png", 800);
        GridPane.setConstraints(mainImage, 0, 0);
        this.getChildren().add(mainImage);

        //Buttons
        HBox buttonBox = getOptionsButtons();
        GridPane.setConstraints(buttonBox, 0, 1);
        GridPane.setHalignment(buttonBox, HPos.CENTER);
        this.getChildren().add(buttonBox);
    }

    /**
     * @return Options buttons as a HBox
     */
    private HBox getOptionsButtons() {
        HBox buttonBox = new HBox();
        buttonBox.setPadding(new Insets(10, 5, 10,5));
        buttonBox.setSpacing(10);
        buttonBox.setAlignment(Pos.CENTER);

        Button newEmployeeButton = ComponentFactory.getButton("Add Employee", event -> doNewEmployee());
        Button viewReportsButton = ComponentFactory.getButton("View Reports", event -> doViewReports());
        Button exitApplicationButton = ComponentFactory.getButton("Exit", event -> doExitApplication());
        buttonBox.getChildren().addAll(newEmployeeButton, viewReportsButton, exitApplicationButton);
        return buttonBox;
    }

    /**
     * Go to a new Screen
     */
    private void doNewEmployee() {

    }

    /**
     * Go to a new Screen
     */
    private void doViewReports() {

    }

    /**
     * Exit the Application
     */
    private void doExitApplication() {
        System.exit(0);
    }


}
