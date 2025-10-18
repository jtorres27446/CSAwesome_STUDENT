# 🧩 AP CSA — String Methods Practice Worksheet (AP Exam Focus)
**Lesson:** 1.15 – The String Class  
**Topic:** Exploring and Applying AP-Required String Methods  
**Name:** ___________________________  **Date:** ____________

---

## 🧠 Objective
Practice the six `String` methods that are required for the AP Computer Science A Exam.

---

## 🔑 AP Exam–Required `String` Methods

| Method | Description | Example |
|---------|--------------|----------|
| `length()` | Returns the number of characters in the string. | `"hello".length()` → `5` |
| `substring(int from, int to)` | Returns substring from `from` to `to - 1`. | `"computer".substring(0,3)` → `"com"` |
| `substring(int from)` | Returns substring from `from` to end. | `"computer".substring(4)` → `"uter"` |
| `indexOf(String str)` | Returns index of first occurrence or `-1` if not found. | `"banana".indexOf("na")` → `2` |
| `equals(String other)` | Returns `true` if both strings have same characters. | `"Hi".equals("hi")` → `false` |
| `compareTo(String other)` | Compares strings alphabetically. | `"apple".compareTo("banana")` → `< 0` |

---

## 🧩 Part 1: Predict the Output

Write what you think each snippet will print.

```java
String word = "Programming";
System.out.println(word.substring(3));
System.out.println(word.length());
System.out.println(word.indexOf("m"));
```
💬 **Your Answer:**
```
1. ________________________
2. ________________________
3. ________________________
```

```java
String phrase = "Java is fun!";
System.out.println(phrase.substring(0, 4));
System.out.println(phrase.equals("java is fun!"));
System.out.println(phrase.compareTo("Java is cool!"));
```
💬 **Your Answer:**
```
1. ________________________
2. ________________________
3. ________________________
```

---

## 🧠 Part 2: Debug the Code

Each of the following contains a common String mistake. Correct it.

```java
String studentName = "Alex";
System.out.println(studentName.substring(2, 10)); // Error?
```
💬 **What’s wrong and how can you fix it?**  
____________________________________________________________  
____________________________________________________________  

```java
String greeting = "Hello";
if (greeting == "Hello") {
    System.out.println("Match!");
}
```
💬 **What’s wrong and how can you fix it?**  
____________________________________________________________  
____________________________________________________________  

```java
String city = "Miami";
System.out.println(city.indexOf("z"));
```
💬 **What value prints and why?**  
____________________________________________________________  
____________________________________________________________  

---

## 💡 Part 3: Apply It

Write code that does the following:

1. Prompts the user for their first and last name.  
2. Prints the first initial and last initial in uppercase (e.g., “A. B.”).  
3. Prints how many characters are in the full name (excluding spaces).

💬 **Your Code:**
```java
// Write your solution here
```

---

## 🌟 Challenge

Write a program that compares two strings entered by the user and prints whether they are the same or which one comes first alphabetically.  
Use `equals()` and `compareTo()`.

💬 **Your Code:**
```java
// Write your comparison program here
```

---

## 🧾 Exit Reflection

1. Which `String` method do you find most useful?  
   ____________________________________________________________  

2. Why must we use `equals()` instead of `==` when comparing strings?  
   ____________________________________________________________  

3. What’s one new thing you learned about how `substring()` or `compareTo()` work?  
   ____________________________________________________________  
