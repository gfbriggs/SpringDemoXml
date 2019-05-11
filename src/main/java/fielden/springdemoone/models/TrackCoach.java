package fielden.springdemoone.models;

import fielden.springdemoone.interfaces.Coach;
import fielden.springdemoone.services.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "The track coach says: " + fortuneService.getFortune();
    }

    public void onInit(){
        System.out.println("init");
    }

    public void onCleanup(){
        System.out.println("clean");
    }
}
