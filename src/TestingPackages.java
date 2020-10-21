/*
Maria Suarez
Testing packages and Classes
String is an array of characters
Array: is a collection like a post Office boxes
|a|b|t|g| | |
 0 1 2 3 4 5
 Array[1] --> b
Oct 5th/2020
 */

import java.text.DecimalFormat;//specific import
import java.util.*; // import all the classes of the package

public class TestingPackages {
    public static int TOTAL_STAIRS;
    public static void main(String[] args) {
//        String s1 = new String("Hello ");
//        String s2 = "there"; // String does not required "new" to create object
//        String s3 = s1 + s2; // "+" means concatenation
//        System.out.println(s3);
//        s3 +="!";
//        System.out.println(s3);
//        int len = s3.length();
//        System.out.println("the len = " + len);
//        int indexNum = s3.indexOf(' ');
//        System.out.println(indexNum);
//        String lastWord= s3.substring(indexNum+1);
//        System.out.println(lastWord); // from the number to the end
//        lastWord=s3.substring(indexNum+1, len-1);//beginning is included, the end is excluded
//        System.out.println(lastWord);
//        String formalName= "Suarez, Maria";
//        int indexOfComa= formalName.indexOf(',');
//        String lastName = formalName.substring(0, indexOfComa);
//        String firstName = formalName.substring(indexOfComa+2);
//        System.out.println("My name is "+ firstName+" "+lastName);
        Scanner input = new Scanner(System.in);
//        System.out.print(" PLease enter your name:");
//        String name = input.next();    // This one takes only one word
//        System.out.println(name);
//        name=input.next();
//        System.out.print(" PLease enter your name:");
//        String name = input.nextLine();    // This one will take anything until you press returnSystem.out.println(name);
//        System.out.println(name);
//        System.out.println("How many lines do you want to play ");
//        TOTAL_STAIRS = input.nextInt();
//        System.out.println("Your number is "+ TOTAL_STAIRS);
//        double num4= Math.pow(3, 5);
//        System.out.println("3 to the power of 5   is = "+ num4);
        int num4= (int)(Math.random()*100);
        System.out.println("The random number is = "+ num4);
    }
}
