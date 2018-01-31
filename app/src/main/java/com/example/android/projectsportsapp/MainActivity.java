package com.example.android.projectsportsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /**
     * Global variables
     */

    String[] pointsKeeperOne = {"0", "15", "30", "45", "Adv.", "Deuce", "Game"};
    String[] pointsKeeperTwo = {"0", "15", "30", "45", "Adv.", "Deuce", "Game"};

    int playerAPoint = 0;
    int playerBPoint = 0;

    int gamesPointsFirst = 0;
    int setsPointsFirst = 0;

    int gamesPointsSecond = 0;
    int setsPointsSecond = 0;

    /** ===================================================== */


    /** Player 1 */


    /**
     * Displays the given score for Player 1 in Advance.
     */
    public void displayFirstStringScore(String score) {

        TextView scoreView = (TextView) findViewById(R.id.player_1_scoreboard);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Calculates the score for Player 1 Board. (Need a listener to check when are both Adv. change to Deuce)
     */
    public void pointsCalculatorOne(View v) {

        if (playerAPoint < 4) {

            playerAPoint++;
            displayFirstStringScore(pointsKeeperOne[playerAPoint]);

        }

    }

    /**
     * Displays the given game and set points for Player 1.
     */
    public void displayGamesA(int points) {
        TextView scoreView = (TextView) findViewById(R.id.Games_First);
        scoreView.setText(String.valueOf(points));
    }

    public void displaySetsA(int points) {
        TextView scoreView = (TextView) findViewById(R.id.Sets_First);
        scoreView.setText(String.valueOf(points));
    }

    /**
     * Manage of all the plus buttons for Player 1
     */

    public void GamesPlusA(View v) {

        if (gamesPointsFirst >= 0) {
            gamesPointsFirst++;
            displayGamesA(gamesPointsFirst);
        }


    }

    public void SetsPlusA(View v) {

        if (setsPointsFirst >= 0) {
            setsPointsFirst++;
            displaySetsA(setsPointsFirst);
        }

    }


    /**
     * Manage of all the minus buttons for Player 1
     */

    public void GamesMinusA(View v) {

        if (gamesPointsFirst >= 1) {
            gamesPointsFirst--;
            displayGamesA(gamesPointsFirst);
        }

    }

    public void SetsMinusA(View v) {

        if (setsPointsFirst >= 1) {
            setsPointsFirst--;
            displaySetsA(setsPointsFirst);
        }


    }

    public void decreaseScoreboardA(View v) {

        if (playerAPoint > 0) {
            playerAPoint--;
            displayFirstStringScore(pointsKeeperOne[playerAPoint]);
        }

    }

    public void resetAll(View v) {

        playerAPoint = 0;
        playerBPoint = 0;

        gamesPointsFirst = 0;
        setsPointsFirst = 0;

        gamesPointsSecond = 0;
        setsPointsSecond = 0;

        displayFirstStringScore(pointsKeeperOne[playerAPoint]);
        displaySecondStringScore(pointsKeeperTwo[playerBPoint]);

        displayGamesA(gamesPointsFirst);
        displaySetsA(setsPointsFirst);

        displayGamesB(gamesPointsSecond);
        displaySetsB(setsPointsSecond);
    }


    /** ===================================================== */


    /** Player 2 */


    /**
     * Displays the given score for Player 2 in Advance.
     */
    public void displaySecondStringScore(String score) {

        TextView scoreView = (TextView) findViewById(R.id.player_2_scoreboard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Calculates the score for Player 2 Board.
     */
    public void pointsCalculatorTwo(View v) {

        if (playerBPoint < 4) {

            playerBPoint++;
            displaySecondStringScore(pointsKeeperTwo[playerBPoint]);

        }

    }

    /**
     * Displays the given game and set points for Player 1.
     */
    public void displayGamesB(int points) {
        TextView scoreView = (TextView) findViewById(R.id.Games_Second);
        scoreView.setText(String.valueOf(points));
    }

    public void displaySetsB(int points) {
        TextView scoreView = (TextView) findViewById(R.id.Sets_Second);
        scoreView.setText(String.valueOf(points));
    }

    /**
     * Manage of all the plus buttons for Player 1
     */

    public void GamesPlusB(View v) {

        if (gamesPointsSecond >= 0) {
            gamesPointsSecond++;
            displayGamesB(gamesPointsSecond);
        }


    }

    public void SetsPlusB(View v) {

        if (setsPointsSecond >= 0) {
            setsPointsSecond++;
            displaySetsB(setsPointsSecond);
        }

    }


    /**
     * Manage of all the minus buttons for Player 1
     */

    public void GamesMinusB(View v) {

        if (gamesPointsSecond >= 1) {
            gamesPointsSecond--;
            displayGamesB(gamesPointsSecond);
        }

    }

    public void SetsMinusB(View v) {

        if (setsPointsSecond >= 1) {
            setsPointsSecond--;
            displaySetsB(setsPointsSecond);
        }


    }

    public void decreaseScoreboardB(View v) {

        if (playerBPoint > 0) {
            playerBPoint--;
            displaySecondStringScore(pointsKeeperTwo[playerBPoint]);
        }

    }


    /** ===================================================== */


    /**
     * Code that both Players use
     */


}

/**
 * The example below shows how to register an on-click listener for a Button.
 * // Create an anonymous implementation of OnClickListener
 * private OnClickListener mCorkyListener = new OnClickListener() {
 * public void onClick(View v) {
 * // do something when the button is clicked
 * }
 * };
 * protected void onCreate(Bundle savedValues) {
 * <p>
 * // Capture our button from layout
 * Button button = (Button)findViewById(R.id.corky);
 * // Register the onClick listener with the implementation above
 * button.setOnClickListener(mCorkyListener);
 * <p>
 * }
 * <p>
 * Backup for my if on score calculation
 * =======================================
 * <p>
 * public void pointsCalculatorTwo(View v) {
 * <p>
 * if (playerBPoint < 4) {
 * <p>
 * if ((playerBPoint == 3) && (playerAPoint == 3)) {
 * playerBPoint++;
 * displaySecondStringScore(pointsKeeperTwo[playerBPoint]);
 * } else {
 * displaySecondStringScore(pointsKeeperTwo[playerBPoint]);
 * playerBPoint++;
 * }
 * }
 * }
 * <p>
 * <p>
 * <p>
 * A note on the if for the calculation of the scoreboard
 * ========================================================
 * <p>
 * String[] pointsKeeperOne = {"15","30","45","Adv.","Deuce","Game"};
 * <p>
 * public void pointsCalculatorOne(View v) {
 * <p>
 * <p>
 * if (playerAPoint < 4) {
 * //first we increment the score thenwe  check if the incremented value is equal to 3
 * if ((++playerAPoint == 3) && (playerBPoint == 3)) { //if true set both scores to deuce
 * playerAPoint++;
 * playerBPoint++;
 * displayFirstStringScore(pointsKeeperOne[playerAPoint]);
 * displayFirstStringScore(pointsKeeperTwo[playerBPoint]);
 * } else
 * if ((++playerAPoint == 3) && (playerBPoint != 3)) { //if player scores with advantage set the score to "game"
 * {
 * playerAPoint+=2;
 * displayFirstStringScore(pointsKeeperOne[playerAPoint]);
 * //here you would add finishing statements and reset the score
 * }
 * } else {// if the value is 4 then set the score to adv., change the other players score to what it should be (I set it to 2)
 * playerAPoint--;
 * playerBPoint-=2;
 * displayFirstStringScore(pointsKeeperOne[playerAPoint]);
 * displayFirstStringScore(pointsKeeperTwo[playerBPoint]);
 * }
 * <p>
 * <p>
 * <p>
 * }
 **/