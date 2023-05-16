package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean nonVeg ;
    private static int vegBasePrice = 300 ;
    private static int nonVegBasePrice = 400 ;
    private static int myBasePrice = 0 ;
    private static int cheesePrice = 80 ;
    private static  int vegToppingPrice = 70 ;
    private static int nonvegToppingPrice = 120 ;
    private static int takeawayPrice = 20 ;
    private static int myToppingPrice = 0 ;
    private Boolean isCheeseAdded ;
    private Boolean isExtraToppingsAdded ;
    private Boolean isTakeawayAdded ;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.myBasePrice = isVeg ? vegBasePrice : nonVegBasePrice ;
        this.price += this.myBasePrice ;
      this.bill = "" ;
        this.isCheeseAdded = false ;
        this.isExtraToppingsAdded = false ;
        this.isTakeawayAdded = false ;
    }

    public int getPrice(){
        if (isCheeseAdded){
            this.price += cheesePrice ;
        }
        if (isExtraToppingsAdded){
            this.myToppingPrice += isVeg ? vegToppingPrice : nonvegToppingPrice ;
            this.price += this.myToppingPrice ;
          }
        if(isTakeawayAdded){
            this.price += takeawayPrice ;
        }

        return this.price;

    }

    public void addExtraCheese(){
        // your code goes here
        if (!isCheeseAdded){

            this.isCheeseAdded = true  ;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!isExtraToppingsAdded){

            this.isExtraToppingsAdded = true ;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeawayAdded){

            this.isTakeawayAdded = true ;
        }
    }

    public String getBill(){
        // your code goes here
//        Veg pizza base price = 300
//        Non-veg pizza base price = 400
//        Extra Cheese Price = 80
//        Extra Toppings For Veg Pizza = 70
//        Extra Toppings For Non-veg Pizza = 120
//        Paper bag Price = 20
//        Base Price Of The Pizza: 300
//        Extra Cheese Added: 80
//        Extra Toppings Added: 70
//        Paperbag Added: 20
//        Total Price: 470
        String bill =  "Base Price Of The Pizza: " + this.myBasePrice + "\n";
        if (isCheeseAdded){
            bill += "Extra Cheese Price: " + cheesePrice + "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings Added: " + myToppingPrice + "\n" ;
        }
        if(isTakeawayAdded){
            bill += "Paperbag Added: " + takeawayPrice + "\n" ;
        }
        bill += "Total Price: " + this.price +"\n";
        return this.bill;
    }
}
