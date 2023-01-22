import java.util.ArrayList;

public class Watchman implements Subject {

    int issueWarning = 0;
    ArrayList<Observer> observers;

    public Watchman() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void issueWarning(int warning){
        this.issueWarning = warning;
        if(warning == 1)
            System.out.println("Warning:    1 trumpet was played!");
        else if(warning == 2)
            System.out.println("Warning:    2 trumpets was played!");
        notifyObservers();
    }

    @Override
    public void notifyObservers(){
        for(Observer observer : observers)
            observer.update(issueWarning);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
}
