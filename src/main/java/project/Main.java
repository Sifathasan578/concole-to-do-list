package project;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Task> st = new LinkedHashSet<>(); // doesn't support index access!
        Map<Long, Task> idContain = new HashMap<>();

        int id = 1;

        while(true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            if(input.charAt(0) == 'a') { // Adding
                System.out.print("Message: " );
                String message = scanner.nextLine();

                System.out.print("Date: ");
                String date = scanner.nextLine();

                Task task = new Task(id++, message, date);

                TaskManager.addition(st, task, idContain);
                TaskManager.showingTasks(st);
            }
            else if(input.charAt(0) == 'v') { // Viewing
                String value = input.substring(1);

                if(value.contains("/")) { // Date
                    TaskManager.showingTasksRelatedDate(st, value);
                }
                else { // ID showing
                    long valueId = Long.parseLong(value);
                    Task t = idContain.get(valueId);

                    TaskManager.showSingleTask(t);
                }
                System.out.println();
            }
            else if(input.charAt(0) == 'd') { // Deleting
                String removeId = input.substring(1);
                long removeIdLong = Long.parseLong(removeId);

                TaskManager.removing(st, removeIdLong);
                TaskManager.showingTasks(st);
            }
        }
    }
}
