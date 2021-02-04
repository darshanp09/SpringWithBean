package com.learning.noXMl;

import com.learning.noXMl.object.CricketCoach;
import com.learning.noXMl.object.HappyFortuneService;
import com.learning.noXMl.shell.Coach;
import com.learning.noXMl.shell.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.learning.noXMl")
public class SpringConfig {

    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }

    @Bean
    public Coach cricketCoach(){
        return new CricketCoach(happyFortuneService());
    }
}
