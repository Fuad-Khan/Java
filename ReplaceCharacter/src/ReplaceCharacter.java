import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Replace each letter with its corresponding reverse letter
        String modifiedSentence = reverseSentence(sentence);

        // Print the modified sentence
        System.out.println("\n\nModified sentence: " + modifiedSentence);
    }

    // Method to replace each letter with its corresponding reverse letter
    public static String reverseSentence(String sentence) {
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            char reversedChar = reverseLetter(currentChar);
            reversedSentence.append(reversedChar);
        }

        return reversedSentence.toString();
    }

    // Method to reverse a letter
    public static char reverseLetter(char letter) {
        char uppercaseLetter = Character.toUpperCase(letter);
        char reversedChar;

        switch (uppercaseLetter) {
            case 'A':
                reversedChar = 'U';
                break;
            case 'B':
                reversedChar = 'Z';
                break;
            case 'C':
                reversedChar = 'Y';
                break;
            case 'D':
                reversedChar = 'X';
                break;
            case 'E':
                reversedChar = 'O';
                break;
            case 'F':
                reversedChar = 'W';
                break;
            case 'G':
                reversedChar = 'V';
                break;
            case 'H':
                reversedChar = 'T';
                break;
            case 'I':
                reversedChar = 'L';
                break;
            case 'J':
                reversedChar = 'S';
                break;
            case 'K':
                reversedChar = 'R';
                break;
            case 'L':
                reversedChar = 'Q';
                break;
            case 'M':
                reversedChar = 'P';
                break;
            case 'N':
                reversedChar = 'N';
                break;
            case 'O':
                reversedChar = 'E';
                break;
            case 'P':
                reversedChar = 'M';
                break;
            case 'Q':
                reversedChar = 'L';
                break;
            case 'R':
                reversedChar = 'K';
                break;
            case 'S':
                reversedChar = 'J';
                break;
            case 'T':
                reversedChar = 'H';
                break;
            case 'U':
                reversedChar = 'A';
                break;
            case 'V':
                reversedChar = 'G';
                break;
            case 'W':
                reversedChar = 'F';
                break;
            case 'X':
                reversedChar = 'D';
                break;
            case 'Y':
                reversedChar = 'C';
                break;
            case 'Z':
                reversedChar = 'B';
                break;
            default:
                reversedChar = letter;
        }

        // Convert the reversed character to lowercase if the original character was
        // lowercase
        char lowercaseLetter = Character.toLowerCase(letter);

        switch (lowercaseLetter) {
            case 'a':
                reversedChar = 'u';
                break;
            case 'b':
                reversedChar = 'z';
                break;
            case 'c':
                reversedChar = 'y';
                break;
            case 'd':
                reversedChar = 'x';
                break;
            case 'e':
                reversedChar = 'o';
                break;
            case 'f':
                reversedChar = 'w';
                break;
            case 'g':
                reversedChar = 'v';
                break;
            case 'h':
                reversedChar = 't';
                break;
            case 'i':
                reversedChar = 'l';
                break;
            case 'j':
                reversedChar = 's';
                break;
            case 'k':
                reversedChar = 'r';
                break;
            case 'l':
                reversedChar = 'q';
                break;
            case 'm':
                reversedChar = 'p';
                break;
            case 'n':
                reversedChar = 'n';
                break;
            case 'o':
                reversedChar = 'e';
                break;
            case 'p':
                reversedChar = 'm';
                break;
            case 'q':
                reversedChar = 'l';
                break;
            case 'r':
                reversedChar = 'k';
                break;
            case 's':
                reversedChar = 'j';
                break;
            case 't':
                reversedChar = 'h';
                break;
            case 'u':
                reversedChar = 'a';
                break;
            case 'v':
                reversedChar = 'g';
                break;
            case 'w':
                reversedChar = 'f';
                break;
            case 'x':
                reversedChar = 'd';
                break;
            case 'y':
                reversedChar = 'c';
                break;
            case 'z':
                reversedChar = 'b';
                break;
            default:
                reversedChar = letter;

               
        }
         return reversedChar;
    }
}
