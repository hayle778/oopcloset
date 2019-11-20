package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Closet {

    private ArrayList<Shirt> shirt = new ArrayList<>();
    private ArrayList<Footwear> footwear  = new ArrayList<>();
    private ArrayList<Pants> pants = new ArrayList<>();
    private ArrayList<Jacket> jacket = new ArrayList<>();



    String s = "red";
    int i = 0;
   // Remote.add("red");
   //  Remote.add("Long");
      public void addShirts(){
          //create shirts
      Shirt shirt1 = new Shirt("red", "long");
      Shirt shirt2 = new Shirt("Yellow", "short");
      shirt.add(shirt1);
      shirt.add(shirt2);
      //add to arrayList
    }
      public void addFootwear(){
      Footwear footwear1 = new Footwear(42, "Lee");
       Footwear footwear2 = new Footwear(40, "lee2");
       footwear.add(footwear1);
       footwear.add(footwear2);
    }
      public void addPants(){
      Pants pants1 = new Pants("Gucci", 32);
       Pants pants2 = new Pants("Eagel", 33);
      pants.add(pants1);
      pants.add(pants2);
      }
      public void addJacket(){
      Jacket newJacket1 = new Jacket("short", "red");
      Jacket newJacket2 = new Jacket("long", "blue");
        jacket.add(newJacket1);
        jacket.add(newJacket2);

      }
    // public String getShirt(){

    //  }

    //public String getShirt2()
    //{

       public String getshirt(){
          int myRan = 0;
          Random r = new Random();
          myRan = r.nextInt(2);
        return shirt.get(myRan).toString();
      }
       public String getfootwear(){
          int myRan = 0;
          Random r = new Random();
          myRan = r.nextInt(2);
          return footwear.get(myRan).toString();
       }

    public String getpants(){
        int myRan = 0;
        Random r = new Random();
        myRan = r.nextInt(2);
        return pants.get(myRan).toString();
    }

    public String getJacket(){
        int myRan = 0;
        Random r = new Random();
        myRan = r.nextInt(2);
        return jacket.get(myRan).toString();
    }

}








