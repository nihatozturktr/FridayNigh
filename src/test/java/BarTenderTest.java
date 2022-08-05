import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarTenderTest {


    @org.junit.jupiter.api.Test
    public void buyBeertest() {
        Customer customer = new Customer("Mike",25,5.00,true);
        BarTender barTender = new BarTender("Dirk", 2.5, 5);
        barTender.buyBeer(customer,2);
        Assertions.assertEquals(1,customer.getEuros());
        Assertions.assertEquals(0,customer.getBeersThatTheyDrunk());
    }



}
