import java.util.Scanner;

public class StringOptionsMenu 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\nMenu:");
            System.out.println("1. Insert a string into another string at a given position");
            System.out.println("2. Modify a character at a given position");
            System.out.println("3. Append a string");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) 
            {
                case 1:
                    insertString();
                    break;
                case 2:
                    modifyCharacter();
                    break;
                case 3:
                    appendString();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public static void insertString() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the string to insert: ");
        String insertString = scanner.nextLine();
        System.out.print("Enter the position to insert: ");
        int position = scanner.nextInt();
        
        if (position < 0 || position > mainString.length()) 
        {
            System.out.println("Invalid position. Position must be within the length of the main string.");
            return;
        }
        
        String result = mainString.substring(0, position) + insertString + mainString.substring(position);
        System.out.println("Result after inserting: " + result);
    }

    public static void modifyCharacter() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the position to modify: ");
        int position = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter the new character: ");
        char newChar = scanner.nextLine().charAt(0);

        if (position < 0 || position >= inputString.length()) 
        {
            System.out.println("Invalid position. Position must be within the length of the string.");
            return;
        }

        char[] charArray = inputString.toCharArray();
        charArray[position] = newChar;
        String result = new String(charArray);
        System.out.println("Result after modification: " + result);
    }

    public static void appendString() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the string to append: ");
        String appendString = scanner.nextLine();

        String result = mainString + appendString;
        System.out.println("Result after appending: " + result);
    }
}

