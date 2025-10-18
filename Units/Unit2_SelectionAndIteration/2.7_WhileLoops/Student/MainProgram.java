/* ===========================================================
   Lab 2.7 – While Loops
   Practice with counters, sentinels, validation, accumulation, and debugging.
   =========================================================== */
import java.util.*;

public class MainProgram {
    public static void main(String[] args) {
        q1();
        q2();
        // q3(); // interactive
        q4();
        // q5(); // interactive
        q6();
        // q7(); // stretch
    }

    // q1: Counter loop warm‑up (1..10 then 10..1)
    public static void q1() {
        // TODO: Use a while loop to print 1..10 on one line separated by spaces.
        // Then print 10..1 on the next line.
    }

    // q2: Sum & average with sentinel 0
    public static void q2() {
        // TODO: Repeatedly read integers until 0 is entered.
        // Maintain count and sum; compute average (guard against divide by zero).
        Scanner in = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        // TODO: your code here
    }

    // q3: Input validation (1..100 inclusive)
    public static void q3() {
        // TODO: Keep prompting until user enters an int between 1 and 100 inclusive.
        // Print "OK" and the accepted value.
        Scanner in = new Scanner(System.in);
        // TODO: your code here
    }

    // q4: Digit count without Strings
    public static void q4() {
        // TODO: Given n>0, print the number of digits (e.g., 7 -> 1, 42 -> 2, 105 -> 3).
        int n = 105; // sample; feel free to change
        // TODO: your code here
    }

    // q5: Guessing game (1..50)
    public static void q5() {
        // TODO: Generate a random secret between 1 and 50.
        // Loop reading guesses until correct; print "higher"/"lower" hints and attempts count.
        Scanner in = new Scanner(System.in);
        // TODO: your code here
    }

    // q6: Off-by-one debug
    public static void q6() {
        // TODO: The following loop is broken; fix it so exactly 5 stars print.
        int i = 0;
        while (i <= 5) { // BUG: currently prints 6 stars
            System.out.print("*");
            i++;
        }
        System.out.println();
        // FIX: your corrected loop below (and comment explaining the bug)
    }

    // q7: Stretch – multiplication table via nested while loops
    public static void q7() {
        Scanner in = new Scanner(System.in);
        System.out.print("Size: ");
        int n = in.nextInt();
        int r = 1;
        while (r <= n) {
            int c = 1;
            while (c <= n) {
                System.out.printf("%4d", r * c);
                c++;
            }
            System.out.println();
            r++;
        }
    }
}
/* -----------------------------------------------------------
   🪞 Reflection Questions (answer in full sentences)
   1) Describe a loop invariant you relied on in this lab. Why is it helpful?
   2) What is a sentinel value? When would you prefer a sentinel loop over a counter loop?
   3) Name one common cause of infinite loops and how to prevent it.
------------------------------------------------------------ */
