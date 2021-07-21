package com.testapp.battleofcastle;

public class Castle{

    private String type = "";
    private double skillboost;

    public double getSkillboost() {
        return skillboost;
    }

    public void setSkillboost(double skillboost) {
        this.skillboost = skillboost;
    }

    public Castle(String type, double skillboost) {
        this.type = type;
        this.skillboost = skillboost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Castle() {
        // TODO Auto-generated constructor stub
    }

    public Castle battleTo(Castle player2) {
        return null;
    }


}
