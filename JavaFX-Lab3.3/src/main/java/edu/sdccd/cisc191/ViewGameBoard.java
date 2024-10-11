package edu.sdccd.cisc191;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Presents the user with the game graphical user interface
 */
public class ViewGameBoard extends Application
{
    private ControllerGameBoard controller;
    private GameBoardLabel fishRemaining;
    private GameBoardLabel guessesRemaining;
    private GameBoardLabel message;

    public static void main(String[] args)
    {
        //Launches the app by using args.
        launch(args);
    }

    public void updateHeader() {
        //Changes the text to show number of fish and bait.
        fishRemaining.setText("Fish: " + controller.modelGameBoard.getFishRemaining());
        guessesRemaining.setText("Bait: " + controller.modelGameBoard.getGuessesRemaining());

        if(controller.fishWin()) {
            //"Fishes win!"
            message.setText("Fishes Win!");
        } else if(controller.playerWins()) {
            //"You win!"
            message.setText("Players Win!");
        } else {
            message.setText("Find the fish!");
            //"Find the fish!"
        }
    }
    @Override
    public void start(Stage stage) throws Exception {
        controller = new ControllerGameBoard();
        fishRemaining = new GameBoardLabel();
        guessesRemaining = new GameBoardLabel();
        message = new GameBoardLabel();

        // Using GridPane to display the game
        BorderPane root = new BorderPane();
        updateHeader();
        GridPane headerPane = new GridPane();
        headerPane.add(fishRemaining, 0, 0);
        headerPane.add(guessesRemaining, 2, 0);
        headerPane.add(message, 3, 0);
        root.setTop(headerPane);

        //Created second GridPane for game board buttons
        GridPane gamePane = new GridPane();

        for (int row=0; row < ModelGameBoard.DIMENSION; row++) {
            for (int col=0; col < ModelGameBoard.DIMENSION; col++) {
                GameBoardButton button = new GameBoardButton(row, col, controller.modelGameBoard.fishAt(row,col));
                int finalRow = row;
                int finalCol = col;
                //Gives each button an on click event
                button.setOnAction(e -> {
                    controller.makeGuess(finalRow, finalCol);
                    if(!controller.isGameOver()) {
                        button.handleClick();
                        updateHeader();
                    }
                });
                //add button to row container
                gamePane.add(button, col, row);
            }
        }
        //create scene, stage, set title, and show
        root.setCenter(gamePane);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Gone Fishing");
        stage.show();
    }
}