public class Package {

    private String name;
    private int quantity;
    private State state;
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    public Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        orderedState = new OrderedState(this, quantity);
        inTransitState = new InTransitState(this, quantity);
        deliveredState = new DeliveredState(this, quantity);
    }

    public String order() {
        state = orderedState;
        return state.getStatus() + state.getETA();
    }

    public String mail() {
        state = inTransitState;
        return state.getStatus() + state.getETA();
    }
    
    public String received() {
        state = deliveredState;
        return state.getStatus();
    }

    public String delay() {
        return state.delay();
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }
}
