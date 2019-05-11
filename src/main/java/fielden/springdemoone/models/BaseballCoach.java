package fielden.springdemoone.models;

import fielden.springdemoone.interfaces.Coach;
import fielden.springdemoone.services.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach() {
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "30 minutes on the batting area!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
