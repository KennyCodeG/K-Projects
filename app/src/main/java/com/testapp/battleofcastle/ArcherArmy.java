package com.testapp.battleofcastle;

public class ArcherArmy extends Army{

    public ArcherArmy(int aTK, String type) {
        super(aTK, type);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getATK() {
        return 1;
    }

    @Override
    public String getType() {
        return "Archer";
    }

    public ArcherArmy() {
        // TODO Auto-generated constructor stub
    }

}
