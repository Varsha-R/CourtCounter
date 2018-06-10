package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(10);
    }

    /**
     * Increase the score of Team A by 3 points
     */
    public void addThreeforTeamA(View v)
    {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score of Team A by 2 points
     */
    public void addTwoforTeamA(View v)
    {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score of Team A by 1 points
     */
    public void addOneforTeamA(View v)
    {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score of Team B by 3 points
     */
    public void addThreeforTeamB(View v)
    {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score of Team B by 2 points
     */
    public void addTwoforTeamB(View v)
    {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score of Team B by 1 points
     */
    public void addOneforTeamB(View v)
    {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset scores of Team A and B to 0
     */
    public void resetScores(View v)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
