package lab1.cscd211enums;

/*
   The enumerated type Color
   
   Enumerated constant values for this lab are RED, GREEN, BLUE, PURPLE, in this order
   
   @NOTE in the enumated type valueOf and values are automatically provided by the enumerated type.
   You will NOT write valueOf or values for this enumerated type
   @Note You can't write a compareTo method for this enumerated type. It is already defined by the Enum
   class
*/
public enum Color
{
   RED, GREEN, BLUE, PURPLE;
   
   //@Override
   /*
      The toString returns the Color with only the first letter being capitalized.
      Example RED as an enumerated constant would be returned as Red
      @return The enumerated type as a string with only the first letter capitalized
      @NOTE Must be done generically, meaning not using a if/else/switch and a specific enumerated
      type constant value
   */
   // public String toString()
//    {
//       return this.toString().charAt(0) + this.name().substring(1).toLowerCase();
//    }
   
   @Override
   public String toString()
   {
      return this.name().charAt(0) + this.name().substring(1).toLowerCase();
   }
}