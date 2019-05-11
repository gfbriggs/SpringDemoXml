package fielden.springdemoone;

import fielden.springdemoone.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDemoApp {

    public static void main(String[] args) {

        // Load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Coach coach = context.getBean("myTrackCoach", Coach.class);

        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
