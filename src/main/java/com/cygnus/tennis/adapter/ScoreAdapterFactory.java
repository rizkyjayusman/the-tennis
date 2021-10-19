package com.cygnus.tennis.adapter;

import com.cygnus.tennis.entity.Player;

import static com.cygnus.tennis.policy.ScorePolicy.*;

public class ScoreAdapterFactory {

    public static BaseScoreAdapter getAdapter(Player playerOne, Player playerTwo) {
        BaseScoreAdapter adapter;
        if (isDrawScore(playerOne, playerTwo)) {
            adapter = new DrawScoreAdapter(playerOne, playerTwo);
        } else if (isAdvantageScore(playerOne, playerTwo)) {
            adapter = new AdvantageScoreAdapter(playerOne, playerTwo);
        } else if (isWinScore(playerOne, playerTwo)) {
            adapter = new WinScoreAdapter(playerOne, playerTwo);
        } else if (isDefaultScore(playerOne, playerTwo)) {
            adapter = new BaseScoreAdapter(playerOne, playerTwo);
        } else {
            throw new RuntimeException("no adapter handing");
        }

        return adapter;
    }

}
