package berkay.springdemo;

public class myApp {
    public static void main(String[] args) {

        //create the Object
        Coach theCoach = new TrackCoach();

        //use the Object
        System.out.println(theCoach.getDailyWorkout());

    }
}
