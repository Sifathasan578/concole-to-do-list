# ✅ **README.md (Copy & Paste)**

```markdown
# Console To-Do List (Java)

A simple interactive **command-line To-Do application** written in Java.  
Users can **add**, **view**, and **delete** tasks using console commands.

---

## 🚀 Features

- Add a task with **auto-generated ID**
- View a task:
  - By **ID**
  - By **date** (dd/MM/yyyy)
- Delete a task by ID
- Stores tasks internally using:
  - `Set<Task>` (LinkedHashSet to maintain order)
  - `Map<Long, Task>` for fast ID lookup
- Application runs **continually** without stopping

---

## 📌 How It Works

### **Commands**
| Command | Description |
|--------|-------------|
| `a` | Add a new task (asks for message & date) |
| `v<ID>` | View task by ID → example: `v101` |
| `v<date>` | View tasks by date → example: `v14/09/2025` |
| `d<ID>` | Delete a task by ID → example: `d112` |

---

## 🧱 Project Structure

```

project/
├── Main.java
├── Task.java
└── TaskManager.java

```

---

## 📝 Code Overview

### **Task**
Represents a single task with:
- `id` (long)
- `message` (String)
- `date` (String in dd/MM/yyyy)

### **TaskManager**
Contains all logic for:
- Adding tasks
- Deleting tasks
- Viewing tasks by ID/date
- Displaying all tasks

### **Main**
Handles user input and runs the infinite command loop.

---

## ▶️ Sample Run

```

Enter command: a
Message: Scrum meeting
Date: 14/09/2025

Showing All Tasks:
Task ID: 1
Message: Scrum meeting
Date: 14/09/2025

```
```

Enter command: v1
Task ID: 1
Message: Scrum meeting
Date: 14/09/2025

```
```

Enter command: d1
Showing All Tasks:
(no tasks)

```

---

## 📸 Screenshots

Create a folder named **screenshots** in your project or repository:

```

project/
├── screenshots/
│     ├── add_task.png
│     ├── view_task.png
│     └── delete_task.png

````

Then reference them in README like this:

```markdown
## 📸 Screenshots

### Adding a Task
![Add Task](screenshots/add_task.png)

### Viewing by Date
![View by Date](screenshots/view_date.png)

### Deleting a Task
![Delete Task](screenshots/delete_task.png)
````

---

## 📥 How to Add Screenshots in GitHub

### **Method 1 — Drag & Drop into README**

1. Edit README.md on GitHub.
2. Drag your image (PNG/JPG) into the editor.
3. GitHub auto-uploads it and inserts Markdown image code.

### **Method 2 — Add images to a folder**

1. Inside IntelliJ:

   * Create folder: **screenshots/**
   * Place PNG files there
2. Commit & push
3. Use relative image paths in README:

```markdown
![Screenshot](screenshots/my_image.png)
```

---

## ✔ Requirements

* Java 17+ recommended
* IntelliJ IDEA (optional)

---

## 🧑‍💻 Author

Imrul Hasan Sifat

---

If you want, I can also create:
✅ A polished GitHub repository description
✅ A License (MIT/GPL)
✅ A better folder structure
Just tell me!
