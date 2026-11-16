
import java.util.*;

public class EnrollmentUndo {
    public static void main(String[] args) {

        Stack<String> enrollment = new Stack<>();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
    
            System.out.println("1. Enroll learner");
            System.out.println("2. Undo last enrollment");
            System.out.println("3. Show last enrollment");
            System.out.println("4. Exit");

            System.out.print("Enter the choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter  name: ");
                    String name = sc.nextLine();

                    enrollment.push(name);

                    System.out.println(name + " enrolled successfully.");
                    break;

                case 2:
                    if (enrollment.isEmpty()) {
                        System.out.println("Nothing to undo.");
                    } 
                    else {
                        System.out.println("Undone: " + enrollment.pop());
                    }
                    break;
                case 3:
                    if (enrollment.isEmpty()) {
                        System.out.println("No enrollment to undo.");
                    }
                    else {
                        System.out.println("Last enrollment: " + enrollment.peek());
                    }
                    break;
                case 4:
                    System.out.println("Exit program");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}





