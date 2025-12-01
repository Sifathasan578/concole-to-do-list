package project;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TaskManager {
    public static void addition(Set<Task> st, Task task, Map<Long, Task> idContain) {
        st.add(task);
        idContain.put(task.getId(), task);
    }

    public static void showingTasks(Set<Task> st) {
        System.out.println("\nShowing All Tasks: ");
        for(Task t: st) {
            System.out.println("Task ID: " + t.getId());
            System.out.println("Message: " + t.getMessage());
            System.out.println("Date: " + t.getDate() + "\n");
        }
    }

    public static void showSingleTask(Task t) {
        System.out.println("\nTask ID: " + t.getId());
        System.out.println("Message: " + t.getMessage());
        System.out.println("Date: " + t.getDate() + "\n");
    }

    public static void showingTasksRelatedDate(Set<Task> st, String date) {
        for(Task t: st) {
            if(t.getDate().equals(date)) {
                System.out.println("\nTask ID: " + t.getId());
                System.out.println("Message: " + t.getMessage());
                System.out.println("Date: " + t.getDate() + "\n");
            }
        }
    }

    public static void removing(Set<Task> st, long removeIdLong) {
        for(Task t: st) {
            if(t.getId() == removeIdLong) {
                st.remove(t);
                break;
            }
        }
    }
}
