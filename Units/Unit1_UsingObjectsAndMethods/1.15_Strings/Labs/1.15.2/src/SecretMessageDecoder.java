/* ===========================================================
   Lab 1.15 – Strings: Secret Message Decoder
   Students will use String methods to encode and decode messages.
   =========================================================== */

import java.util.Scanner;

public class SecretMessageDecoder {
    // Class Variables (shared across all methods in this class)
    // These store the Scanner and the String data used in multiple methods.
    static Scanner sc = new Scanner(System.in);
    static String msg;
    static String encoded;
    static String key;
    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
        q5();
    }

    public static void q1() {
        // TODO: Prompt user for a secret message and display its length
    }

    public static void q2() {
        // TODO: Print the first and last character of the message
    }

    public static void q3() {
        // TODO: Encode the message by shifting each character +1 Unicode
    }

    public static void q4() {
        // TODO: Decode the encoded message back to original
    }

    public static void q5() {
        // TODO: Ask the user for a key word and insert it between letters
    }
}

/* -----------------------------------------------------------
   🪞 Reflection Questions
   1. What String methods were most useful in this lab?
   2. How does Java handle Strings differently from primitives?
   3. What was challenging about encoding or decoding?
------------------------------------------------------------ */
