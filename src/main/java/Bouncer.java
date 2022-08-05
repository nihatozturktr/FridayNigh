public class Bouncer extends Staff {


    private double minimumBribe;


    public Bouncer(String name, double minimumBribe) {
        super(name);
        this.minimumBribe = minimumBribe;
    }

    public double getMinimumBribe() {
        return minimumBribe;
    }

    public void setMinimumBribe(double minimumBribe) {
        this.minimumBribe = minimumBribe;
    }



    public boolean isCustomerOldEnoughToEnter(Customer customer){

        if (customer.getAge()>=18){
            return true;
        }
        //check ID of the customer and return true if they're old enough
        return false;
    }

    public boolean isCustomerOldEnoughToEnter(Customer customer,double bribe){


       /*
       This will result in the function returning true even if the
        person is underage and has not enough money. or we can do the follwing:
        public boolean isCustomerOldEnoughToEnter(Customer customer, double bribe) {
            return customer.getAge()<18 && customer.getEuros()>=minimumBribe;
        }

        */

            if(customer.getAge()<18){
                if(customer.getEuros()>=minimumBribe){
                    return true;
                }
            return true;
        }
        //check ID of the customer. If customer is too young, they can enter
        //if they give enough money based on minimumBribe
        return false;
    }




}
