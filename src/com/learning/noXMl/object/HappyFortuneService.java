package com.learning.noXMl.object;

import com.learning.noXMl.shell.FortuneService;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day - from Fortune Service ";
    }
}
