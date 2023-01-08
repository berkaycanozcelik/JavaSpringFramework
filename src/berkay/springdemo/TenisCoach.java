package berkay.springdemo;

import org.springframework.stereotype.Component;

@Component("myCoach")
public class TenisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
