package ru.mail.kovgantatyana;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class CountStepsTestOne extends TestCase {

    @Override
    protected void setUp() throws Exception {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(7);
        new AreaSize().setNumbers(numbers);
        new DirectionOfMoving().setNumbers(numbers);
    }

    public void testCountSteps() {
        CountSteps countSteps = new CountSteps();
        Integer allSteps = countSteps.countSteps();
        Integer expected = 4;
        assertEquals(allSteps, expected);
    }

}