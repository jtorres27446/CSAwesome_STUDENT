public class Lab1_15_Strings {
    public static void main(String[] args) {
        System.out.println("Q1 length: " + q1_length("CSAwesome"));
        System.out.println("Q2 substring: " + q2_substring("Explorers"));
        System.out.println("Q3 indexOf: " + q3_indexOf("AP Computer Science A"));
        System.out.println("Q4 equality: " + q4_equals("hello", "Hello"));
        System.out.println("Q5 compare: " + q5_compareTo("Apple", "Application"));
        System.out.println("Q6 concat: " + q6_concat("AP", 2025));
    }

    // Q1: Return the length of the given String s.
    public static int q1_length(String s) {
        // TODO: use the length() method
        return 0;
    }

    // Q2: Return the substring of word from index 0 up to (but not including) 4.
    // For example, if word is "Explorers", it should return "Expl".
    public static String q2_substring(String word) {
        // TODO: use substring(int from, int to)
        return "";
    }

    // Q3: Find the starting index of the substring "Science" in the sentence.
    // If not found, return -1.
    public static int q3_indexOf(String sentence) {
        // TODO: use indexOf(String str)
        return 0;
    }

    // Q4: Return true if a and b have exactly the same characters; false otherwise.
    public static boolean q4_equals(String a, String b) {
        // TODO: use equals(Object other)
        return false;
    }

    // Q5: Compare two strings alphabetically using compareTo.
    // Return the integer result of a.compareTo(b).
    public static int q5_compareTo(String a, String b) {
        // TODO: use compareTo(String other)
        return 0;
    }

    // Q6: Concatenate a String and a number with a hyphen between them, e.g., "AP-2025".
    public static String q6_concat(String prefix, int year) {
        // TODO: use + or += for concatenation
        return "";
    }
}
