package gui;

import com.sun.javafx.scene.layout.region.LayeredBackgroundPositionConverter;
import employee.Employee;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class AddEmployeePane extends GridPane {

    private static final String INTRO_TEXT = "Enter Employee Details";
    private TextField firstName, lastName, niNumber, startSalary, iban, bic, empNum, addressLineOne, addressLineTwo,
            addressCity, addressCountry, addressPostcode;

    public AddEmployeePane() {
        drawComponents();
    }

    /**
     * Draws four GridPanes and adds them to the parent
     */
    private void drawComponents() {
        GridPane topPane = getTopPane();
        GridPane.setConstraints(topPane, 0, 0);
        GridPane.setColumnSpan(topPane, 2);

        GridPane leftPane = getLeftPane();
        GridPane.setConstraints(leftPane, 0, 1);

        GridPane rightPane = getRightPane();
        GridPane.setConstraints(rightPane, 1, 1);

        GridPane bottomPane = getBottomPane();
        GridPane.setConstraints(bottomPane, 0, 2);
        GridPane.setColumnSpan(bottomPane, 2);

        this.getChildren().addAll(topPane, leftPane, rightPane, bottomPane);
    }

    /**
     * @return the Top Pane of the AddEmployeePane, as a GridPane
     */
    private GridPane getTopPane() {

        GridPane topPane = new GridPane();

        //HEADER
        Label header = new Label(INTRO_TEXT);
        header.setFont(Font.font("Verdana", 30));
        GridPane.setConstraints(header, 0, 0);
        GridPane.setColumnSpan(header, 2);
        GridPane.setMargin(header, new Insets(10,0,10,0));
        topPane.setAlignment(Pos.CENTER);

        topPane.getChildren().add(header);

        return topPane;
    }

    /**
     * @return the Left Pane of the AddEmployeePane, as a GridPane
     */
    private GridPane getLeftPane() {
        GridPane leftPane = new GridPane();

        //FIRST NAME
        Label firstNameLabel = ComponentFactory.getLabel("First Name: ", 0, 1);
        firstName = ComponentFactory.getTextField(1,1);

        //LAST NAME
        Label lastNameLabel = ComponentFactory.getLabel("Last Name: ", 0, 2);
        lastName = ComponentFactory.getTextField(1, 2);

        //ADDRESS
        Label addressOneLabel = ComponentFactory.getLabel("Address: ", 0, 3);
        addressLineOne = ComponentFactory.getTextField(1,3);
        Label addressTwoLabel = ComponentFactory.getLabel(" ", 0, 4);
        addressLineTwo = ComponentFactory.getTextField(1,4);
        Label addressCityLabel = ComponentFactory.getLabel("City: ", 0, 5);
        addressCity = ComponentFactory.getTextField(1,5);
        Label addressCountryLabel = ComponentFactory.getLabel("Country", 0, 6);
        addressCountry = ComponentFactory.getTextField(1, 6);
        Label addressPostcodeLabel = ComponentFactory.getLabel("Postcode: ", 0, 7);
        addressPostcode = ComponentFactory.getTextField(1, 7);

        leftPane.getChildren().addAll(firstNameLabel,firstName,lastNameLabel,lastName,addressOneLabel,
                addressLineOne, addressTwoLabel, addressLineTwo, addressCityLabel, addressCity, addressCountryLabel,
                addressCountry, addressPostcodeLabel, addressPostcode);

        leftPane.setAlignment(Pos.CENTER_LEFT);
        return leftPane;
    }

    /**
     * @return the Right Pane of the AddEmployeePane, as a GridPane
     */
    private GridPane getRightPane() {
        GridPane rightPane = new GridPane();

        //EMPLOYEE NUMBER LABEl
        Label empNumLabel = ComponentFactory.getLabel("Employee Number: ", 0, 1);
        empNum = ComponentFactory.getTextField(1,1);

        //START SALARY
        Label startSalaryLabel = ComponentFactory.getLabel("Enter Salary: ", 0, 2);
        startSalary = ComponentFactory.getTextField(1,2);

        //NI NUMBER
        Label niNumLabel = ComponentFactory.getLabel("Enter NI Number: ", 0, 3);
        niNumber = ComponentFactory.getTextField(1, 3);

        //IBAN LABEL
        Label ibanLabel = ComponentFactory.getLabel("IBAN: ", 0, 4);
        iban = ComponentFactory.getTextField(1, 4);

        //BIC
        Label bicLabel = ComponentFactory.getLabel("BIC: ", 0, 5);
        bic = ComponentFactory.getTextField(1, 5);

        //DEPARTMENT
        Label departmentLabel = ComponentFactory.getLabel("Department: ", 0, 6);
        ComboBox departmentCombo = ComponentFactory.getComboBox(1, 6, "Choose a Department");
        departmentCombo.getItems().addAll("Gov", "Evolve");

        rightPane.getChildren().addAll(empNumLabel, empNum, startSalaryLabel, startSalary, niNumLabel, niNumber,
                ibanLabel, iban, bicLabel, bic, departmentLabel, departmentCombo);

        rightPane.setAlignment(Pos.TOP_RIGHT);
        return rightPane;
    }

    /**
     * @return the Bottom Pane of the AddEmployeePane, as a GridPane
     */
    private GridPane getBottomPane() {
        GridPane bottomPane = new GridPane();

        //ADDING BUTTONS
        HBox buttonBox = getOptionsButtons();
        GridPane.setConstraints(buttonBox, 0, 6);
        bottomPane.setAlignment(Pos.CENTER);

        bottomPane.getChildren().add(buttonBox);

        return bottomPane;
    }

    /**
     * @return the 'Back' and 'Submit' Buttons as a HBox
     */
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

    /**
     * Go back to the Main Menu Screen
     */
    private void returnToMainMenu() {
        ApplicationFactory.INSTANCE.showMainMenuScene();
    }

    /**
     * Incomplete method.
     */
    private void submitInfo() {

        Employee employee = new Employee();

        if((firstName.getText() != null && !firstName.getText().isEmpty())) {
            employee.setF_name(firstName.getText());
        } else {
            firstName.setText("Enter a First Name");
        }


    }
}
