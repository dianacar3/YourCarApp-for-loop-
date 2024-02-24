/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author diana
 */
/************************************************************************
* Programmer: Diana Cardona
*
* Course: CSCI 1471
*
* Date: 02/15/2024
*
* Assignment: Program #3: YourCarApp
*
* Environment: Java with Netbeans IDE
*
* Files Included: YourCarApp
*
* Purpose: Write an application that will take your car from point A to point B,
* Calculate the total distance, how long it will take to get there, and check if 
* gas is needed.
*
* Input: Yes = 1, No = 0), Distance, Speed 
*
* Preconditions/Assumptions: Amounts are positive, car averages 20 miles per gallon
*
* Output: Ask user if going on a trip, Leg distance, Leg speed, total miles 
* traveled and time, whether or not gas is needed.
*
*
* Algorithm:
* Ask user if they are going on a trip( Yes = 1, No = 0).
* Prompt user for gas amount
* Prompt user for distance
* Prompt user for speed
* Calculate MPH
* Calculate gallons per mile
* Prompt user for another leg added to trip.
* If user inputs 1, loop will restart
* else user inputs 0, exits loop
* Output miles traveled in a certain amount message
* Output if gas is needed message
***********************************************************************/
package yourcarapp;

import java.util.Scanner;


public class YourCarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        double distance = 0.0;
        double speed;
        double fuel;
        double time;
        double fuelUsed;
        double remFuel = 0.0;
        
        Scanner input = new Scanner ( System.in );
        
        System.out.print("Are you going on a trip?(Yes = 1 or No = 0): ");
        int choice = input.nextInt();
        
        System.out.print("\nHow many gallons of gas is in your tank?: ");
            fuel = input.nextDouble();
            
        System.out.print("\nHow many trips are you going to make? ");
        int numOfLegs = input.nextInt();
            
        for (int leg = 1; leg <= numOfLegs; leg++)
        {   
            if (choice == 1){
            
            System.out.print("\nHow many miles are you going to travel? ");
            distance = distance + input.nextDouble();
            
            
            System.out.print("\nEnter Speed: ");
            speed = input.nextDouble();
            
            
            time = distance / speed;
            fuelUsed = distance / 20;
            remFuel = fuel - fuelUsed;
            
            
           System.out.printf("\nLeg %d: You traveled %.2f miles in about %.2f hours.\n", leg, distance, time);
    
            if (remFuel > 0)
            System.out.print("\nYou have enough fuel to return.\n");

            else
            System.out.print("\nYour car will need more fuel to return.");
            
            
        }
          System.out.printf("\nYou have %.2f gallons of fuel left in your tank.\n", remFuel);
          
         }   
         if (choice == 0){
            System.out.println("\nYou are not going on a trip.");

     }
}
}  
