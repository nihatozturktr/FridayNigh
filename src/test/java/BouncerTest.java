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
        Assert.assertFalse(bouncer.isCustomerOldEnoughToEnter(underAgeCustomer, underAgeCustomer.getAge()));
        System.out.println("Under age is good coz we give age  15 give false ");
        Assert.assertTrue(bouncer.isCustomerOldEnoughToEnter(ofAgeCustomer));
        System.out.println("Out of Age good cow we give age 18 ");
    }
    @Test
    public  void testBrid(){
        Assert.assertTrue(bouncer.isCustomerOldEnoughToEnter(ofAgeCustomer,23));
        Assert.assertFalse(bouncer.isCustomerOldEnoughToEnter(underAgeCustomer,17));
    }
}