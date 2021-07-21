package com.testapp.battleofcastle;

public class CatapultArmy extends Army{

    public CatapultArmy(int aTK, String type) {
        super(aTK, type);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getATK() {
        return 1;
    }

    @Override
    public String getType() {
        return "Catapult";
    }

    public CatapultArmy() {
        // TODO Auto-generated constructor stub
    }

}
