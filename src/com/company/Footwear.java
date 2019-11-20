package com.company;

public class Footwear {
    private int size;
    private String style;

   public Footwear(){}
    public Footwear(int size, String style) {
        this.size = size;
        this.style = style;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }




        @Override
    public String toString() {
        return "Footwear{" +
                "size=" + size +
                ", style='" + style + '\'' +
                '}';
    }
}
