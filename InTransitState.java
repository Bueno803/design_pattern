
public class InTransitState extends State {
    
    private int days;

    public InTransitState(Package pkg, int quantity) {
        days = 5;
        this.pkg = pkg;
        this.quantity = quantity;
    }

    public String getStatus() {
        return "The " + pkg.getName() + " " + getVerb("is", "are") + " out for delivery\n";

    }

    public String getETA() {
        return "The " + pkg.getName() + " should arrive within " + days + " business days";
    }

    public String delay() {
        days += 2;
        return "The " + pkg.getName() + " experienced a slight delay in manufacturing.\n" + getETA();
    }
}
