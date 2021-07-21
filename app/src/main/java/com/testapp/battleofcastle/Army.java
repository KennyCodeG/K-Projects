package com.testapp.battleofcastle;

public class Army {

    private int ATK;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Army(int aTK, String type) {
        super();
        ATK = aTK;
        this.type = type;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int aTK) {
        ATK = aTK;
    }

    public Army() {
        // TODO Auto-generated constructor stub
    }

}
