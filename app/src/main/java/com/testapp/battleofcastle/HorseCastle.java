package com.testapp.battleofcastle;

public class HorseCastle extends Castle{


    public HorseCastle(String type, double skillboost) {
        super(type, skillboost);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getType() {
        return "Horse Castle";
    }

    @Override
    public double getSkillboost() {
        return 20.0;
    }

    public HorseCastle() {
        // TODO Auto-generated constructor stub
    }

}
