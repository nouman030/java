import java.util.LinkedList;
import java.util.Scanner;

public class q14_79{
    public static void main(String[] args) {
        LinkedList<String> elements = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

       

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            String element = scanner.nextLine();
            elements.add(element);
        }

        while (true) {
            System.out.println("1. Update ");
            System.out.println("2. Delete ");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the new element:");
                    String n = scanner.next();

                    System.out.println("Enter the position to update:");
                    int position = scanner.nextInt();

                    
                        elements.set(position - 1,n);
                        System.out.println("Element updated successfully.");
                    break;

                case 2:
                    System.out.println("Enter the position to delete:");
                    int deletePosition = scanner.nextInt();


                        elements.remove(deletePosition - 1);
                        System.out.println("Element deleted successfully.");
                    break;

                case 3:
                    System.out.println("Linked list: " + elements);
                    break;

                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
