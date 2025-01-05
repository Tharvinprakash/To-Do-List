# To-Do List Application

This is a simple console-based To-Do List application built using Java. It allows users to manage their tasks efficiently by adding, viewing, marking as completed, and removing tasks.

---

## 🛠️ Features
1. **Add Tasks**: Users can add tasks to their to-do list.
2. **View Tasks**: Displays all tasks along with their completion status (Pending/Completed).
3. **Remove Tasks**: Allows users to delete tasks from the list.
4. **Mark Tasks as Completed**: Users can mark tasks as completed.
5. **View Completed Tasks**: Displays a list of tasks that have been marked as completed.
6. **Exit**: Exits the application gracefully.

---

🚀 How to Run

Compile the Code:
javac ToDoList.java

Run the Application:
java ToDoList

---

🎯 How to Use

Upon running, the program prompts you to specify the number of tasks you want to create.
Choose from the following options:
1. Add a Task: Add a new task to your to-do list.
2. View Tasks: View all tasks with their statuses.
3. Remove a Task: Remove a specific task by entering its task number.
4. Mark Task as Completed: Mark a task as completed by specifying its task number.
5. View Completed Tasks: View only the tasks that have been marked as completed.
6. Exit: Exit the application.
The program runs in a loop until the exit option is selected.

🛠️ Implementation Details

Data Structures:
An array of strings (toDoList) stores the tasks.
A boolean array (completed) tracks the completion status of tasks.

Dynamic Options:
Tasks can be dynamically added, removed, and updated based on user input.

Error Handling:
Ensures valid task numbers are provided for operations like removing or marking tasks as completed.
