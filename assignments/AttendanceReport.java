
import java.util.Scanner;

public class AttendanceReport {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] attendance = new int[10];
        int[] runningTotal = new int[11];

        
        System.out.println("Enter attendance for 10 days:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            attendance[i] = sc.nextInt();
        }

        
        runningTotal[0] = 0;

        for (int i = 1; i <= 10; i++) {
            runningTotal[i] = runningTotal[i - 1] + attendance[i - 1];
        }

      
        System.out.print("Enter starting day: ");
        int start = sc.nextInt();

        System.out.print("Enter ending day: ");
        int end = sc.nextInt();

        if (start >= 1 && end <= 10 && start <= end) {

            int total = runningTotal[end] - runningTotal[start - 1];

            System.out.println("Total attendance from day "
                    + start + " to day " + end + " = " + total);

        } else {
            System.out.println("Invalid range!");
        }

        
        int max = attendance[0];
        int maxDay = 1;

        for (int i = 1; i < 10; i++) {

            if (attendance[i] > max) {
                max = attendance[i];
                maxDay = i + 1;
            }
        }

        System.out.println("Highest attendance: " + max);
        System.out.println("Highest attendance is on day: " + maxDay);

        
    }
}

