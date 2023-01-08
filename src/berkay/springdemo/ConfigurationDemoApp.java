package berkay.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }

}
