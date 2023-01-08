package berkay.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifecycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecylceApplicationContext.xml");

        Coach theCoach = context.getBean("myCoach",Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
