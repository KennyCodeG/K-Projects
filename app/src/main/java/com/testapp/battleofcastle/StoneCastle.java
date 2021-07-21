package com.testapp.battleofcastle;

public class StoneCastle extends Castle{

    public StoneCastle(String type, double skillboost) {
        super(type, skillboost);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getType() {
        return "Stone Castle";
    }

    @Override
    public double getSkillboost() {
        return 20.0;
    }

    public StoneCastle() {
        // TODO Auto-generated constructor stub
    }

}
