import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


class BarTenderTest {

    private static Customer customerWithMoreMoney;
    private static Customer customerWithLittleMoney;
    private static BarTender barTender;
    @BeforeClass
    public static void makeCustomer(){
        customerWithLittleMoney = new Customer("Name",15,3,true);
        customerWithMoreMoney = new Customer("Name",18,30,true);
        barTender = new BarTender("Sally",20.0,12.0);
    }

    @Test
    public void testEuroOfCustomer(){
        barTender.buyBeer(customerWithLittleMoney,12);
        Assert.assertEquals(0,customerWithLittleMoney.getBeersThatTheyDrunk());
        Assert.assertEquals(3,customerWithLittleMoney.getEuros(),0.01);

        barTender.buyBeer(customerWithMoreMoney,1);
        Assert.assertEquals(1,customerWithMoreMoney.getBeersThatTheyDrunk());
        Assert.assertEquals(10,customerWithMoreMoney.getEuros(),0.01);




    }


}
