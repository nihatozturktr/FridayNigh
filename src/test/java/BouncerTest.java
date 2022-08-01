import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
public class BouncerTest {

    private static Customer underAgeCustomer;
    private static Customer ofAgeCustomer;
    private static Bouncer bouncer;
    @BeforeClass
    public static void makeCustomer(){
        underAgeCustomer = new Customer("Name",15,30,true);
        ofAgeCustomer = new Customer("Name",18,30,true);
        bouncer = new Bouncer("Sally",20);
    }
    @Test
    public void testAgeRestriction(){
        Assert.assertFalse(bouncer.isCustomerOldEnoughToEnter(underAgeCustomer));
        System.out.println("Good");


    //Assert.assertTrue(bouncer.isCustomerOldEnoughToEnter(ofAgeCustomer));

    }
}