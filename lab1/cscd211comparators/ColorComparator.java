package lab1.cscd211comparators;

import java.util.Comparator;
import lab1.cscd211classes.*;

/*
   The colorComparator lab implements a Comparator and ensures the parameterized
   type Person is used for the Comparator
*/


/*

The compare method that comapres two person by the Color reference contents.
Specified by: compare in interface Comparator<Person>
Paramaters:
p1 - The first Person to be compared
p2 - The second Person to be compared
Returns:
int - A negative integer, zero, or a positive integer as the first argument is 
less than, equal to, or greater than the second
Throws:
IllegalArgumentException - if either Person 1 or Person2 are null
*/

public class ColorComparator implements Comparator<Person>
{
   public int compare(final Person p1, final Person p2)
   {
      return p1.getColor().compareTo(p2.getColor());
   }//end compare method
}//end class