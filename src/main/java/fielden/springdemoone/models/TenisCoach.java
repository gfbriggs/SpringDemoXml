package fielden.springdemoone.models;

import fielden.springdemoone.interfaces.Coach;

public class TenisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice bouncing the ball in some places";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
