package lab1.cscd211classes;

import lab1.cscd211enums.*;

/*
   The person class. A person contains a first name, last name both Strings,
   and a Color reference to the enumerated type Color.
*/
public class Person implements Comparable<Person>
{
   /*
      The person first name
   */
   private String fn;
   
   /*
      The person last name
   */
   private String ln;
   
   /*
      The persons favorite color
   */
   private Color color;
   
   /*
      Explicit Value Constructor for Person
      
      @param fn the first name
      @param ln the last name
      @param color the color reference
      
      @throws IllegalArgumentException if any of the paramaters are null
   */
   public Person(final String fn, final String ln, final Color color)
   {
      this.fn = fn;
      this.ln = ln;
      this.color = color;
   }//end EVC
   
   /*
      compares by last name, if the last names
      are teh same then by first name. If the first names are the
      same, then by color
      @throws IllegalArgumentException if another is null
   */
   @Override
   public int compareTo(final Person another)
   {
      int res = this.ln.compareTo(another.ln);
      if(res != 0)
         return res;
         
      res = this.fn.compareTo(another.fn);
      if(res != 0)
         return res;
      
      return this.color.compareTo(another.color);
   }//end compareTo
   /*
      The getColor method
      
      @retun Color - Returns the reference to the enumerated type Color.
   */
   public Color getColor()
   {
      return this.color;
   }//end getColor
   
   /*
      The toString returns the first name space last name, color
      @return first name space last name, color
   */
   @Override
   public String toString()
   {
      return this.fn + " " + this.ln + ", " + this.color;
   }//end toString
}//end class