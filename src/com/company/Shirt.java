package com.company;

public class Shirt {
private String color;
private String sleeves;
public Shirt(){}
public Shirt(String red, String longer){

    this.color=red;
    this.sleeves=longer;
}


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSleeves() {
        return sleeves;
    }

    public void setSleeves(String sleeves) {
        this.sleeves = sleeves;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "color=" + color +
                ", sleeves=" + sleeves +
                '}';
    }

    public void add() {
    }
}
