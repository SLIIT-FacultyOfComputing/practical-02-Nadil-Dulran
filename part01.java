import java.util.Scanner;

public class part01{
       public static void main(String arg[]) {
             
	       Scanner mykey = new java.util.Scanner(System.in);
	      StringBuilder name = new StringBuilder();
 	      System.out.printf("Enter first name:");
              name.append(mykey.nextLine());
	      System.out.printf("Enter middle name:");
              name.append(" " + mykey.nextLine());
	      System.out.printf("Enter last name:");
	      name.append(" " + mykey.nextLine());
       
	      String fullname = name.toString();
	      System.out.println("Full name is : "+ fullname);

       }
}


