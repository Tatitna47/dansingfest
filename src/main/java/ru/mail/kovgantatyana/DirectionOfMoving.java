package ru.mail.kovgantatyana;

import java.util.ArrayList;
import java.util.List;

public class DirectionOfMoving {
    private List<Integer>  stepsWithDirection = new ArrayList();

    private static List<Integer> numbers = new ArrayList();

    public List<Integer> findDirectionOfMoving() {
        for (Integer oneStep : numbers) {
            if (oneStep % 2 != 0) {
                oneStep = oneStep * (-1);
            }
            stepsWithDirection.add(oneStep);
        }
        return stepsWithDirection;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static void setNumbers(String stringFromUi) {
        String[] stringList = stringFromUi.split(" ");
        numbers.clear();
        for (String oneString : stringList) {
            Integer oneNumber = Integer.parseInt(oneString);
            numbers.add(oneNumber);
        }
    }
}
