package com.testapp.battleofcastle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vector<Player> vectorplayer = new Vector<Player>();
        Vector<Heroes> vectorheroes = new Vector<Heroes>();
        Vector<Army> vectorarmy = new Vector<Army>();
        Vector<Castle> vectorcastle = new Vector<Castle>();

        vectorplayer.add(new Player("Player 1", "Kenny", new HorseCastle(), 6, 100000));
        vectorplayer.add(new Player("Player 2", "Mikha", new WoodCastle(), 6, 100000));
        vectorplayer.add(new Player("Player 3", "Anggie", new SteelCastle(), 6, 100000));
        vectorplayer.add(new Player("Player 4", "Fadil", new StoneCastle(), 6, 100000));
        vectorarmy.add(new InfantryArmy());
        vectorarmy.add(new CavalryArmy());
        vectorarmy.add(new ArcherArmy());
        vectorarmy.add(new CatapultArmy());
        vectorheroes.add(new InfantryHeroes(null, null, 0, 0));
        vectorheroes.add(new CavalryHeroes(null, null, 0, 0));
        vectorheroes.add(new ArcherHeroes(null, null, 0, 0));
        vectorheroes.add(new CatapultHeroes(null, null, 0, 0));
        vectorheroes.add(new CatapultHeroes(null, null, 0, 0));
        vectorheroes.add(new CatapultHeroes(null, null, 0, 0));
        vectorcastle.add(new HorseCastle());
        vectorcastle.add(new WoodCastle());
        vectorcastle.add(new SteelCastle());
        vectorcastle.add(new StoneCastle());

        int TotalATK = 0;
        for(int a = 0; a < vectorplayer.size(); a++){
            for( int b = 0; b < vectorarmy.size(); b++) {
                if(vectorarmy.get(b).getType().equals("Infantry")) {
                    TotalATK += (vectorplayer.get(a).getArmies()/vectorarmy.size() * vectorarmy.get(b).getATK()) + vectorheroes.get(b).getBoost();
                }else if (vectorarmy.get(b).getType().equals("Cavalry")) {
                    TotalATK += (vectorplayer.get(a).getArmies()/vectorarmy.size() * vectorarmy.get(b).getATK()) + vectorheroes.get(b).getBoost();
                }else if (vectorarmy.get(b).getType().equals("Archer")) {
                    TotalATK += (vectorplayer.get(a).getArmies()/vectorarmy.size() * vectorarmy.get(b).getATK()) + vectorheroes.get(b).getBoost();
                }else if (vectorarmy.get(b).getType().equals("Catapult")) {
                    TotalATK += (vectorplayer.get(a).getArmies()/vectorarmy.size() * vectorarmy.get(b).getATK()) + (vectorheroes.get(b).getBoost()*3);
                }
            }

        vectorplayer.get(1);
        vectorplayer.get(2);

        castleImageBattle(BattleEngine);

        final Button btn = findViewById(R.id.battlebtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BattleEngine btl = new BattleEngine();
                new Thread(btl).run();

            }
        });
    }

        private void castleImageBattle(Castle[] castles) {

        loadCastleImage(findViewById(R.id.leftTroop));
        loadCastleImage(findViewById(R.id.rightTroop));

    }

    private void loadCastleImage () {

    }
}