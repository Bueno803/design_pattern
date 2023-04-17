public abstract class State {

    public Package pkg;
    public int quantity;

    public State() {

    }

    public State(Package pkg, int quantity) {
        this.pkg = pkg;
        this.quantity = quantity;
    }

    public abstract String getStatus();

    public abstract String getETA();
    
    public abstract String delay();

    protected String getVerb(String singular, String plural) {
        if (quantity == 1) {
            return singular;
        } else {
            return plural;
        }
    }
}
