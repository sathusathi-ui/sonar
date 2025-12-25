import java.util.*;

public class student1 {
    public static void main(String[] args) {

        // Sample data (like from a small database)
        Map<String, int[]> students = new LinkedHashMap<>();
        students.put("Archana", new int[]{90, 85, 88});
        students.put("Baskar", new int[]{70, 68, 72});
        students.put("Ch", new int[]{50, 45, 60});

        System.out.println("=== Student Performance Report ===");

        for (Map.Entry<String, int[]> entry : students.entrySet()) {
            String name = entry.getKey();
            int[] marks = entry.getValue();

            double avg = Arrays.stream(marks).average().orElse(0);
            String category;

            if (avg >= 85)
                category = "Excellent";
            else if (avg >= 60)
                category = "Average";
            else
                category = "Poor";

            System.out.printf("%s → Average: %.2f → %s%n", name, avg, category);
        }

        System.out.println("\nReport generated successfully by Jenkins automation!");
    }
}
