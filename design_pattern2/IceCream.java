/**
 * Parent class that holds the description of the ice cream order
 */

public abstract class IceCream {
    protected String description;

    /**
     * @return the iceream description
     */

    public String toString() {
        return description;
    }

    /**
     * 
     * @return the price of the icecream
     */
    public double getCost(){
        return 0.0;
    }
    
}
