/* ===========================================================
   Lab 2.5 – Compound Boolean Expressions
   Practice with &&, ||, !, operator precedence, and short‑circuit evaluation.
   =========================================================== */
import java.util.*;

public class MainProgram {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        // q7(); // Stretch
    }

    // q1: Warmup truth checks
    public static void q1() {
        // TODO: Given two booleans: passedExam and completedProject, print:
        // "PASS" if passedExam && completedProject, otherwise "RETAKE".
        boolean passedExam = true;   // sample data; feel free to change
        boolean completedProject = false;
        // TODO: your code here
    }

    // q2: Safe division with guard (short-circuit)
    public static void q2() {
        // TODO: Using x and y, print "first case" if (x > 0 && (y / x) == 3), else "second case".
        // IMPORTANT: Write it to rely on short-circuit so no divide-by-zero occurs when x == 0.
        int x = 0;
        int y = 9;
        // TODO: your code here
    }

    // q3: Range checks
    public static void q3() {
        // TODO: Ask for an int age from Scanner and print whether it's in the working-age
        // range 18..65 inclusive using a single compound expression.
        // Then print whether it's in the teen range 13..19 (exclusive of 19).
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = in.nextInt();
        // TODO: your code here
    }

    // q4: Precedence & parentheses
    public static void q4() {
        // TODO: Given a, b, c booleans, compute expr1 = !a && b || c and expr2 = !(a && (b || c)).
        // Print both results to show how precedence/parentheses affect evaluation.
        boolean a = true, b = false, c = true;
        // TODO: your code here
    }

    // q5: Username validation
    public static void q5() {
        // TODO: Ask user for a username.
        // Valid if: length between 4 and 12 inclusive, first character is a letter,
        // and every character is a letter, digit, '.' or '_'.
        // Use compound boolean expressions to validate; print "VALID" or "INVALID".
        Scanner in = new Scanner(System.in);
        System.out.print("Username: ");
        String u = in.nextLine();
        // TODO: your code here
    }

    // q6: AP-style trace
    public static void q6() {
        // TODO: For p=true, q=false, r=true compute:
        // final = (p && !q) || (r && (p || q));
        // Print intermediate results for !q, (p && !q), (p || q), (r && (p || q)), and final.
        boolean p = true, q = false, r = true;
        // TODO: your code here
    }

    // Stretch: Truth table printer for p, q
    public static void q7() {
        // Optional: Print rows for p, q, !p, p&&q, p||q for all combinations of p and q.
        boolean[] vals = {false, true};
        for (boolean p : vals) {
            for (boolean q : vals) {
                boolean notP = !p;
                boolean andPQ = p && q;
                boolean orPQ = p || q;
                System.out.println(p + "\t" + q + "\t" + notP + "\t" + andPQ + "\t" + orPQ);
            }
        }
    }
}
/* -----------------------------------------------------------
   🪞 Reflection Questions (answer below this line in full sentences)
   1) In your own words, when does short‑circuit evaluation skip the right‑hand side?
   2) Give one real bug that short‑circuiting helps prevent in your code today.
   3) Write one readable range check for a real‑world rule (e.g., school ID validity) and explain it.
------------------------------------------------------------ */
