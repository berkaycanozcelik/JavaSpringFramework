package berkay.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("berkay.springdemo")
public class SportConfig {

    @Bean
    public FortuneService sadfortuneService(){
        return new BadFortuneService();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadfortuneService());
    }
}
