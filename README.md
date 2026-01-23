[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/jLmsEuC8)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22208137)

# AP CSA Project: Weekly Data Analyzer

---

## 📌 Project Overview

In this project, you will design and build a **Weekly Data Analyzer** in Java. My version of the project is a **Weekly Sleep Analyzer**, which allows a user to enter **7 days of sleep data** (hours slept per night).

The program stores this data in an **array**, analyzes it using **array algorithms**, and presents useful results to the user. The project applies **object-oriented programming (OOP)** principles by creating a custom data class (`WeeklyData`) that encapsulates both the data and the logic used to analyze it.

This project simulates how developers build **reusable, well-structured code** that separates:
- Data storage  
- Data processing  
- User interaction  

---

## 🎯 Learning Goals

By completing this project, you will demonstrate that you can:

- Declare and use arrays to store related data  
- Develop array algorithms (total, average, minimum, maximum, etc.)  
- Apply encapsulation using private instance variables and public methods    
- Write clean, readable Java code with clear method responsibilities  
- Format output for readability  

---

## 🧠 Project Theme

**Weekly Sleep Analyzer** – Tracks the number of hours slept per night for 7 days and analyzes the data.

---

## 🧩 Program Structure & Requirements

The project includes **two main classes**:

1. **WeeklyData** (Data class)  
2. **App** (Main class, user interaction & testing)

---

### 📦 WeeklyData Class

- **Private instance variables**: `double[] sleepData` (7 days of sleep)  
- **Constructor**: Accepts an array and creates a deep copy to prevent aliasing  
- **Methods**:  
  - `getTotal()` – total hours slept in the week  
  - `getAverage()` – average hours slept per night  
  - `getMax()` – highest hours slept in a day  
  - `getMin()` – lowest hours slept in a day  
  - `toString()` – formatted multi-line string of daily sleep hours  

---

### 🧪 App Class (Main)

Responsible for:

- Creating an array for **7 days of sleep data**  
- Prompting the user for input using a `for` loop  
- Validating input using a `while` loop (hours between 0–24 only)  
- Creating a `WeeklyData` object  
- Calling methods to display total, average, min, max  
- Displaying all daily values  
- Providing insights based on average sleep  

---

## 📋 Sample Output  

```

Enter hours slept for day 1: 7.5
Enter hours slept for day 2: 8.0
Enter hours slept for day 3: 6.5
Enter hours slept for day 4: 7.0
Enter hours slept for day 5: 8.5
Enter hours slept for day 6: 7.0
Enter hours slept for day 7: 9.0

Weekly Summary:
Total Sleep: 53.5 hours
Average Sleep: 7.64 hours/night
Most Sleep in One Day: 9.0 hours
Least Sleep in One Day: 6.5 hours

All Daily Values:
Day 1: 7.5 hours
Day 2: 8.0 hours
Day 3: 6.5 hours
Day 4: 7.0 hours
Day 5: 8.5 hours
Day 6: 7.0 hours
Day 7: 9.0 hours

Insight:
Great job maintaining healthy sleep habits!

```

---

## ✅ Project Checklist

Before submitting, confirm that:

- [x] Array stores **7 days of data**  
- [x] Array is **private and encapsulated** in `WeeklyData`  
- [x] Calculations use **loops** (no hard-coded math)  
- [x] Input is validated using a **while loop**  
- [x] Methods return correct results for typical and edge cases  
- [x] Output is clean, readable, and clearly labeled  
- [x] Code compiles and runs without errors  
- [x] Code is **commented with JavaDoc and inline comments**  

---

## 🌟 Optional Extensions (Extra Challenge)

- Add a method like `getMedian()` or `getDayOfHighest()`  
- Label days by name (Mon–Sun)  
- Track multiple weeks using a **2D array**  
- Add a simple menu system  

---

## 📄 Submission Instructions

- Push your completed code to this GitHub repository  
- Include your name and chosen project theme in the README  
- Provide a short description of your program  

---

**Author:** Rin Ryu  
**Project Theme:** Weekly Sleep Analyzer  
**Date:** 1/22/2026  
```
