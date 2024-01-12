package com.radik.spring_course.lesson2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RockMusic2 implements Music {
    @Override
    public String getSong() {
        return "Numb";
    }
}
