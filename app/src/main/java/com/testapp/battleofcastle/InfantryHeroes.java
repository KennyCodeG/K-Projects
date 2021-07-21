package com.testapp.battleofcastle;

public class InfantryHeroes extends Heroes{

    public InfantryHeroes(String name, String type, int level, int boost) {
        super(name, type, level, boost);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getBoost() {
        return 40;
    }

    @Override
    public String getType() {
        return "Infantry Heroes";
    }

    @Override
    public int getLevel() {
        return 50;
    }
}
