package com.company;

// This application take the integer a user provieds and reverses it with a fairly simple formula

import java.util.Scanner;

public class ReversApp {

    public static void main(String[] args) {

                int x, reverse = 0; //initialized the variables

                System.out.println("Enter a number you would like reversed"); //prompts user to impute a number

                Scanner in = new Scanner(System.in); //creates a new scanner to read impute from above

                x = in.nextInt(); //reads what user imputed for x

                while (x != 0) { //while x is not equal to zero

                    reverse = reverse * 10;

                    reverse = reverse + x % 10;

                    x = x / 10;
                }

                System.out.println("The reverse of that number is " + reverse); //prints the output to the user
            }
        }


