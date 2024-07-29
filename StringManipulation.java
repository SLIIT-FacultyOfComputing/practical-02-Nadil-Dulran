import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 01: Input and String Manipulation
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(" ").append(middleName).append(" ").append(lastName).append(" ");
        String fullName = sb.toString();
        System.out.println("Your full name is: " + fullName);

        // Part 02: Comparing Names
        System.out.print("\nEnter another full name: ");
        String secondFullName = scanner.nextLine();

        if (fullName.equalsIgnoreCase(secondFullName)) {
            System.out.println("The two names are the same.");
        } else {
            System.out.println("The two names are different.");
        }

        // Part 03: Replacing Characters
        System.out.println("\n Replacing 'a' with '@' and 'e' with '3' \n");
        String replacedName = fullName.replace('a', '@').replace('e', '3');
        System.out.println("Name after replacement: " + replacedName);

        // Part 04: Converting to Upper Case
        System.out.println("\n Converting to upper case \n");
        String upperCaseName = fullName.toUpperCase();
        System.out.println("Full name in upper case: " + upperCaseName);

        // Part 05: Splitting the Name
        System.out.println("\n Splitting the name ");
        String[] parts = fullName.split(" ");
        for (String part : parts) {
            System.out.println("\t" + part);
        }

        // Part 06: Trimming Spaces
        System.out.println("\n Trimming spaces ");
        System.out.print("Enter a string with leading and trailing spaces: ");
        String strWithSpaces = scanner.nextLine();
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed string is: " + trimmedStr);

        scanner.close();
    }
}