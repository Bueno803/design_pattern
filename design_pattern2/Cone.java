public class Cone extends IceCream{
    ConeType coneType;

    /**
     * Construct the cone and parses the ENUM for the description string
     * @param coneType which are the ENUMS of different cones
     */
    public Cone(ConeType coneType) {
        this.coneType = coneType;
        description = this.coneType.toString();
        description = description.toLowerCase();
        description = description.replace("_", " ");
        description = description.substring(0,1).toUpperCase() + description.substring(1);
    }

    /**
     * Document the price of each type of cone
     * @return the price of specified cone
     */
    public double getCost() {
        double result = 0.0;
        if (coneType == coneType.CHOCOLATE_DIPPED_CONE){
            result = 1.5;
        } else if(coneType == coneType.PRETZEL_CONE) {
            result = 1.8;
        } else if(coneType == coneType.SUGAR_CONE) {
            result = .75;
        } else {
            result = 1.2;
        }
        return result;
    }
    
}
