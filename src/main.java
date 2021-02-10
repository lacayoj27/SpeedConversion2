public class main {

    public static void main(String[] args) {



    }


}

class SpeedConverter {

//    Write a method called toMilesPerHour that has 1 parameter of type double
//    with the name kilometersPerHour. The method needs to return the rounded value
//    of the calculation type  long
//
//    If the parameter kilometersPerHour is < 0, the the method toMilesPerHour needs to return -1
//    to indicate an invalid value.
//    Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.


    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour >= 0) {

            return Math.round(kilometersPerHour / 1.609);


        } else {

            return -1;
        }


    }

    /*Write another method called printConversion with one parameter of type double called
    KilometersPerHour. This method should not return anything and it needs to calculate
    milesPerHour from the kilometersPerHour parameter.

    Then it needs to print out a message  in the format "XX km/h = YY mi/h"
    XX represents the original value kilometersPerHour
    YY represents the rounded milesPerHour from the kilometersPerHour parameter

    If the parameter kilometerPerHour is < 0 then print text "Invalid value"
     */


    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour >= 0) {

            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h");


        } else {

            System.out.println("Invalid value");

        }


    }


}
