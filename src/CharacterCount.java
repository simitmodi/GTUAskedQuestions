public class CharacterCount {

    public static void main(String[] args) {
        // Check if a command-line argument is provided
        if (args.length == 0) {
            System.out.println("Usage: java CharacterCount \"<string>\"");
            return;
        }

        // Get the input string from the command-line argument
        String input = args[0];

        // Create an array to store the frequency of each character
        int[] charCountArray = new int[256]; // 256 for all ASCII characters

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            charCountArray[ch]++; // Increment the count for the character
        }

        // Print the character frequencies
        System.out.println("Character occurrences in the string:");
        for (int i = 0; i < charCountArray.length; i++) {
            if (charCountArray[i] > 0) { // Only print characters with non-zero counts
                System.out.println("'" + (char) i + "' : " + charCountArray[i]);
            }
        }
    }
}