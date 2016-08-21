package gui;

import employee.Employee;
import employee.Salary;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class AddEmployeePane extends GridPane {

    private static final String INTRO_TEXT = "Enter Employee Details";
    private TextField firstName, lastName, startDate, niNumber, startSalary, iban, bic, empNum;
    private TextArea address;
    private String startingDate;

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
        Label addressLabel = ComponentFactory.getLabel("Address: ", 0, 3);
        address = new TextArea();
        address.setWrapText(true);
        address.setEditable(true);
        address.setFont(Font.font("Verdana", 20));
        address.setMaxWidth(250);
        GridPane.setConstraints(address, 1, 3);
        GridPane.setRowSpan(address, 4);
        GridPane.setMargin(address, new Insets(10, 0, 10, 0));

        leftPane.getChildren().addAll(firstNameLabel,firstName,lastNameLabel,lastName, addressLabel, address);

        leftPane.setAlignment(Pos.CENTER_LEFT);
        return leftPane;
    }

    /**
     * @return the Right Pane of the AddEmployeePane, as a GridPane
     */
    private GridPane getRightPane() {
        GridPane rightPane = new GridPane();

        //START DATE
        Label startDateLabel = ComponentFactory.getLabel("Start Date: ", 0, 1);
        startDate = ComponentFactory.getTextField(1, 1);
        startDate.setText("YYYY-MM-DD");

        //EMPLOYEE NUMBER LABEl
        Label empNumLabel = ComponentFactory.getLabel("Employee Number: ", 0, 2);
        empNum = ComponentFactory.getTextField(1, 2);

        //START SALARY
        Label startSalaryLabel = ComponentFactory.getLabel("Enter Salary: ", 0, 3);
        startSalary = ComponentFactory.getTextField(1, 3);

        //NI NUMBER
        Label niNumLabel = ComponentFactory.getLabel("Enter NI Number: ", 0, 4);
        niNumber = ComponentFactory.getTextField(1, 4);

        //IBAN LABEL
        Label ibanLabel = ComponentFactory.getLabel("IBAN: ", 0, 5);
        iban = ComponentFactory.getTextField(1, 5);

        //BIC
        Label bicLabel = ComponentFactory.getLabel("BIC: ", 0, 6);
        bic = ComponentFactory.getTextField(1, 6);

        //DEPARTMENT
        Label departmentLabel = ComponentFactory.getLabel("Department: ", 0, 7);
        ComboBox departmentCombo = ComponentFactory.getComboBox(1, 7, "Choose a Department");
        departmentCombo.getItems().addAll("Gov", "Evolve");

        rightPane.getChildren().addAll(startDateLabel, startDate, empNumLabel, empNum, startSalaryLabel, startSalary,
                niNumLabel, niNumber, ibanLabel, iban, bicLabel, bic, departmentLabel, departmentCombo);

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
            firstName.setText("Enter First Name");
        }

        if((lastName.getText() != null && !lastName.getText().isEmpty())) {
            employee.setL_name(lastName.getText());
        } else {
            lastName.setText("Enter Last Name");
        }

        if((address.getText() != null && !address.getText().isEmpty())) {
            employee.setAddress(address.getText());
        } else {
            address.setText("Enter an Address");
        }

        if((startDate.getText() != null && !startDate.getText().isEmpty())) {
            startingDate = startDate.getText();
            if((startSalary.getText() != null && !startSalary.getText().isEmpty())) {
                employee.setSalary(new Salary(Integer.parseInt(startSalary.getText()), startingDate));
            } else {
                startSalary.setText("Enter Starting Salary");
            }
        }else {
            startDate.setText("Enter YYYY-MM-DD");
        }

        if((empNum.getText() != null && !empNum.getText().isEmpty())) {
            employee.setEmp_no(Integer.parseInt(empNum.getText()));
        } else {
            empNum.setText("Enter Employee Number");
        }

        if((niNumber.getText() != null && !niNumber.getText().isEmpty())) {
            employee.setNi_no(niNumber.getText());
        } else {
            niNumber.setText("Enter NI Number");
        }

        if((iban.getText() != null && !iban.getText().isEmpty())) {
            employee.setIBAN(iban.getText());
        } else {
            iban.setText("Enter IBAN");
        }

        if((bic.getText() != null && !bic.getText().isEmpty())) {
            employee.setBIC(bic.getText());
        } else {
            bic.setText("Enter BIC");
        }

    }
}
