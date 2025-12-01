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

