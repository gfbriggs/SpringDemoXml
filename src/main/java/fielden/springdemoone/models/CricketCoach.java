package fielden.springdemoone.models;

import fielden.springdemoone.interfaces.Coach;
import fielden.springdemoone.services.FortuneService;

public class CricketCoach implements Coach {

    private String email;

    private String team;

    private FortuneService fortuneService;

    public CricketCoach() {
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
