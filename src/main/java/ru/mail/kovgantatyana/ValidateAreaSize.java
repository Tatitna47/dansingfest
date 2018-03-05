package ru.mail.kovgantatyana;

public class ValidateAreaSize {

    private Integer areaSize = new AreaSize().findAreaSize();

    public boolean isAreaValid() {
        if (1 < areaSize || areaSize > 50) {
            return false;
        }
        return true;
    }
}