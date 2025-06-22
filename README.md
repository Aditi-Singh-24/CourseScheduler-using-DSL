# CourseScheduler-using-DSL

**A Domain-Specific Language (DSL) for Automated Course Scheduling in Academic Institutions**  
Created by **Aditi Singh**

---

## 📌 Abstract

This project introduces a domain-specific language built using **Xtext** to simplify the process of course scheduling in academic institutions. It integrates with the **Google OR-Tools CP-SAT solver** to generate valid, optimized schedules based on constraints and preferences.

---

## 🎯 Motivation

Scheduling courses manually is time-consuming and error-prone. Existing tools are often either inflexible or require complex configuration. This project combines the **expressiveness of DSLs** with the **power of constraint solvers** to make scheduling easy, accurate, and extensible.

---

## 🛠️ Tech Stack

- 💻 **Language Framework**: Xtext (Eclipse-based)
- ☕ **Backend**: Java
- 📦 **Solver**: Google OR-Tools (CP-SAT)
- 🧩 **Modeling**: EMF (Eclipse Modeling Framework)
- 🧪 **IDE**: Eclipse

---

## 📐 DSL Grammar Features

The DSL allows users to define:

- 📚 **Courses**: with sessions, batch size, teachers, and preferences
- 🏫 **Rooms**: with capacities and available time slots
- ⏱️ **Time Slots**: with start-end times
- 📅 **Preferences**: for session slots and preferred weekdays
- ⚙️ **Scheduler trigger**: using `schedule auto`

### How it works?

| Step          | Description                                             |
| ------------- | ------------------------------------------------------- |
| ✍️ **Input**  | You write a DSL file like `test.mydsl`                  |
| 🧾 **Parse**  | `DSLParser` converts DSL → EMF model                    |
| 🔄 **Adapt**  | `CourseSchedulerDSLAdapter` → Java objects              |
| 🧮 **Solve**  | `CourseScheduler` (OR-Tools CP-SAT) applies constraints |
| 📤 **Output** | Final schedule is printed (course, day, slot, room)     |


### 📝 Example Input

```dsl
room "R1"
capacity 30
available [Mon 09:00-11:00, Tue 10:00-12:00]

room "R2"
capacity 20
available [Mon 09:00-11:00, Wed 11:00-13:00]

time_slot "S1" 09:00-10:00
time_slot "S2" 10:00-11:00
time_slot "S3" 11:00-12:00
time_slot "S4" 12:00-13:00

course "C1"
teacher "Alice"
teacher_id "T1"
duration 1h
sessions 2
student_count 25
day Mon
batches ["B1"]
prefers [monday, tuesday]
preferred_sessions [1, 2]

course "C2"
teacher "Bob"
teacher_id "T2"
duration 1h
sessions 2
student_count 18
day Tue
batches ["B2"]
prefers [wednesday, thursday]
preferred_sessions [0, 1]

schedule auto
```

### 📝 Output 
```
Course C1
   Day Monday | Slot S2 (10:00–11:00) | Room R1
   Day Tuesday | Slot S3 (11:00–12:00) | Room R1

Course C2
   Day Wednesday | Slot S3 (11:00–12:00) | Room R2
   Day Thursday | Slot S4 (12:00–13:00) | Room R2
```
