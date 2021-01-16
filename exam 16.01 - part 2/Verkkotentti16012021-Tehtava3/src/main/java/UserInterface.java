import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    SecretDiary secretDiary;

    public UserInterface() {
        System.out.print("Please input password for the diary: ");
        String userInput = scanner.nextLine();
        secretDiary = new SecretDiary(userInput);
    }

    public void start() {
        while (true) {
            printCommandList();
            String userInput = readUserInput();
            if (userInput.equals("x")) {
                break;
            } else {
                processCommand(userInput);
            }
        }

    }

    public void processCommand(String userInput) {
        if (userInput.equals("1")) {
            addEntry();
        }

        if (userInput.equals("2")) {
            printAll();
        }

        if (userInput.equals("3")) {
            printEntryOnIndex();
        }

        if (userInput.equals("4")) {
            printNumberOfEntries();
        }
    }

    public void printCommandList() {
        System.out.println("Commands:");
        System.out.println("(1) - Adds entry");
        System.out.println("(2) - Prints all entries");
        System.out.println("(3) - Prints entry on specific index");
        System.out.println("(4) - Returns total number of indices");
        System.out.println("(x) - Terminates the program");
    }

    public String readUserInput() {
        System.out.print(">");
        return scanner.nextLine();
    }

    public void addEntry() {
        System.out.print("Please input entry text: ");
        String text = scanner.nextLine();
        try {
            secretDiary.addEntry(text);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void printAll() {
        try {
            System.out.println(secretDiary.allEntries());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void printEntryOnIndex() {
        System.out.print("Please input entry index: ");
        int index = Integer.valueOf(scanner.nextLine());
        try {
            System.out.print("Entry content: ");
            secretDiary.printEntry(index);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void printNumberOfEntries() {
        try {
            System.out.println("Number of entries is: " + secretDiary.numberOfEntries());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
