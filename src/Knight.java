public class Knight implements Observer {
    Subject Watchman;

    public Knight(Subject Watchman){
        this.Watchman = Watchman;
        Watchman.registerObserver(this);
    }

    public void update(int warning){
        if(warning == 1)
            System.out.println("Knight: Helps everyone get home safe");
        else if(warning == 2)
            System.out.println("Knight: Prepares for battle");
    }
}
