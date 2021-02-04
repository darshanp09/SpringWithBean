package com.learning.noXMl;

import com.learning.noXMl.shell.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Coach coach = context.getBean("cricketCoach",Coach.class);

        System.out.println(coach.getDailyFortune());

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
