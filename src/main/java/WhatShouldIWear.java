import java.util.Scanner;

public class WhatShouldIWear {
    public static void main(String[] args) {

        // Collect input from the user
        System.out.println("What is the weather today? Is it sunny, cloudy, raining or snowing? ");
        Scanner reader = new Scanner(System.in);
        String weather = reader.nextLine();

        // The following loops determine from the user's input what the weather is, in case their input is formatted
        // differently. Not all possible variations can be accounted for, and if the user types something like "sunsnow"
        // then the code will not take into account the snow (as it checks for snow after it finishes checking for sun).
        while (!(weather.toLowerCase().contains("rain") || weather.toLowerCase().contains("sun") ||
                weather.toLowerCase().contains("snow") || weather.toLowerCase().contains("cloud"))) {
            System.out.println("Please provide a valid input in the form of 'sunny', 'cloudy', 'raining' or 'snowing'");
            weather = reader.nextLine();
        }
        if (weather.toLowerCase().contains("rain")) {
            weather = "raining";
        }
        else if (weather.toLowerCase().contains("sun")) {
            weather = "sunny";
        }
        else if (weather.toLowerCase().contains("snow")) {
            weather = "snowing";
        }
        else {
            weather = "cloudy";
        }

        System.out.println("It is " + weather + ".");
        System.out.println("What is the average temperature in degrees Celsius? ");
        int temperature = reader.nextInt();

        String fabric;
        String extras;
        // Inform user on optimal clothing based on the weather
        if (weather.equalsIgnoreCase("raining")) {
            if (temperature < 12) {
                System.out.println("Wear a waterproof winter coat");
            }
            else if (temperature < 22) {
                System.out.println("Wear a waterproof parka");
            }
            else {
                System.out.println("Wear a waterproof bomber jacket");
            }
        }
        else if (weather.equalsIgnoreCase("sunny")) {
            if (temperature < 12) {
                System.out.println("Wear a duster coat");
            }
            else if (temperature < 22) {
                System.out.println("Wear a sweatshirt and joggers");
            }
            else {
                System.out.println("Wear a shirt and shorts");
            }
        }
        else if (weather.equalsIgnoreCase("snowing")) {
            if (temperature < 12) {
                System.out.println("Wear a heavy winter coat and snow boots");
            }
            else if (temperature < 22) {
                System.out.println("Isn't it too warm for snow? Wear a waterproof parka");
            }
            else {
                System.out.println("Isn't it too warm for snow? Wear a waterproof bomber jacket");
            }
        }
        else{
            if (temperature < 12) {
                System.out.println("Wear a quilted jacket with thermals");
            }
            else if (temperature < 22) {
                System.out.println("Wear a denim jacket");
            }
            else {
                System.out.println("Wear a lightweight windbreaker");
            }
        }
    }
}
