import java.util.*;

public class stringbuffer	
{
      static String insertIntoString(String s)
      {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter string to be inserted");
            String toBeInserted = sc.next();
            System.out.println("Enter index to be inserted at");
            int index = sc.nextInt();
            
            StringBuffer sb = new StringBuffer(s);
            sb.insert(index, toBeInserted);
            
            s = new String(sb);
            
            System.out.println("New string is " + s);
            return s;
      }
      
      static String modifyCharacter(String s)
      {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter new character");
            String ch = sc.next();
            System.out.println("Enter position of character to be replaced");
            int index = sc.nextInt();
            
            StringBuffer sb = new StringBuffer(s);
            sb.replace(index, index + 1, ch);
            s = new String(sb);
            
            System.out.println("New string is " + s);
            return s;
      }
      
      static String append(String s)
      {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter string to be appended");
            String ns = sc.next();

            StringBuffer sb = new StringBuffer(s);
            sb.append(ns);
            s = new String(sb);
            
            System.out.println("New string is " + s);
            return s;
      }

      public static void main(String[] args)
      {
            String s;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter string to operate on");
            s = sc.next();
            
            boolean inLoop = true;
            while(inLoop)
            {
                  System.out.println("1. Insert string in to given string");
                  System.out.println("2. Modify character at index");
                  System.out.println("3. Append string to given string");
                  System.out.println("4. Quit");
                  int choice = sc.nextInt();
                  
                  System.out.println("\n");
                  
                  switch(choice)
                  {
                        case 1: s = insertIntoString(s);
                              break;
                        case 2: s = modifyCharacter(s);
                              break;
                        case 3: s = append(s);
                              break;
                        case 4: inLoop = false;
                              break;
                        default: System.out.println("Invalid choice. Try again");
                  }
                        
                  System.out.println("\n");
            }
      }
}


