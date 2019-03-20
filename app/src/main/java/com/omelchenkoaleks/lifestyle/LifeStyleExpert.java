package com.omelchenkoaleks.lifestyle;

import java.util.ArrayList;
import java.util.List;

public class LifeStyleExpert {
    List<String> getExpertAdvice(String level) {
        List<String> levels = new ArrayList<>();
        if (level.equals("light")) {
            levels.add("Just do nothing.");
            levels.add("You can not strain.");
        } else if (level.equals("medium")) {
            levels.add("Need to make an effort.");
            levels.add("Helps training.");
        } else {
            levels.add("schedule and compliance.");
            levels.add("There are no easy ways.");
        }
        return levels;
    }
}
