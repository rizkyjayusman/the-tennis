package com.cygnus.tennis;

import com.cygnus.tennis.adapter.BaseScoreAdapter;
import com.cygnus.tennis.adapter.ScoreAdapterFactory;
import com.cygnus.tennis.entity.Player;

public class TennisGame1 implements TennisGame {

    private final Player playerOne;
    private final Player playerTwo;

    public TennisGame1(String playerOneName, String playerTwoName) {
        playerOne = new Player(playerOneName);
        playerTwo = new Player(playerTwoName);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            playerOne.increasePoint();
        } else if (playerName.equals("player2")) {
            playerTwo.increasePoint();
        }
    }

    public String getScore() {
        BaseScoreAdapter adapter = ScoreAdapterFactory.getAdapter(playerOne, playerTwo);
        return adapter.getScore();
    }
}