package com.testapp.battleofcastle;

public class SteelCastle extends Castle{

    public SteelCastle(String type, double skillboost) {
        super(type, skillboost);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getType() {
        return "Steel Castle";
    }

    @Override
    public double getSkillboost() {
        return 20.0;
    }

    public SteelCastle() {
        // TODO Auto-generated constructor stub
    }

}

