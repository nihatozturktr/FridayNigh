public class Customer {

    private String name;
    private int age;
    private double euros;
    private boolean hasCondom;
    private int beersThatTheyDrunk;
    private final double tippingAmount = 1.50;

    public Customer(){

    }

    public Customer(String name, int age, double euros, boolean hasCondom) {
        this.name = name;
        this.age = age;
        this.euros = euros;
        this.hasCondom = hasCondom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getEuros() {
        return euros;
    }

    public void setEuros(double euros) {
        this.euros = euros;
    }

    public boolean isHasCondom() {
        return hasCondom;
    }

    public void setHasCondom(boolean hasCondom) {
        this.hasCondom = hasCondom;
    }

    public int getBeersThatTheyDrunk() {
        return beersThatTheyDrunk;
    }

    public void setBeersThatTheyDrunk(int beersThatTheyDrunk) {
        this.beersThatTheyDrunk = beersThatTheyDrunk;
    }


    public boolean feelingConfident() {
        return this.beersThatTheyDrunk > 5 && this.hasCondom;
    }

    public double tipTheCuteStaff(Staff staff) {
        double expectedTip = (double)this.beersThatTheyDrunk * 1.5;
        if (this.euros >= expectedTip) {
            this.euros -= expectedTip;
            staff.setAmountsOfTips(staff.getAmountsOfTips() + expectedTip);
            return this.euros;
        } else {
            staff.setAmountsOfTips(staff.getAmountsOfTips() + this.euros);
            this.euros = 0.0;
            return this.euros;
        }
    }
}








