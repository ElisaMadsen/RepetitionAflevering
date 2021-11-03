package Exercise4;/*
Exercise 4:
Write a program that calculates how the US population are projected to be in 5 years.
Print the growth & sum

 */

public class Main {
    public static void main(String[] args) {
        //Calculate on the following assumption:
        int currentPopulation = 331002651;
        int yearsInTheFuture = 5;
        int birthPerSecond = 7;
        int deathPerSecond = 13;

        //Calculate how many seconds there are in 5 years
        int secondsInAMinute = 60;
        int minutesInAnHour = 60;
        int hoursInADay = 24;
        int daysInAYear = 365;

        int secondsIn5Years = secondsInAMinute * minutesInAnHour * hoursInADay * daysInAYear * yearsInTheFuture;

        //Calculate growth in birth and death
        int birthGrow = secondsIn5Years/birthPerSecond;     //Amount of babies born in 5 years
        int deathGrow = secondsIn5Years/deathPerSecond;     //Amount of people there dies in 5 years

        //Growth
        int growthIn5Years = birthGrow - deathGrow;
        System.out.println("The population will grow with " + growthIn5Years + " people.");

        //The sum
        int sumOfPopulationIn5Years = currentPopulation + growthIn5Years;
        System.out.println("The sum of US population in " + yearsInTheFuture + " years will then be " + sumOfPopulationIn5Years + " people.");

    }
}
