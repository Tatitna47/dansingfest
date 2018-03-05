package ru.mail.kovgantatyana;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepsInArea {
    private List<Integer> stepsWithDirection =new DirectionOfMoving().findDirectionOfMoving();
    private Integer areaSize = new AreaSize().findAreaSize();

    public List findSteps() {
        List<Integer> stepsInArea = new ArrayList();
        Integer oneSteps = stepsWithDirection.get(0);
        if (oneSteps > areaSize) {
            stepsInArea.add(0);
            return stepsInArea;
        }
        Integer sumSteps = oneSteps;
        long startTime = System.nanoTime();
        while (0 <= sumSteps && sumSteps < areaSize) {
            stepsInArea.add(oneSteps);
            oneSteps = stepsWithDirection.get(sumSteps);
            sumSteps += oneSteps;
            long endTime = System.nanoTime();
            long allTime = endTime - startTime;
            if (allTime > 1000000) {
                stepsInArea.clear();
                stepsInArea.add(-1);
                return stepsInArea;
            }
        }
        return stepsInArea;
    }
}