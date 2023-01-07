package berkay.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String eMailAdress;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: Inside no-arg Constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: Inside setter Method");
        this.fortuneService = fortuneService;
    }

    public void seteMailAdress(String eMailAdress) {
        this.eMailAdress = eMailAdress;
    }

    public String geteMailAdress() {
        return eMailAdress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 20 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
