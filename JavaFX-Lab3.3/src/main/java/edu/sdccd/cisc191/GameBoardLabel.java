package edu.sdccd.cisc191;

import javafx.geometry.Insets;
import javafx.scene.control.Label;

/**
 * Extends the basic JavaFX Label with game functionality
 */
public class GameBoardLabel extends Label {
    public static Insets LABEL_PADDING = new Insets(30);

    public GameBoardLabel() {
        //set Label properties like padding
        setPadding(LABEL_PADDING);
    }
}