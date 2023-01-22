public class Teacher implements Observer {
    Subject Watchman;

    public Teacher(Subject Watchman){
        this.Watchman = Watchman;
        Watchman.registerObserver(this);
    }

    public void update(int warning){
        if(warning == 1)
            System.out.println("Teacher: Helps get every kid home safe");
        else if(warning == 2)
            System.out.println("Teacher: Brings all students to the underground shelter");
    }
}
