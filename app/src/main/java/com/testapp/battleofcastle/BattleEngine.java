package com.testapp.battleofcastle;

import android.app.Activity;
import android.widget.Toast;

public class BattleEngine implements Runnable{

    private Castle player1, player2;
    private Activity battle;
    public Castle winner;

    public BattleEngine(Activity battle, Castle player1, Castle player2) {
        this.battle = battle;
        this.player1 = player1;
        this.player2 = player2;
        this.winner = null;
    }

    @Override
    public void run() {

        if (winner.equals(player1)) {
            Toast.makeText(battle.getApplicationContext(),"Winner is " + player1.CastleType,Toast. LENGTH_SHORT ).show();
        }else {
            Toast.makeText(battle.getApplicationContext(),"Winner is " + player2.CastleType,Toast. LENGTH_SHORT ).show();

        }

    }

    public Castle getWinner() {
        //return winner castle after a match done
        return this.winner;

    }

}
