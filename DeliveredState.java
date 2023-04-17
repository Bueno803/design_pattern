public class DeliveredState extends State {
    
    public DeliveredState(Package pkg, int quantity) {
        this.pkg = pkg;
        this.quantity = quantity;
    }

    public String getStatus() {
        return "The" + pkg.getName() + " " + getVerb("is", "are") + " here for you";
    }

    public String getETA() {
        return "The " + pkg.getName() + " " + getVerb("is", "are") + " here";
    }

    public String delay() {
        return "The " + pkg.getName() + " " + getVerb("has", "have") + " already been delivered";
    }
}
