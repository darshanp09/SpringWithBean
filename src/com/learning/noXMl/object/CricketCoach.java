package com.learning.noXMl.object;

import com.learning.noXMl.shell.Coach;
import com.learning.noXMl.shell.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Bolling 30 minutes - from Cricket Coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
