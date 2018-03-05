package ru.mail.kovgantatyana;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class CountStepsTestNine extends TestCase {

    @Override
    protected void setUp() throws Exception {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        new AreaSize().setNumbers(numbers);
        new DirectionOfMoving().setNumbers(numbers);
    }

    public void testCountSteps() {
        CountSteps countSteps = new CountSteps();
        Integer allSteps = countSteps.countSteps();
        Integer expected = 12;
        assertEquals(allSteps, expected);
    }

}