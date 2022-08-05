public class ToiletMan extends Staff {

    private int toiletPaperStock;


    public ToiletMan(String name, int toiletPaperStock) {
        super(name);
        this.toiletPaperStock = toiletPaperStock;
    }

    public int getToiletPaperStock() {
        return toiletPaperStock;
    }

    public void setToiletPaperStock(int toiletPaperStock) {
        this.toiletPaperStock = toiletPaperStock;
    }



    void fillToiletStallsWithToiletPaper(int amountOfStalls) throws Exception{
        toiletPaperStock -= amountOfStalls;
        if (toiletPaperStock < 0){
            throw new Exception("Toiletpaper is out of stock");
        }
        //remove the amount of your stock
        //this method will throw a selfmade Exception if you're
        //out of toilet paper
    }

    public void promoteSafeFun(Customer customer){
        if(!customer.isHasCondom() && customer.getBeersThatTheyDrunk() < 3){
            customer.setHasCondom(true);
        }
        //check if he has no condom
        //AND if he had less than 3 drinks
        //give them a condom
    }
}
