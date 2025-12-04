import java.util.Scanner;

public class WeeklyGrade13 {
    static String[] students = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    static String[] weeks = {"Week 1", "Week 2", "Week 3", "Week 4", "Week 5", "Week 6", "Week 7"};

    static void inputGrades(int[][] grades) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < grades.length; i++) {
            System.out.println("\nInput grades for " + students[i] + ":");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print("  " + weeks[j] + ": ");
                grades[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    static void display(int [][] grades) {
        System.out.printf("%-10s", "Name");
        for (int i = 0; i < weeks.length; i++) {
        System.out.printf("%-8s", weeks[i]);
        }
        System.out.println();

        for (int i = 0; i < grades.length; i++) {
        System.out.printf("%-10s", students[i]);
        for (int j = 0; j < grades[i].length; j++) {
            System.out.printf("%-8d", grades[i][j]);
            }
        System.out.println();
        }
    }

    static void findWeekHighest(int[][] grades) {
        int maxWeek = 0;
        int maxTotal = 0;

        for (int w = 0; w < 7; w++) {
            int total = 0;
            for (int s = 0; s < 5; s++) {
                total += grades[s][w];
            }
            if (total > maxTotal) {
                maxTotal = total;
                maxWeek = w;
            }
        }

        System.out.println("Highest grade total is in " + weeks[maxWeek] + " with total = " + maxTotal);
    }

    static void findTopStudent(int[][] grades) {
        int bestStudent = 0;
        int bestTotal = 0;

        for (int s = 0; s < 5; s++) {
            int total = 0;
            for (int w = 0; w < 7; w++) {
                total += grades[s][w];
            }
            if (total > bestTotal) {
                bestTotal = total;
                bestStudent = s;
            }
        }

        System.out.println("Top Student: " + students[bestStudent]);
        System.out.println("Total Grade: " + bestTotal);
        System.out.println("Grade per week:");
        
        for (int w = 0; w < 7; w++) {
            System.out.println("  " + weeks[w] + ": " + grades[bestStudent][w]);
        }
    }

    public static void main(String[] args) {
        int[][] grades = new int[5][7];  

        inputGrades(grades);

        System.out.println("\n=== All Students Grades ===");
        display(grades);

        System.out.println("\n=== Week with Highest Total Grade ===");
        findWeekHighest(grades);

        System.out.println("\n=== Student with Highest Total Grade ===");
        findTopStudent(grades);
    }
}
