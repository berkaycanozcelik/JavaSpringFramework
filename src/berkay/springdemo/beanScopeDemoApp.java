package berkay.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");

        Coach theCoach = context.getBean("myCoach",Coach.class);

        Coach alphaCoach = context.getBean("myCoach",Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println("Pointing to the same object = " + result);

        System.out.println("Memory location theCoach: " + theCoach);

        System.out.println("Memory location alphaCoach: " + alphaCoach);

        Coach thePrototypeCoach = context.getBean("myPrototypeCoach",Coach.class);

        Coach alphaPrototypeCoach = context.getBean("myPrototypeCoach",Coach.class);

        boolean resultPrototype = (thePrototypeCoach == alphaPrototypeCoach);

        System.out.println("Pointing to the same object = " + resultPrototype);

        System.out.println("Memory location theCoach: " + thePrototypeCoach);

        System.out.println("Memory location alphaCoach: " + alphaPrototypeCoach);

        context.close();
    }
}
