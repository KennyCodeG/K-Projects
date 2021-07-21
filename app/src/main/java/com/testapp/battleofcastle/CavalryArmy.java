package com.testapp.battleofcastle;

public class CavalryArmy extends Army{

    public CavalryArmy(int aTK, String type) {
        super(aTK, type);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getATK() {
        return 1;
    }

    @Override
    public String getType() {
        return "Cavalry";
    }

    public CavalryArmy() {
        // TODO Auto-generated constructor stub
    }

}