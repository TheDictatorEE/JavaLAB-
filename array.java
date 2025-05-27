public class array{
    public static void main(String[] args) {
        String sentence = " I am a proud vitian";

        // String methods
        System.out.println("Original: " + sentence);
        System.out.println("Trimmed: " + sentence.trim());
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());
        System.out.println("Title Case (manual): " + toTitleCase(sentence));
        System.out.println("Replaced 'vitian' with 'student': " + sentence.replace("vitian", "student"));
        System.out.println("Index of 'proud': " + sentence.indexOf("proud"));

        // Split into array (words)
        String[] words = sentence.trim().split(" ");
        System.out.println("\nWords in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    // Helper method to convert string to Title Case
    public static String toTitleCase(String str) {
        String[] words = str.trim().split(" ");
        StringBuilder titleCase = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                         .append(word.substring(1).toLowerCase())
                         .append(" ");
            }
        }
        return titleCase.toString().trim();
    }
}
