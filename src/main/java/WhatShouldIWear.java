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

        String clothing;
        // Inform user on optimal clothing based on the weather
        if (weather.equalsIgnoreCase("raining")) {
            clothing = "waterproof coat";
        }
        else if (weather.equalsIgnoreCase("sunny")) {
            clothing = "shirt and shorts";
        }
        else if (weather.equalsIgnoreCase("snowing")) {

            clothing = "winter coat";
        }
        else{
            clothing = "sweater and jeans";
        }

        String fabric;
        if (temperature < 12) {
            fabric = " thick ";
        }
        else if (temperature >=12 && temperature <=22) {
            fabric = " ";
        }
        else {
            fabric = " lightweight ";
        }

        System.out.println("Wear a" + fabric + clothing);
    }
}
