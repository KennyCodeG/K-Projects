package com.testapp.battleofcastle;

public class Heroes {

    public Heroes(String name, String type, int level,int boost) {
        this.name = name;
        this.type = type;
        this.level = level;
        Boost = boost;
    }

    private String name ="";
    private int level = 50;
    private String type;
    private int Boost;

    public int getBoost() {
        return Boost;
    }
    public void setBoost(int boost) {
        Boost = boost;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

}
