package fielden.springdemoone;

import fielden.springdemoone.constants.BeanAliasConstants;
import fielden.springdemoone.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach coach = context.getBean(BeanAliasConstants.MY_COACH, Coach.class);

        Coach alphaCoach = context.getBean(BeanAliasConstants.MY_COACH, Coach.class);

        boolean result = coach == alphaCoach;

        System.out.println(result);
    }
}
