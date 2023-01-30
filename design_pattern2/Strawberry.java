public class Strawberry extends ScoopDecorator {

    /**
     * 
     * @param icecream which is passed through the cone generation
     * @param numScoops set the number of scoops passed
     */
    public Strawberry(IceCream icecream, int numScoops){
        super(icecream, numScoops);
        flavor = "strawberry";
        flavorCost = 1.4;
        this.numScoops = numScoops;
   }
    
}
