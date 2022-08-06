import java.util.Scanner;

public class BarTender extends Staff{

    private double beerPrice;
    private double cocktailPrice;


    public BarTender(String name, double beerPrice, double cocktailPrice) {
        super(name);
        this.beerPrice = beerPrice;
        this.cocktailPrice = cocktailPrice;
    }

    public double getBeerPrice() {
        return beerPrice;
    }

    public void setBeerPrice(double beerPrice) {
        this.beerPrice = beerPrice;
    }

    public double getCocktailPrice() {
        return cocktailPrice;
    }

    public void setCocktailPrice(double cocktailPrice) {
        this.cocktailPrice = cocktailPrice;
    }



    public void buyBeer(Customer customer, int amount){
        //check if customer has enough money
        //and make sure that the customer drinkAmount goes up
        // and money goes down if good

        int BeersThatTheyDrunkNow = customer.getBeersThatTheyDrunk();
        double totalprice= amount*beerPrice;
        if (customer.getEuros()>totalprice) {
            BeersThatTheyDrunkNow+=amount;
            customer.setBeersThatTheyDrunk(BeersThatTheyDrunkNow);
            customer.setEuros(customer.getEuros()-totalprice);
        }else {
            System.out.println("There are not enough money");

        }

    }

    public void buyCocktail(Customer customer, int amount){
        //check if customer has enough money
        //and make sure that the customer drinkAmount goes up
        // and money goes down if good
        int buyCocktail =0;
        if (customer.getEuros()>amount){
            ++buyCocktail;
            customer.setBeersThatTheyDrunk(buyCocktail);
            --amount;
        }else
            System.out.println("There are not enough money");


        int buyCocktailNow = customer.getBeersThatTheyDrunk();
        double totalprice= amount*beerPrice;
        if (customer.getEuros()>totalprice) {
            buyCocktailNow+=amount;
            customer.setBeersThatTheyDrunk(buyCocktailNow);
            customer.setEuros(customer.getEuros()-totalprice);
        }else {
            System.out.println("There are not enough money");

        }

        }


    }




