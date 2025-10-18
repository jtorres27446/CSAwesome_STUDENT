public class StringDiscovery {
    public static void main(String[] args) {
        String phrase = "Christopher Columbus High School";

        // TODO 1: What do you think this prints?
        System.out.println("Length: " + phrase.length());

        // TODO 2: Extract "Christopher"
        System.out.println("Substring (0, 11): " + phrase.substring(0, 11));

        // TODO 3: Find index of first 'C'
        System.out.println("Index of C: " + phrase.indexOf("C"));

        // TODO 4: Compare phrase to lowercase version
        System.out.println("Equals 'columbus': " + phrase.equals("columbus"));

        // TODO 5: Convert to lowercase
        System.out.println("Lowercase: " + phrase.toLowerCase());

        // TODO 6: Get character at index 5
        System.out.println("Char at index 5: " + phrase.charAt(5));

        // TODO 7: Add two new methods you found from the documentation
        // Example: System.out.println("Contains 'High'? " + phrase.contains("High"));
        // Example: System.out.println("Replace 'High' with 'Prep': " + phrase.replace("High", "Prep"));

        // REFLECTION: Answer the questions here in comments.
    }
}
