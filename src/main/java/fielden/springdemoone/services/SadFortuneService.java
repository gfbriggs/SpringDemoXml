package fielden.springdemoone.services;

import java.util.ArrayList;
import java.util.Random;

public class SadFortuneService implements FortuneService {

    private String[] fortunes;

    public void setFortunes(String[] fortunes) {
        this.fortunes = fortunes;
    }

    @Override
    public String getFortune() {
        return getRandomFortune();
    }

    private String getRandomFortune(){
        Random randomGenerator = new Random();

        int randomNumber = randomGenerator.nextInt(fortunes.length);

        return fortunes[randomNumber];
    }
}
