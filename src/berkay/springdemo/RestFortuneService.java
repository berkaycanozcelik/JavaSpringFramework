package berkay.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your Rest day";
    }
}
