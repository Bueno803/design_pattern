public class ShopOwner implements Observer {
    Subject Watchman;

    public ShopOwner(Subject Watchman){
        this.Watchman = Watchman;
        Watchman.registerObserver(this);
    }

    public void update(int warning){
        if(warning == 1)
            System.out.println("Shop Owner: Close down shop and head home");
        else if(warning == 2)
            System.out.println("Shop Owner: Drops everything and find nearest hideout");
    }
    
}
