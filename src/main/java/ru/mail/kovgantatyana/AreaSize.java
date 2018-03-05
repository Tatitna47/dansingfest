package ru.mail.kovgantatyana;

import java.util.ArrayList;
import java.util.List;

public class AreaSize {

    private static List<Integer> numbers = new ArrayList<Integer>();

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int findAreaSize() {
        return numbers.size();
    }
}
