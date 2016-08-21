package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 * Static factory for generating items for the GUI
 */
public class ComponentFactory extends GridPane {

    private static final Font LABEL_FONT = Font.font("Verdana", 15);
    private static final Font TEXT_FIELD_FONT = Font.font("Verdana", 20);

    /**
     * @param text The button text to set
     * @param event The event that takes place when the button is pressed
     * @return a Button
     */
    public static Button getButton(String text, EventHandler<ActionEvent> event) {
        Button button = new Button(text);
        button.setOnAction(event);
        button.setMinWidth(75);
        return button;
    }

    /**
     * @param text the button text to set
     * @param group The ToggleGroup the radio button is part of
     * @return a radio button
     */
    public static RadioButton getRadioButton(String text, ToggleGroup group) {
        RadioButton button = new RadioButton(text);
        button.setToggleGroup(group);
        GridPane.setMargin(button, new Insets(10, 0, 10, 0));
        return button;
    }

    /**
     * @param path The path to the image
     * @param fitWidth The width that the final image should be
     * @return an ImageView
     */
    public static ImageView getImageView(String path, int fitWidth) {
        Image image = new Image("file:" + path);
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        imageView.setCache(true);
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(fitWidth);
        return imageView;
    }

    /**
     * @param labelText the label text to set
     * @param x co-ordinate for GridPane
     * @param y co-ordinate for GridPane
     * @return a Label
     */
    public static Label getLabel(String labelText, int x, int y) {
        Label label = new Label(labelText);
        label.setFont(LABEL_FONT);
        GridPane.setConstraints(label, x, y);GridPane.setMargin(label, new Insets(10, 0, 10, 0));
        return label;
    }

    /**
     * @param x co-ordinate for GridPane
     * @param y co-ordinate for GridPane
     * @return a TextField
     */
    public static TextField getTextField(int x, int y) {
        TextField textField = new TextField();
        textField.setFont(TEXT_FIELD_FONT);
        textField.setMaxWidth(300);
        GridPane.setConstraints(textField, x, y);
        GridPane.setMargin(textField, new Insets(10, 0, 10, 0));
        return textField;
    }

    /**
     * @param x co-ordinate for GridPane
     * @param y co-ordinate for GridPane
     * @param prompt ComboBox default text
     * @return a ComboBox
     */
    public static ComboBox getComboBox(int x, int y, String prompt) {
        ComboBox comboBox = new ComboBox();
        comboBox.setMaxWidth(300);
        comboBox.setEditable(false);
        comboBox.setPromptText(prompt);
        GridPane.setConstraints(comboBox, x, y);
        GridPane.setMargin(comboBox, new Insets(10, 0, 10, 0));
        return comboBox;
    }
}
