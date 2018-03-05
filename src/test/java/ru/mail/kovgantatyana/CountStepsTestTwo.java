package ru.mail.kovgantatyana;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class CountStepsTestTwo extends TestCase {

    @Override
    protected void setUp() throws Exception {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(8);
        new AreaSize().setNumbers(numbers);
        new DirectionOfMoving().setNumbers(numbers);
    }

    public void testCountSteps(){
        CountSteps countSteps = new CountSteps();
        Integer allSteps = countSteps.countSteps();
        Integer expected = 0;
        assertEquals(allSteps, expected);
    }

}