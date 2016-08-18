package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Static factory for generating items for the GUI
 *
 */
public class ComponentFactory extends GridPane {

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
}
