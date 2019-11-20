package com.company;

public class Pants {
    private String brand;
    private int size2;

    public Pants() {
    }
  public Pants(String brand, int size){
        this.brand = brand;
        this.size2 = size;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size2;
    }

    public void setSize(int size) {
        this.size2 = size;
    }

    @Override
    public String toString() {
        return "Pants{" +
                "brand='" + brand + '\'' +
                ", size=" + size2 +
                '}';
    }
}