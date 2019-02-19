package com.pluralsight.testing.m2;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class LeapYearTest {
    // a year is a leap year if it is divisible by four
    // but, years divisible by 100 are not leap years.
    // except years divisible by 400

    @Test
    public void leapYearsAreDivisibleByFour(){

        assertTrue(LeapYear.isLeapYear(2016));

    }

    @Test
    public void normalYearsAreNotDivisibleByFour(){

        assertFalse(LeapYear.isLeapYear(3));

    }

    @Test
    public void leapYearsAreNotDivisibleByOneHundred(){

        assertFalse(LeapYear.isLeapYear(1900));
    }

    @Test
    public void leapYearsAreDivisibleByFourHundred(){

        assertTrue(LeapYear.isLeapYear(2000));
    }



}