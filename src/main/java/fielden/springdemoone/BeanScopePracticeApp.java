package fielden.springdemoone;

import fielden.springdemoone.constants.BeanAliasConstants;
import fielden.springdemoone.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopePracticeApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Fetching the singleton coaches
        Coach singleCoachOne = context.getBean(BeanAliasConstants.MY_TRACK_COACH, Coach.class);
        Coach singleCoachTwo = context.getBean(BeanAliasConstants.MY_TRACK_COACH, Coach.class);

        // Fetching the prototype coaches
        Coach protoCoachOne = context.getBean(BeanAliasConstants.MY_COACH, Coach.class);
        Coach protoCoachTwo = context.getBean(BeanAliasConstants.MY_COACH, Coach.class);

        System.out.println("Two singleton coaches are the same object: " + String.valueOf(singleCoachOne == singleCoachTwo));

        System.out.println("Two prototype coaches are the same object: " + String.valueOf(protoCoachTwo == protoCoachOne));

        context.close();
    }
}
