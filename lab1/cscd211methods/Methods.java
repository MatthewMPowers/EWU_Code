package lab1.cscd211methods;

import java.util.*;
import lab1.cscd211enums.*;
import lab1.cscd211classes.*;

/*
The method class for the lab

*/
public class CSCD211Lab1Methods
{
   /*
      The convertColor method converts a string to a color. This
      method is called from various other methods.
      
      @param color String representing the color
      @return Color - The color object obtained from the string. If no
      color matches then and IllegalArgumentException is thrown.
      This method must convert the color generically
      
      @throws IllegalArgumentException if the String is null
   */
   public static Color convertColor(final String color)
   {
      if(color == null || color.isempty())
         throw new IllegalArgumentException("Bad string convertColor");
         
      return color.valueOf(color.toUpperCase().trim());
   }//end convertColor
      /*
         The displayAll method displays all Person objects that contain a specific
         color.
      
         @param toFind Representing the color to find
         @param myPeeps Representing the Person array
      
         @throws IllegalArgumentException if the array is null
      */
      public static void displayAll(final Color toFind, final Person( [] myPeeps)
      {
         for(Person p:myPeeps)
         {
            if(p.getColor().equals(toFind))
               System.out.println(p + "\n")
         }
      }
      
      /*
         The fillArray method creates an array of type person. Reads the
         information from the file, creates a person and places the person
         object into the array. The array is returned
         
         @param finRepresenting the Scanner object to the file
         @param total Representing the total items that will be in the array
         @return Person [] - A filled array of containing Person objects
         
         @throws IllegalArgumentException if the Scanner object is null
         @throws IllgealArgumentException if total is less than or equal to 0
      */
      public static Person [] fillArray(final Scanner fin, final int total)
      {
         String fn, ln, color;
         
         Person [] array = new Person[total];
         
         for(int x = 0; x < total; x++)
         {
            fn = fin.nextline();
            ln = fin.nextline();
            color = fin.nextline();
            
            array[x] = new Person(fn, ln, convertColor(color));
         }
         
         return array;
      }
      /*
         THe menu method. Valid menu choices are:
         1: Print the Array to the screen
         2: Display all people that contains a certain color
         3: Sort the array by Color
         4: Sort the array by the 'natural order'
         5: Quit
         You must ensure the value entered is within range
         You must ensure the input buffer is left empty
         
         @param kb Representing the Scanner object to the keyboard
         @return int - Representing the menu choice
         
         @throws IllegalArgumentException if the scanner object is null
      */
      public static int menu(final Scanner kb)
      {
         int choice;
         
         do
         {
            System.out.println("Please choose from the following");
            System.out.println("1: Print the Array to the screen");
            System.out.println("2: Display all people that contains a certain color");
            System.out.println("3: Sort the array by Color");
            System.out.println("Sort the array by the 'natural order'");
            System.out.println("5: Quit");
            System.out.print("Choices are 1 - 5 --> ");
            
            choice = Integer.parseInt(kb.nextLine());
            
            System.out.println();
         }
         while(choice < 1 || choice > 5); //range of 1 - 5
         
         return choice
      }
      /*
         The print array method prints the individual person to the
         screen and then a carriage return between people.
         
         @param myPeeps Representing the filled array of type Person
         
         @throws IllegalArgumentException if the array 
      */
      public static void printArray(final Person[] myPeeps)
      {
         //foreach loop
         for(Person p:myPeeps)
         {
            System.out.println(p + "\n");
         }
      }
      
      /*
         THe readColor method reads a string from the keyboard and then converts
         it to a color by calling the private method convertColor
         
         @param kb Representing the Scanner object
         @return Color - representing the Color enumerated type
         
         @throws IllegalArgumentException if the Scanner object is null
      */
      public static Color readColor(final Scanner kb)
      {
         String c = null;
         System.out.print("Please enter a color ");
         c = kb.nextline();
         return convertColor(c);
      }
      
}