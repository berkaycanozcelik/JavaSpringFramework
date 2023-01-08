package berkay.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5k daily";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //added an init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    //added an destro method
    public void doMyCleanupStuff(){
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }
}
