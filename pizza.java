public class pizza {

    private  int  price;
    private  Boolean veg;

    private int extraCheesePrice  = 100 ;
    private int extraToppingPrice = 150 ;
    private int bagpackPrice = 20;
    private int basePizzaPrice ;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeaway = false;



    public pizza(boolean veg){
        this.veg = veg ;
        if(this.veg){
            this.price = 250;

        }else{
            this.price = 300;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
     //   System.out.println("Extra Cheese Added ");
     isExtraCheeseAdded = true; 
     this.price += extraCheesePrice;

    }

    public void addExtraToppings(){
      //  System.out.println("Extra Toppings Added ");
      isExtraToppingsAdded = true;
      this.price += extraToppingPrice;


    }

    public void takeaway(){
      //  System.out.println("take away opted");
      isOptedForTakeaway = true;
      this.price += bagpackPrice;

    }

    public void getbill(){
        String bill = "";
        System.out.println("pizza :" + basePizzaPrice);

        if(isExtraCheeseAdded){
            bill += "Extra Toppings added : " +extraCheesePrice + "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings added : " + extraToppingPrice + "\n";
        }
        if(isOptedForTakeaway){
            bill += "Take away" + bagpackPrice + "\n";
        }

        bill += "bill : "+ this.price + "\n";
        System.out.println(bill);

        

         

    }





}