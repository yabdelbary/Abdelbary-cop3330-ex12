package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Enter the principal: ");
        Scanner sc = new Scanner(System.in);
        float principal = Float.parseFloat(sc.nextLine());
        System.out.print("Enter the rate of interest: ");
        float rate_of_interest = Float.parseFloat(sc.nextLine());
        System.out.println("Enter the number of years: ");
        float number_of_years = Float.parseFloat(sc.nextLine());
        float interest_calculation = rate_of_interest/100;
        float investment = (float)(principal*(1 + interest_calculation * number_of_years));
        System.out.printf("After %.0f Years at %.1f%%, the investment will be worth $%.0f", number_of_years, rate_of_interest, investment);
    }
}
