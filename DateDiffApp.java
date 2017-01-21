package com.company;

// This application take two dates given by the user and finds the differences in days, months, and years.



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDiffApp {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome user!");
        System.out.println("Please enter the first date in dd-mm-yyyy format :");

        // sets the string s1 to sncr.next to read first date
        String s1 = scnr.next();

        System.out.println("Next please enter the second date in dd-mm-yyyy format :");

         // sets string s2 to scnr.etxt to ready second date
        String s2 = scnr.next();

        // sets format for, the date that will be enter by user
        SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");

        try {
            Date startDate = formatter.parse(s1); //sets the formatter to startDate

            Date endDate = formatter.parse(s2); //sets the formatter to endDate


            // values for the conversion formulas. used final because these values are know and won't change
            final int MILLIS_IN_SECOND = 1000;
            final int SECONDS_IN_MINUTE = 60;
            final int MINUTES_IN_HOUR = 60;
            final int HOURS_IN_DAY = 24;
            final int MONTHS_IN_YEAR = 12;
            final int DAYS_IN_YEAR = 365;
            long diffInMilliSec = endDate.getTime() - startDate.getTime(); //formula for difference in milliseconds between two dates
            final long MILLISECONDS_IN_YEAR = (long) MILLIS_IN_SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_YEAR;

            /* formulas to convert milliseconds to desired unit.
            I noticed the days were off a little. leap years? precision with integers?
             */
            long years = (diffInMilliSec / (MILLISECONDS_IN_YEAR));
            long months = (diffInMilliSec / (MILLIS_IN_SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * MONTHS_IN_YEAR)) % 12;
            long days = (diffInMilliSec / (MILLIS_IN_SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY)) % 365;


            // system prints the requested information
            System.out.print("The difference of the dates provided is ");
            System.out.println(years + " years " + months + " months " + days + " days.");
            System.out.println("Thanks for using me!");


        //not entirely sure about this part honestly. only new a catch or a throw was required at the end of a try
        } catch (ParseException e) {
            e.printStackTrace(); /* I believe this part is just to let you know if there's an error and that it needs
                                    to be addressed*/
        }
    }
}