# Task Manager (Java Console App)

A simple console-based task management application built in Java.
It allows you to:

* Add tasks with an auto-generated ID
* View all tasks
* View a task by **ID**
* View tasks by **date**
* Delete tasks by **ID**

The application internally uses:

* `LinkedHashSet<Task>` — preserves insertion order
* `HashMap<Long, Task>` — enables O(1) access by ID

---

## 🚀 Features

### ✔ Add Task

* Command starting with `a`
* Prompts for message and date
* Automatically assigns a unique ID

### ✔ View Tasks

* `v` followed by a number → view by **ID**
* `v` followed by a date (e.g., `v2025/01/01`) → view by **date**
* Shows all tasks after operations

### ✔ Delete Task

* `d<ID>` (example: `d3`)
* Removes that task from the system

---

## 📌 Example Commands

```bash
a         # add a new task
v3        # view task with ID 3
v2025/01/01  # view tasks on a specific date
d2        # delete task with ID 2
```

---

## 🧩 Project Structure

```
project/
 ├── Main.java
 ├── Task.java
 └── TaskManager.java
```

---

## 🛠 Core Classes

### **Main.java**

Handles the command loop, user input, and routing to `TaskManager`.

### **Task.java**

Simple POJO representing a task.

Fields:

* `long id`
* `String message`
* `String date`

### **TaskManager.java**

Contains static utility methods:

* `addition()` — add task
* `showingTasks()` — view all tasks
* `showSingleTask()` — view one task
* `showingTasksRelatedDate()` — tasks filtered by date
* `removing()` — delete by ID

---

## ▶ How to Run

1. Clone the repository:

```bash
git clone <your_repo_url>
```

2. Navigate into the folder:

```bash
cd project
```

3. Compile:

```bash
javac project/*.java
```

4. Run:

```bash
java project.Main
```

---

## 📝 Sample Interaction

```
Enter command: a
Message: Finish DSA homework
Date: 2025/01/01

Showing All Tasks:
Task ID: 1
Message: Finish DSA homework
Date: 2025/01/01

Enter command: v1
Task ID: 1
Message: Finish DSA homework
Date: 2025/01/01

Enter command: d1
Showing All Tasks:
# Nothing to show
```

---

## ⚙ Future Improvements

* Persist tasks to a file
* Update/edit existing tasks
* Better command parser
* Support for multiple date formats
