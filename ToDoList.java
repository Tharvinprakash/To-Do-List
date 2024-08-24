import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number Of Tasks You Want To Create : ");
        int o = scanner.nextInt();
        String[] toDoList = new String[o];  
        boolean[] completed = new boolean[o]; 
        int count = 0;  // Number of tasks added

        while (true) {
            System.out.println("\nTo-Do List Options:");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Remove a task");
            System.out.println("4. Mark task as completed");
            System.out.println("5. View completed tasks");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (option == 1) {
                if (count < toDoList.length) {
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    toDoList[count] = task;
                    completed[count] = false; 
                    count++;
                    System.out.println("Task added.");
                } else {
                    System.out.println("To-Do list is full!");
                }
            } else if (option == 2) {
                System.out.println("\nYour Tasks:");
                for (int i = 0; i < count; i++) {
                    String status = completed[i] ? "(Completed)" : "(Pending)";
                    System.out.println((i + 1) + ". " + toDoList[i] + " " + status);
                }
            } else if (option == 3) {
                System.out.print("Enter the number of the task to remove: ");
                int taskNumber = scanner.nextInt();
                if (taskNumber > 0 && taskNumber <= count) {
                    for (int i = taskNumber - 1; i < count - 1; i++) {
                        toDoList[i] = toDoList[i + 1];
                        completed[i] = completed[i + 1];
                    }
                    toDoList[count - 1] = null;  
                    completed[count - 1] = false;
                    count--;
                    System.out.println("Task removed.");
                } else {
                    System.out.println("Invalid task number.");
                }
            } else if (option == 4) {
                System.out.print("Enter the number of the task to mark as completed: ");
                int taskNumber = scanner.nextInt();
                if (taskNumber > 0 && taskNumber <= count) {
                    completed[taskNumber - 1] = true;  
                    System.out.println("Task marked as completed.");
                } else {
                    System.out.println("Invalid task number.");
                }
            } else if (option == 5) {
                System.out.println("\nCompleted Tasks:");
                for (int i = 0; i < count; i++) {
                    if (completed[i]) {
                        System.out.println((i + 1) + ". " + toDoList[i]);
                    }
                }
            } else if (option == 6) {
                System.out.println("Exiting To-Do List. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
