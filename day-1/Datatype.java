// Geek is learning a new programming language. 
// As data type forms the most fundamental part of a language,
// Geek is learning them with focus and needs your help.
// Given a data type, help Geek in finding the size of it in byte.

// Data Type - Character, Integer, Long, Float and Double

// Example 1:

// Input: Character
// Output: 1
// Explaination: For java it would be 2 bytes.
// Example 2:

// Input: Integer
// Output: 4
import java.util.*;

class Datatype{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String : ");
    String str = sc.next();
    System.out.println(str);
    System.out.println(checkDataType(str));

  }
  static int checkDataType(String str)
  {
    String s = str.toLowerCase();
    if(s.equals("character"))
    {
        return 2;
    }
    else if(s.equals("integer")||(s.equals("float")))
    {
        return 4;
    }
    else if(s.equals("double")||(s.equals("long")))
    {
        return 8;
    }
    else{
        return -1;
    }
  }
}