package com.cc.java;

public class Cat {
 
   public String name;
   public String furColor;
   public int age;

    public String tellYourName() {
       return this.name;
    }

    public String tellYourFurColor() {
        return this.furColor;
    }

    public int tellYourAge() {
        return this.age;
    }

    public void tellYourAddress(){
        App.output("Blick von innen: " + this);
    }


    
}
