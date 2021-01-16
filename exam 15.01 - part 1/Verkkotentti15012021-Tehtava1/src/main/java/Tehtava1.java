import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tehtava1 {
    public static void main(String[] args) {
        List<String> inputWordList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String userInput;
        while (true) {
            userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }

            if (hasSpace(userInput) || hasOnlyCapitalLetters(userInput) || hasOnlySmallLetters(userInput)) {
                inputWordList.add(userInput);
            }
        }
        for(String word:inputWordList){
            System.out.println(word);
        }
    }

    public static boolean hasSpace(String input) {
        return input.contains(" ");
    }

    public static boolean hasOnlyCapitalLetters(String input) {
        boolean ifOnlyCapital = true;
        for (int i = 0; i < input.length(); i++) {
            Character character = input.charAt(i);

            if (!java.lang.Character.isUpperCase(character)) {
                ifOnlyCapital = false;
            }
        }
        return ifOnlyCapital;
    }

    public static boolean hasOnlySmallLetters(String input) {
        boolean ifOnlySmall = true;
        for (int i = 0; i < input.length(); i++) {
            Character character = input.charAt(i);

            if (java.lang.Character.isUpperCase(character)) {
                ifOnlySmall = false;
            }
        }
        return ifOnlySmall;
    }
}