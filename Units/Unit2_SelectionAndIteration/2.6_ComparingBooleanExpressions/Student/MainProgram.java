/* ===========================================================
   Lab 2.6 – Comparing Boolean Expressions (De Morgan’s Laws)
   =========================================================== */
public class MainProgram {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        // q7(); // stretch
    }

    // q1: !(A && B) vs !A || !B
    public static void q1() {
        boolean A = true;
        boolean B = false;
        // TODO: Print results of !(A && B) and !A || !B, compare equivalence
    }

    // q2: !(A || B) vs !A && !B
    public static void q2() {
        boolean A = true;
        boolean B = true;
        // TODO: Print results of both expressions; confirm they match for all combos
    }

    // q3: Range negation
    public static void q3() {
        int x = 10;
        // TODO: Write condition for "x outside [5,15]" in two equivalent ways
    }

    // q4: Simplify nested NOTs
    public static void q4() {
        boolean p = false, q = true, r = false;
        // TODO: Simplify !(p || !(q && !r)) using De Morgan’s Laws step by step
    }

    // q5: Real-world example (login logic)
    public static void q5() {
        boolean hasUser = true;
        boolean hasPassword = false;
        // TODO: Compare login logic using !(hasUser && hasPassword) vs !hasUser || !hasPassword
    }

    // q6: AP-style trace
    public static void q6() {
        boolean a = true, b = false;
        boolean expr1 = !(a && b);
        boolean expr2 = (!a || !b);
        System.out.println("expr1=" + expr1 + " expr2=" + expr2);
    }

    // Stretch: truth table
    public static void q7() {
        boolean[] vals = {false, true};
        System.out.println("A\tB\t!(A&&B)\t!A||!B\t!(A||B)\t!A&&!B");
        for (boolean A : vals) {
            for (boolean B : vals) {
                System.out.println(A + "\t" + B + "\t" + !(A&&B) + "\t" + (!A||!B)
                        + "\t" + !(A||B) + "\t" + (!A&&!B));
            }
        }
    }
}
/* -----------------------------------------------------------
   🪞 Reflection Questions
   1) State De Morgan’s Laws in your own words.
   2) Why do they matter when simplifying or debugging boolean logic?
   3) Give a real example from your code where applying them improved readability.
------------------------------------------------------------ */
