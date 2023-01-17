package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCalculatorTest {
    @Test
    public void test2004isLeapYear(){
        LeapYearCalculator LeapYear = new LeapYearCalculator();
        boolean result = LeapYear.isLeapYear(2004);
    }
}
