public class Vanilla extends ScoopDecorator {

    /**
     * 
     * @param icecream which is passed through the cone generation
     * @param numScoops set the number of scoops passed
     */
    public Vanilla(IceCream icecream, int numScoops){
        super(icecream, numScoops);
         flavor = "vanilla";
         flavorCost = 1.25;
         this.numScoops = numScoops;
    }
    
}
