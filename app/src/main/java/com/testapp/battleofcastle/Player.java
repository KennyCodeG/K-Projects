package com.testapp.battleofcastle;

public class Player {

    public Player(String player, String name, Castle castle, int heroes, int armies) {
        super();
        this.player = player;
        this.name = name;
        this.castle = castle;
        this.heroes = heroes;
        this.armies = armies;
    }

    private String player;
    private String name;
    private Castle castle;
    private int heroes;
    private int armies;

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Castle getCastle() {
        return castle;
    }

    public void setCastle(Castle castle) {
        this.castle = castle;
    }

    public int getHeroes() {
        return heroes;
    }

    public void setHeroes(int heroes) {
        this.heroes = heroes;
    }

    public int getArmies() {
        return armies;
    }

    public void setArmies(int armies) {
        this.armies = armies;
    }

    public Player() {
        // TODO Auto-generated constructor stub
    }

}