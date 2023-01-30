/**
 * A scoop of ice cream
 * @author Abdullah Bueno
 * 
 */

public class ScoopDecorator extends IceCream {
    protected IceCream iceCream;
    protected int numScoops;
    protected String flavor;
    protected double flavorCost;

    public ScoopDecorator(IceCream iceCream, int numScoops) {
        this.iceCream = iceCream;
        this.numScoops = numScoops;
    }

    /**
     * Generates a string describing the amount of scoops and flavor of icecream
     * @return the string concatenation of scoops and flavor
     */
    public String toString() {
        String result = "";
        if(numScoops == 1) {
            result = ", a scoop of " + flavor + " ice cream";
        } else {
            result = ", " + numScoops + " scoops of " + flavor + " ice cream";
        }
        
        return iceCream + result;
    }

    /**
     * @return the calculation of icecream by scoop and adds the price of cone/bowl
     */
    public double getCost() {
        return (flavorCost*numScoops) + iceCream.getCost();
    }
    
    
}
