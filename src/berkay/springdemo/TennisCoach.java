package berkay.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    //Field Injection
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.name}")
    private String name;

    /*
     -> Constructor Injection
        @Autowired
        public TennisCoach(FortuneService fortuneService) {
            this.fortuneService = fortuneService;
        }

     -> Setter Injection
            @Autowired
            public void setFortuneService(FortuneService fortuneService) {
                this.fortuneService = fortuneService;
            }

      -> Method Injection
            @Autowired
            public void seeThisIsMethodInjection(FortuneService fortuneService){
                System.out.println("Inside seeThisIsMethodInjection Method");
                this.fortuneService = fortuneService;
            }
     */

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
