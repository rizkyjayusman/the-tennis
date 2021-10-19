package com.cygnus.tennis.adapter;

import com.cygnus.tennis.entity.Player;

public class BaseScoreAdapter {

    private final Player playerOne;
    private final Player playerTwo;

    public BaseScoreAdapter(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public String getScore() {
        return getScore(playerOne) + "-" + getScore(playerTwo);
    }

    public String getScore(Player player) {
        String description;
        switch(player.getScore()) {
            case 0:
                description = "Love";
                break;
            case 1:
                description = "Fifteen";
                break;
            case 2:
                description = "Thirty";
                break;
            case 3:
                description = "Forty";
                break;
            default:
                throw new RuntimeException("invalid score");
        }

        return description;
    }
}
