
package edu.sdccd.cisc191;

import javafx.scene.control.Button;

/**
 * Extends the basic JavaFX Button with game functionality
 */
public class GameBoardButton extends Button {
    private int row;
    private int col;
    private boolean hasFish;
    private boolean isGuessed;

    public GameBoardButton(int row, int col, boolean hasFish)
    {
        this.row = row;
        this.col = col;
        this.hasFish = hasFish;

        // Sets the min button lengths and widths
        setMinWidth(60);
        setMinHeight(40);
        setText("?");
        setDisable(false);
    }

    public void handleClick() {
        // update text
        if(hasFish) {
            // Fish
            setText("<><");
        } else {
            // Nothing
            setText("X");
        }
        isGuessed = true;
        setDisabled(true);
    }
}