package ru.mail.kovgantatyana;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class CountStepsTestFour extends TestCase {

    @Override
    protected void setUp() throws Exception {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(0);
        numbers.add(2);
        numbers.add(3);
        new AreaSize().setNumbers(numbers);
        new DirectionOfMoving().setNumbers(numbers);
    }

    public void testCountSteps(){
        CountSteps countSteps = new CountSteps();
        Integer allSteps = countSteps.countSteps();
        Integer expected = 12;
        assertEquals(allSteps, expected);
    }

}