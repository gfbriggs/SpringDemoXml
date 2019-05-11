package fielden.springdemoone;

import fielden.springdemoone.interfaces.Coach;
import fielden.springdemoone.models.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
        // Load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        System.out.println(coach.getEmail());

        System.out.println(coach.getTeam());

        context.close();
    }
}
