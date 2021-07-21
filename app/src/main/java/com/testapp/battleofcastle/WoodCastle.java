package com.testapp.battleofcastle;

public class WoodCastle extends Castle{

    public WoodCastle(String type, double skillboost) {
        super(type, skillboost);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getType() {
        return "Wood Castle";
    }

    @Override
    public double getSkillboost() {
        return 20.0;
    }

    public WoodCastle() {
        // TODO Auto-generated constructor stub
    }

}

