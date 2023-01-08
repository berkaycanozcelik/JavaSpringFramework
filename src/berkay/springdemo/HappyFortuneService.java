package berkay.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

@Component
public class HappyFortuneService implements FortuneService{

    @Value("${foo.fortunes}")
    private String[] fortunes;

    @Override
    public String getFortune() {
        return fortunes[(int) (Math.random() * (fortunes.length - 1))];
    }
}
