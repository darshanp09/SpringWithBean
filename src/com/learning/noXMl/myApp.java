package com.learning.noXMl;

import com.learning.noXMl.object.CricketCoach;
import com.learning.noXMl.shell.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        CricketCoach coach = context.getBean("cricketCoach",CricketCoach.class);

        System.out.println(coach.getDailyFortune());

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getEmail());

        System.out.println(coach.getTeam());

        context.close();
    }
}
