package lab1.cscd211methods;

import java.util.*;
import lab1.cscd211enums.*;
import lab1.cscd211classes.*;

/*
   The methods for the lab
*/
public class CSCD211Lab1Methods
{
   /*
      The convertColor method converts a string to a color. This
      method is called from various other methods.
      
      @param color String representing the color
      @return Color - The color object obtained fromt he String. If no
      color matches then an IllegalArgumentException is thrown.
      This method must convert the color generically
      
      @throws IllegalArgumentException if the String is null
   */
   public static Color convertColor(final String color)
   {
      if(color == null || color.isEmpty())
         throw new IllegalArgumentException("Bad string convertColor");
      return Color.valueOf(color.toUpperCase().trim());
   }// end convertColor
   
   /*
      The displayAll method displays all Person objects that contain a specific
      color.
      
      @param toFind representing the color to find
      @param myPeeps representing the Person array
      
      @throws IllegalArgumentException if the array is null
   */
   public static void displayAll(final Color toFind, final Person [] myPeeps)
   {
      for(Person p:myPeeps)
      {
         if(p.getColor().equals(toFind))
            System.out.println(p + "\n");
      }// end for
   }//end displayAll
   
   /*
      The fillArray method creates an array of type person. Reads the 
      information from the file, creates a person and places the person
      object into the array. The array is returned.
      
      @param fin representing the Scanner object to the file
      @param total representing the total items that will be in the array
      @return Person [] - A filled array of containing Person objects
      
      @throws IllegalArgumentException if the Scanner object is null
      @throws IllegalArgumentException if total is less than or equal to 0
   */
   public static Person [] fillArray(final Scanner fin, final int total)
   {
      String fn, ln, color;
      
      Person [] array = new Person[total];
      
      for(int x = 0; x < total; x++)
      {
         fn = fin.nextLine();
         ln = fin.nextLine();
         color = fin.nextLine();
         
         array[x] = new Person(fn, ln, convertColor(color));
      }// end for
      
      return array;
   }// end fillArray
   
   /*
      The menu method. Valid menu choices are:
      1: Print the Array to the screen
      2: Display all people that contain a certain color
      3: Sort the array by Color
      4: Sort the array by the 'natural order'
      5: Quit
      You must enusre the value entered is within range
      You must ensure the input buffer is left empty
      
      @param kb Representing the Scanner object to the keyboard
      @return int - representing the menu choice
      
      @throws IllegalArgumentException if the Scanner object is null
   */
   public static int menu(final Scanner kb)
   {
      int choice;
      
      do
      {
         System.out.println("Please choose from the following");
         System.out.println("1: Print the Array to the screen");
         System.out.println("2: Display all people that contain a certain color");
         System.out.println("3: Sort the arry by Color");
         System.out.println("4: Sort the array by the 'natural order'");
         System.out.println("5: Quit");
         System.out.print("Choose --> ");
         
         choice = Integer.parseInt(kb.nextLine());
         
         System.out.println();
      }
      while(choice < 1 || choice > 5);
      
      return choice;
   }//end menu
   
   /*
      The print array method prints the individual person to the
      screen and then a acarriage return between people.
      
      @param myPeeps representing the filled array of type Person
      
      @throws IllegalArgumentException if the array is null
   */
   public static void printArray(final Person[] myPeeps)
   {
      //foreach loop
      for(Person p:myPeeps)
      {
         System.out.println(p + "\n");
      }
   }//end printArray
   
   /*
      The readColor method reads a string from the keyboard and then converts
      it to a color by calling the private method convertColor
      
      @param kb representing the Scanner object
      @return Color - representing the Color enumerated type
      
      @throws IllegalArgumentException if the Scanner object is null
   */
   public static Color readColor(final Scanner kb)
   {
      String c = null;
      System.out.print("Please enter a color ");
      c = kb.nextLine();
      return convertColor(c);
   }//end readColor
}//end class