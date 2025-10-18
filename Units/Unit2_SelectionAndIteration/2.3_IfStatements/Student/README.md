# 🧠 Lab 2.3 - If Statements
**Unit:** 2 - Control Structures  
**Curriculum:** CSAwesome (fresh, non-duplicated tasks)  
**Type:** Student Version  

---

## 🎯 Learning Goals
- I can construct `if`, `if-else`, and `if-else-if` statements with correct boundary conditions.
- I can trace nested decisions and explain outcomes.
- I can apply variable scope rules within conditional blocks.

---

## 🧩 Pre-Lab (Predict, don’t run)
1. What prints?
```java
int x = 8;
if (x > 5) 
    System.out.print("A");
if (x > 10) 
    System.out.print("B");
else 
    System.out.print("C");
```
2. Identify two distinct ranges your grading logic must cover **without overlap**.

---

## ⚙️ Setup
1. Create `IfStatementsLab.java` and paste the starter code.
2. Complete each method’s TODO. Keep tests simple and visible with `System.out.println`.
3. Answer the **Reflection** at the bottom of the `.java` file per the v1.3 guide.

---

## 🧭 Tasks
- `simpleIfExample()` → Print a “Heat advisory” only when `temp >= 100`. Choose a test value that does **not** print, then one that does.
- `ifElseExample()` → Even/odd checker using `%` and an `if-else`.
- `ifElseIfExample()` → Letter grades from a **20-point quiz**: A=18–20, B=16–17, C=14–15, D=12–13, else F. Test all boundaries.
- `nestedIfExample()` → Honors Council: qualify if `(gpa >= 3.6 && hours >= 20)` **or** `(gpa >= 3.9)` (waives hours). Print result.
- `scopePractice()` → Show which variables are accessible inside vs. outside the `if` block.

---

## 🚀 Stretch Goals
- Add input via `Scanner` and re-run tests with user-entered values.
- Refactor your `ifElseIfExample` into a method that **returns** the letter as a `String`.

---

## 🎟 Exit Ticket (Used by Reflection Footer)
1. Which boundary comparisons were trickiest to design?
2. How did nesting impact readability and testing?
3. Where did scope rules prevent a bug?

---

## ✅ Submission Checklist
- [ ] Code compiles and runs.
- [ ] All methods completed and tested at boundaries.
- [ ] Reflection answered in the `.java` footer block.
- [ ] Pushed to GitHub Classroom PR.
