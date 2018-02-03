package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int redCardsForTeamA = 0;
    int yellowCardsForTeamA = 0;
    int scoreTeamB = 0;
    int redCardsForTeamB = 0;
    int yellowCardsForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayRedCardsForTeamA(redCardsForTeamA);
        displayYellowCardsForTeamA(yellowCardsForTeamA);

        displayForTeamB(scoreTeamB);
        displayRedCardsForTeamB(redCardsForTeamB);
        displayYellowCardsForTeamB(yellowCardsForTeamB);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the red cards for Team A by 1.
     */
    public void addRedCardForTeamA(View v) {
        redCardsForTeamA = redCardsForTeamA + 1;
        displayRedCardsForTeamA(redCardsForTeamA);
    }

    /**
     * Increase the yellow cards for Team A by 1.
     */
    public void addYellowCardForTeamA(View v) {
        yellowCardsForTeamA = yellowCardsForTeamA + 1;
        displayYellowCardsForTeamA(yellowCardsForTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red cards for Team A.
     */
    public void displayRedCardsForTeamA(int redCards) {
        TextView redCardsView = (TextView) findViewById(R.id.team_a_red_cards);
        redCardsView.setText(String.valueOf(redCards));
    }

    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayYellowCardsForTeamA(int yellowCards) {
        TextView yellowCardsView = (TextView) findViewById(R.id.team_a_yellow_cards);
        yellowCardsView.setText(String.valueOf(yellowCards));
    }


    /**
     * Increase the score for Team B by 1 point.
     */
    public void addGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the red cards for Team B by 1.
     */
    public void addRedCardForTeamB(View v) {
        redCardsForTeamB = redCardsForTeamB + 1;
        displayRedCardsForTeamB(redCardsForTeamB);
    }

    /**
     * Increase the yellow cards for Team B by 1.
     */
    public void addYellowCardForTeamB(View v) {
        yellowCardsForTeamB = yellowCardsForTeamB + 1;
        displayYellowCardsForTeamB(yellowCardsForTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given red cards for Team B.
     */
    public void displayRedCardsForTeamB(int redCards) {
        TextView redCardsView = (TextView) findViewById(R.id.team_b_red_cards);
        redCardsView.setText(String.valueOf(redCards));
    }

    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayYellowCardsForTeamB(int yellowCards) {
        TextView yellowCardsView = (TextView) findViewById(R.id.team_b_yellow_cards);
        yellowCardsView.setText(String.valueOf(yellowCards));
    }

    /**
     * Reset the score for Team A and B to 0 points.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        redCardsForTeamA = 0;
        yellowCardsForTeamA = 0;
        scoreTeamB = 0;
        redCardsForTeamB = 0;
        yellowCardsForTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayRedCardsForTeamA(redCardsForTeamA);
        displayYellowCardsForTeamA(yellowCardsForTeamA);
        displayForTeamB(scoreTeamB);
        displayRedCardsForTeamB(redCardsForTeamB);
        displayYellowCardsForTeamB(yellowCardsForTeamB);
    }

}
