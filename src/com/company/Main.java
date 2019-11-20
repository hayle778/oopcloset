package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   // Scanner input = new Scanner(System.in);

    Closet closet = new Closet();
    closet.addShirts();    //populate array
     closet.addFootwear();
     closet.addPants();
     closet.addJacket();


     //  get me a shirt
        System.out.println(closet.getshirt());
        System.out.println(closet.getfootwear());
        System.out.println(closet.getpants());
        System.out.println(closet.getJacket());






    }



}
