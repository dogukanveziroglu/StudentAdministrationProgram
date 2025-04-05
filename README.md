# 🎓 Student Administration Program

**Student Administration Program** is a Java-based desktop application designed to manage student-related operations such as user login, course registration, grade tracking, and attendance monitoring. The system offers role-based panels for students, teachers, and administrators to perform specific actions.

---

## 🚀 Features

- **User Authentication:** Login and registration system for students, teachers, and admins
- **Role-Based Access:**
  - 🎓 **Students:** View enrolled courses, grades, and attendance records
  - 👨‍🏫 **Teachers:** Create and manage courses, assign grades, and track attendance
  - 🛠️ **Admins:** Manage users and configure system settings
- **Course Management:** Course listing, enrollment, and creation functionality
- **Grade & Attendance Tracking:** Students can view; teachers can update
- **Scalable Design:** Easily extendable and modifiable code structure

---

## 🧱 Planned File Structure

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com/studentadmin/
│   │       ├── Main.java                     # Application entry point
│   │
│   │       ├── models/                       # Data models
│   │       │   ├── User.java
│   │       │   ├── Student.java
│   │       │   ├── Teacher.java
│   │       │   ├── Admin.java
│   │       │   ├── Course.java
│   │       │   └── Enrollment.java
│   │
│   │       ├── pages/                        # UI / page logic
│   │       │   ├── LoginPage.java
│   │       │   ├── RegisterPage.java
│   │       │   ├── MainMenu.java
│   │       │   ├── StudentPanel.java
│   │       │   ├── TeacherPanel.java
│   │       │   ├── AdminPanel.java
│   │       │   ├── StudentCoursesPage.java
│   │       │   ├── StudentGradesPage.java
│   │       │   ├── AttendancePage.java
│   │       │   ├── CourseManagementPage.java
│   │       │   ├── GradeEntryPage.java
│   │       │   └── UserManagementPage.java
│   │
│   │       ├── utils/                        # Helper classes
│   │       │   ├── SessionManager.java       # Manages active session
│   │       │   ├── InputHelper.java          # Input parsing and validation
│   │       │   └── DBHelper.java             # File or database interaction
│   │
│   │       └── constants/
│   │           └── Roles.java                # Enum or constants for roles
│
└── resources/                                # Configuration or data files
