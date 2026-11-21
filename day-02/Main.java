import java.util.*;

class Course {
    int id;
    String name;
    int fee;

    Course(int id, String name, int fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    public String toString() {
        return id + " " + name + " " + fee;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Course> courses = new ArrayList<>();

        courses.add(new Course(101, "Java", 15000));
        courses.add(new Course(102, "Python", 12000));
        courses.add(new Course(103, "React", 15000));
        courses.add(new Course(104, "SQL", 8000));
        courses.add(new Course(105, "Angular", 12000));

        
        Collections.sort(courses, Comparator.comparingInt(c -> c.fee));

        System.out.println("Fee: Low to High");
        for (Course c : courses) {
            System.out.println(c);
        }

        Collections.sort(courses, Comparator.comparingInt((Course c) -> c.fee).reversed());

        System.out.println("\nFee: High to Low");
        for (Course c : courses) {
            System.out.println(c);
        }
    Collections.sort(courses, Comparator.comparing(c -> c.name));

        System.out.println("\nName: A to Z");
        for (Course c : courses) {
            System.out.println(c);
        }
    }
}
