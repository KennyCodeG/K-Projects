package com.testapp.battleofcastle;

public class InfantryArmy extends Army{

    public InfantryArmy(int aTK, String type) {
        super(aTK, type);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getATK() {
        return 1;
    }

    @Override
    public String getType() {
        return "Infantry";
    }

    public InfantryArmy() {
        // TODO Auto-generated constructor stub
    }

}