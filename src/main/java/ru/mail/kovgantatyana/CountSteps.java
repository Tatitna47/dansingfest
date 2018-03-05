package ru.mail.kovgantatyana;

import java.util.List;

public class CountSteps {
    private List<Integer> stepsInArea = new StepsInArea().findSteps();

    public Integer countSteps() {
        int allSteps = 0;
        int returnStep = 0;
        if (stepsInArea.get(0) < 0) {
            return -1;
        }
        for (Integer step : stepsInArea) {
            returnStep += step;
        }
        stepsInArea.add(returnStep);
        for (Integer step : stepsInArea) {
            if (step < 0) {
                step = -step;
            }
            allSteps += step;
        }
        return allSteps;
    }
}
