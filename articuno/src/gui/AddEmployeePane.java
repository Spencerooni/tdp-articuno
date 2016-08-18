package gui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

/**
 * Created by trainee on 18/08/16.
 */
public class AddEmployeePane extends GridPane {

    private final String INTRO_TEXT = "Enter Employee Details: ";
    private TextField firstName, lastName, niNumber, startSalary, iban, bic, empNum;

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
        GridPane.setColumnSpan(header, 2);
        GridPane.setMargin(header, new Insets(10,0,10,0));
        leftPane.getChildren().add(header);

        //FIRST NAME LABEL
        Label firstNameLabel = new Label("First Name: ");
        firstNameLabel.setFont(Font.font("Verdana", 15));
        GridPane.setConstraints(firstNameLabel, 0, 1);
        GridPane.setMargin(firstNameLabel, new Insets(10, 0, 10, 0));
        leftPane.getChildren().add(firstNameLabel);

        //FIRST NAME TEXT FIELD
        firstName = new TextField();
        firstName.setFont(Font.font("Verdana", 20));
        firstName.setMaxWidth(300);
        GridPane.setConstraints(firstName, 1, 1);
        GridPane.setMargin(firstName, new Insets(10, 0, 10, 0));
        leftPane.getChildren().addAll(firstName);

        //LAST NAME LABEL
        Label lastNameLabel = new Label("Last Name: ");
        lastNameLabel.setFont(Font.font("Verdana", 15));
        GridPane.setConstraints(lastNameLabel, 0, 2);
        GridPane.setMargin(lastNameLabel, new Insets(10, 0, 10, 0));
        leftPane.getChildren().add(lastNameLabel);

        //LAST NAME TEXT FIELD
        lastName = new TextField();
        lastName.setFont(Font.font("Verdana", 20));
        lastName.setMaxWidth(300);
        GridPane.setConstraints(lastName, 1, 2);
        GridPane.setMargin(lastName, new Insets(10, 0, 10, 0));
        leftPane.getChildren().add(lastName);

        //ADDRESS LABEL
        Label addressLabel = new Label("Address: ");
        addressLabel.setFont(Font.font("Verdana", 15));
        GridPane.setConstraints(addressLabel, 0, 3);
        GridPane.setMargin(addressLabel, new Insets(10, 0, 10, 0));
        leftPane.getChildren().add(addressLabel);

        //ADDRESS TEXT AREA
        TextArea address = new TextArea();
        address.setWrapText(true);
        address.setEditable(true);
        address.setFont(Font.font("Verdana", 20));
        address.setMaxWidth(300);
        GridPane.setConstraints(address, 1, 3);
        GridPane.setRowSpan(address, 4);
        GridPane.setMargin(address, new Insets(10, 0, 10, 0));
        leftPane.getChildren().add(address);

        return leftPane;
    }

    private GridPane getRightPane() {
        GridPane rightPane = new GridPane();

        //EMPLOYEE NUMBER LABEL
        Label empNumLabel = new Label("Employee Number: ");
        empNumLabel.setFont(Font.font("Verdana", 15));
        GridPane.setConstraints(empNumLabel, 0, 1);
        GridPane.setMargin(empNumLabel, new Insets(10, 0, 10, 0));
        rightPane.getChildren().add(empNumLabel);

        //EMPLOYEE NUMBER TEXT FIELD
        empNum = new TextField();
        empNum.setFont(Font.font("Verdana", 20));
        empNum.setMaxWidth(300);
        GridPane.setConstraints(empNum, 1, 1);
        GridPane.setMargin(empNum, new Insets(10, 0, 10, 0));
        rightPane.getChildren().add(empNum);

        //START SALARY LABEL
        Label startSalaryLabel = new Label("Starting Salary: ");
        startSalaryLabel.setFont(Font.font("Verdana", 15));
        GridPane.setConstraints(startSalaryLabel, 0, 2);
        GridPane.setMargin(startSalaryLabel, new Insets(10, 0, 10, 0));
        rightPane.getChildren().add(startSalaryLabel);

        //START SALARY TEXT FIELD
        startSalary = new TextField();
        startSalary.setFont(Font.font("Verdana", 20));
        startSalary.setMaxWidth(300);
        GridPane.setConstraints(startSalary, 1, 2);
        GridPane.setMargin(startSalary, new Insets(10, 0, 10, 0));
        rightPane.getChildren().add(startSalary);

        //NI NUMBER LABEL
        Label niNumLabel = new Label("NI Number: ");
        niNumLabel.setFont(Font.font("Verdana", 15));
        GridPane.setConstraints(niNumLabel, 0, 3);
        GridPane.setMargin(niNumLabel, new Insets(10, 0, 10, 0));
        rightPane.getChildren().add(niNumLabel);

        //NI NUMBER TEXT FIELD
        niNumber = new TextField();
        niNumber.setFont(Font.font("Verdana", 20));
        niNumber.setMaxWidth(300);
        GridPane.setConstraints(niNumber, 1, 3);
        GridPane.setMargin(niNumber, new Insets(10, 0, 10, 0));
        rightPane.getChildren().add(niNumber);

        //IBAN LABEL
        Label ibanLabel = new Label("IBAN: ");
        ibanLabel.setFont(Font.font("Verdana", 15));
        GridPane.setConstraints(ibanLabel, 0, 4);
        GridPane.setMargin(ibanLabel, new Insets(10, 0, 10, 0));
        rightPane.getChildren().add(ibanLabel);

        //IBAN TEXT FIELD
        iban = new TextField();
        iban.setFont(Font.font("Verdana", 20));
        iban.setMaxWidth(300);
        GridPane.setConstraints(iban, 1, 4);
        GridPane.setMargin(iban, new Insets(10, 0, 10, 0));
        rightPane.getChildren().add(iban);

        //BIC LABEL
        Label bicLabel = new Label("BIC: ");
        bicLabel.setFont(Font.font("Verdana", 15));
        GridPane.setConstraints(bicLabel, 0, 5);
        GridPane.setMargin(bicLabel, new Insets(10, 0, 10, 0));
        rightPane.getChildren().add(bicLabel);

        //BIC TEXT FIELD
        bic = new TextField();
        bic.setFont(Font.font("Verdana", 20));
        bic.setMaxWidth(300);
        GridPane.setConstraints(bic, 1, 5);
        GridPane.setMargin(bic, new Insets(10, 0, 10, 0));
        rightPane.getChildren().add(bic);

        //ADDING BUTTONS
        HBox buttonbox = getOptionsButtons();
        GridPane.setConstraints(buttonbox, 0, 6);
        rightPane.getChildren().add(buttonbox);

        return rightPane;
    }

    private HBox getOptionsButtons() {
        HBox buttonBox = new HBox();
        buttonBox.setPadding(new Insets(10, 5, 10, 5));
        buttonBox.setSpacing(10);

        Button backButton = ComponentFactory.getButton("Back",
                event -> returnToMainMenu());
        GridPane.setMargin(backButton, new Insets(10, 0, 10, 0));
        Button submitButton = ComponentFactory.getButton("Submit",
                event -> submitInfo());
        GridPane.setMargin(submitButton, new Insets(10, 0, 10, 0));
        buttonBox.getChildren().addAll(backButton, submitButton);

        return buttonBox;
    }

    private void returnToMainMenu() {
        ApplicationFactory.INSTANCE.getMainMenuScene();
    }

    /**
     * Empty Method
     */
    private void submitInfo() {

    }
}
