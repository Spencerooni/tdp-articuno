package gui;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 * Created by trainee on 18/08/16.
 */
public class AddEmployeePane extends GridPane {

    private final String INTRO_TEXT = "Enter Employee Details: ";
    private TextField firstName, lastName;

    public AddEmployeePane() {
        drawComponents();
    }

    private void drawComponents() {
        GridPane leftPane = getLeftPane();
        GridPane.setConstraints(leftPane, 0, 0);

        GridPane rightPane = getRightPane();
        GridPane.setConstraints(rightPane, 1, 0);

        this.getChildren().addAll(leftPane, rightPane);
    }

    private GridPane getLeftPane() {
        GridPane leftPane = new GridPane();

        //HEADER
        Label header = new Label(INTRO_TEXT);
        header.setFont(Font.font("Verdana", 30));
        GridPane.setConstraints(header, 0, 0);
        GridPane.setMargin(header, new Insets(10,0,10,0));
        leftPane.getChildren().add(header);

        //FIRST NAME LABEL
        Label firstNameLabel = new Label("First Name: ");
        firstNameLabel.setFont(Font.font("Verdana", 20));
        GridPane.setConstraints(firstNameLabel, 0, 1);
        GridPane.setMargin(firstNameLabel, new Insets(10, 0, 10, 0));
        leftPane.getChildren().add(firstNameLabel);

        //FIRST NAME TEXT FIELD
        firstName = new TextField();
        firstName.setPromptText("First Name");
        firstName.setFont(Font.font("Verdana", 20));
        firstName.setMaxWidth(300);
        GridPane.setConstraints(firstName, 0, 2);
        GridPane.setMargin(firstName, new Insets(10, 0, 10, 0));
        leftPane.getChildren().addAll(firstName);

        return leftPane;
    }

    private GridPane getRightPane() {
        GridPane rightPane = new GridPane();

        return rightPane;
    }
}
