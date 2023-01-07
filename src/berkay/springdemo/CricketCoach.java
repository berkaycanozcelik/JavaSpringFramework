package berkay.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: Inside no-arg Constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: Inside setter Method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 20 minutes";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
