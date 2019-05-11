package fielden.springdemoone;
import fielden.springdemoone.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyWorkout());
    }
}
