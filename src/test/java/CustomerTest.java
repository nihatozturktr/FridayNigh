import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.KeyStore;

public class CustomerTest {
    private static Customer confidentCustomer;
    private static Customer unConfidentCustomer;
    private static Customer customerWithEnoughTip;
    private static Customer customerWithNotEnoughTip;

    private static Staff staffTipped;

    @BeforeClass
    public static void makTestCustomer(){

        confidentCustomer = new Customer("Name", 20,100, true);
        confidentCustomer.setBeersThatTheyDrunk(8);
        unConfidentCustomer = new Customer("Name", 30, 200, false);
        unConfidentCustomer.setBeersThatTheyDrunk(6);

        customerWithEnoughTip = new Customer("Name", 45, 200,true);
        customerWithEnoughTip.setBeersThatTheyDrunk(5);
        customerWithNotEnoughTip = new Customer("Name", 45, 5,true);
        customerWithNotEnoughTip.setBeersThatTheyDrunk(10);

        staffTipped = new Staff("Kubra");
        staffTipped.setAmountsOfTips(20);
    }





        @Test
        public  void feelingConfident(){
            Assert.assertTrue(confidentCustomer.feelingConfident());
            Assert.assertFalse(unConfidentCustomer.feelingConfident());
    }

        @Test
        public void tipTheCuteStaff(){
            customerWithEnoughTip.tipTheCuteStaff(staffTipped);

            Assert.assertEquals(27.5, staffTipped.getAmountsOfTips(),0.01);

            customerWithNotEnoughTip.tipTheCuteStaff(staffTipped);
            Assert.assertEquals(32.5, staffTipped.getAmountsOfTips(),0.01);


        }
}
