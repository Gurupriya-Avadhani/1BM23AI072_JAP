import java.util.Scanner;
class Students {
    int marks;
}
public class LAB_4b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 5;
        Students[] obj = new Students[n];
        int sum = 0;
        int highestMarks = Integer.MIN_VALUE;
        int highestIndex = -1;
        for (int i = 0; i < n; i++) {
            obj[i] = new Students();
            System.out.print("Enter marks for Student " + (i + 1) + ": ");
            obj[i].marks = scanner.nextInt();
            sum += obj[i].marks;
            if (obj[i].marks > highestMarks) {
                highestMarks = obj[i].marks;
                highestIndex = i;
            }
        }
        double average = (double) sum / n;
        System.out.println("\nStudent Marks:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": " + obj[i].marks);
        }
        System.out.println("\nSummary:");
        System.out.println("Highest Marks: " + highestMarks);
        System.out.println("Average Marks: " + average);
        scanner.close();  // Close the scanner
    }
}