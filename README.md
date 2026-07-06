# Java Arrays Practice Problems

This repository contains basic to intermediate Java programs designed to build a foundational understanding of **Arrays**. The code covers manual initialization, user input/output handling, working with different data types (Integers and Strings), and algorithmic logic like finding minimum and maximum values.

## 📂 Project Structure

All files are located within the `Arrays/` folder:

| File Name | Description | Key Concept |
| :--- | :--- | :--- |
| `Array_1.java` | Basic array declaration, indexing, and manual assignment. | Static initialization & Indexing |
| `Array_2.java` | Dynamic array sizing based on user input and checking default values. | Dynamic Allocation |
| `Array_Input_Output.java` | Taking dynamic input to populate an array and printing the elements. | Scanner input & Loops |
| `Problem_1.java` | Storing a dynamic list of names (Strings) and displaying them sequentially. | String Arrays |
| `Problem_2.java` | Finding the minimum and maximum values within a user-defined integer array. | Linear Search / Tracking Extremes |

---

## 💻 Detailed Code Breakdowns

### 1. Array_1.java
Demonstrates how to create a fixed-size integer array of size 3 and manually assign values to specific indices.
> ⚠️ **Note:** In the original loop (`i <= 3`), accessing `marks[3]` will cause an `ArrayIndexOutOfBoundsException` because indices range from `0` to `2`. To fix this, change the condition to `i < 3` or `i < marks.length`.

### 2. Array_2.java
Takes an integer input `size` from the user to dynamically instantiate an array. It then loops through the array to print its elements, demonstrating that uninitialized primitive `int` arrays default to `0` in Java.

### 3. Array_Input_Output.java
An interactive program that uses the `Scanner` class to:
1. Ask the user for the size of the array.
2. Accept elements from the user one by one to fill the array.
3. Print the complete array back to the console.

### 4. Problem_1.java
**Problem Statement:** Take an array of names as input from the user and print them out.
* Implements a `String[]` array instead of an integer array.
* Uses `sc.next()` to catch user inputs.
* Outputs the names formatted with user-friendly numbering (`Name 1 is : ...`).

### 5. Problem_2.java
**Problem Statement:** Find the maximum & minimum numbers in an array of integers.
* Features defensive programming by checking if the array `size <= 0`.
* Initializes `min` and `max` variables with the first element of the array (`arr[0]`).
* Iterates through the array to dynamically update the extremes.

---

## 🚀 How to Run the Programs

Ensure you have the Java Development Kit (JDK) installed on your machine.

1. Open your terminal/command prompt and navigate to the directory where the file is located.
2. Compile the Java file:
   ```bash
   javac Code_Name.java