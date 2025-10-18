# Lab 015 – String Discovery

## 🎯 Learning Goals
- I can identify and use built-in methods of the Java `String` class.
- I can predict the output of `String` methods by reading documentation.
- I can apply common `String` methods to manipulate text and extract information.

---

## 🧰 Pre-Lab
1. Open the official Java documentation for the `String` class:  
   👉 https://docs.oracle.com/javase/8/docs/api/java/lang/String.html  
2. Skim through and note down **any 3 methods** you think might be useful.  
3. Predict what each method does — you’ll test your predictions in code.

---

## 🧪 Setup
Open `StringDiscovery.java` in VS Code and run the program.  
You will see TODO comments guiding you to test different `String` methods.

---

## 🧭 Tasks

### 🧩 Task 1: Explore Built-In Methods
Use the `phrase` variable to test each of the following:
1. `length()`
2. `substring(int start, int end)`
3. `indexOf(String str)`
4. `equals(String other)`
5. `toLowerCase()`
6. `charAt(int index)`

For each, add a comment **predicting the output** before you run it.

---

### 🧩 Task 2: Add Your Own
Find **two new methods** from the Java documentation (e.g. `contains()`, `compareTo()`, `replace()`).  
Add them to your program with a comment explaining what they do and an example of how you might use them.

---

### 🧩 Task 3: Reflection Questions
At the bottom of your file, answer in comments:
1. Which method surprised you the most and why?  
2. What happens if you call `substring()` with values beyond the string length?  
3. Why do you think Strings are considered **immutable**?

---

## 🚀 Stretch Goals
- Create a small program that asks for a user’s **first and last name** and prints:
  - The total number of characters.
  - The name in all uppercase.
  - The initials (e.g., "John Doe" → "J.D.").

---

## 🧾 Exit Ticket
- Submit a screenshot of your working output.
- Push your changes to GitHub and create a Pull Request.

---

## ✅ Submission Checklist
- [ ] All required methods tested and commented.
- [ ] Two self-discovered methods added.
- [ ] Reflection questions answered.
- [ ] Program runs without errors.
