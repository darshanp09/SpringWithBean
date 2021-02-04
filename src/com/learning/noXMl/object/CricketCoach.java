package com.learning.noXMl.object;

import com.learning.noXMl.shell.Coach;
import com.learning.noXMl.shell.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${foo.email}")
    public String email;

    @Value("${foo.team}")
    public String team;

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

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
