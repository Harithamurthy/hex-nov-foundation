import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class CourseEnrollment {
    public static void main(String[] args) {
        String[] batchSeats = new String[3];
        Queue<String> waitingQueue = new LinkedList<>();
        String[] students = {"Asha", "Ravi", "Meena", "Kiran", "Pooja"};

        for (String name : students) {
            boolean seatAssigned = false;

            for (int i = 0; i < batchSeats.length; i++) {
                if (batchSeats[i] == null) {
                    batchSeats[i] = name;
                    seatAssigned = true;
                    break;
                }
            }

            if (!seatAssigned) {
                waitingQueue.add(name);
            }

            System.out.println("Joined: " + name);
            System.out.println("Seats: " + Arrays.toString(batchSeats));
            System.out.println("Waiting: " + waitingQueue + "\n");
        }

    
        String dropStudent = "Ravi";
        System.out.println(dropStudent + " drops out");
        boolean isPresent = false;

        for (int i = 0; i < batchSeats.length; i++) {
            if (dropStudent.equals(batchSeats[i])) {
                isPresent = true;
                if (!waitingQueue.isEmpty()) {
                    batchSeats[i] = waitingQueue.poll();
                } else {
                    batchSeats[i] = null;
                }
                break;
            }
        }

        if (!isPresent) {
            System.out.println(dropStudent + "not found");
        }

        System.out.println("Seats: " + Arrays.toString(batchSeats));
        System.out.println("Waiting: " + waitingQueue);
    }
}
