public class Chocolate extends ScoopDecorator {

    /**
     * 
     * @param icecream which is passed through the cone generation
     * @param numScoops set the number of scoops passed
     */
    public Chocolate(IceCream icecream, int numScoops){
        super(icecream, numScoops);
        flavor = "chocolate";
        flavorCost = 1.5;
        this.numScoops = numScoops;
   }
    
}
