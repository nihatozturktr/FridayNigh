import org.junit.Assert;
import org.junit.Test;

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;


public class ToiletManTest {

    @Test
    public void fillToiletStallsWithToiletPaperTest() throws Exception {
        ToiletMan toiletman = new ToiletMan("greg", 5);
        toiletman.fillToiletStallsWithToiletPaper(1);
        Assert.assertEquals(4, toiletman.getToiletPaperStock());
        Assert.assertThrows(Exception.class, () -> {
                    toiletman.fillToiletStallsWithToiletPaper(5);
                }
        );
    }

    @Test
    public void promoteSafeFunTest(){
        Customer customer = new Customer("greg",10,1,true,false);
        customer.setBeersThatTheyDrunk(2);
        ToiletMan toiletMan = new ToiletMan("greg", 2);
        toiletMan.promoteSafeFun(customer);
        Assert.assertTrue(customer.isHasCondom());
    }
}