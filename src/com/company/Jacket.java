package com.company;

public class Jacket {
private String sleeves2;
private String color2;

public Jacket(){}
public Jacket(String sleeves, String color){
    
this.color2 = color;
 this.sleeves2 = sleeves;
}


    public String getSleeves() {
        return sleeves2;
    }

    public void setSleeves(String sleeves) {
        this.sleeves2 = sleeves;
    }

    public String getColor() {
        return color2;
    }

    public void setColor(String color) {
        this.color2 = color;
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "sleeves2='" + sleeves2 + '\'' +
                ", color2='" + color2 + '\'' +
                '}';
    }
}
