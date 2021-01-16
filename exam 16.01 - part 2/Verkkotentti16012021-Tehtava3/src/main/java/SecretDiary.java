import java.util.ArrayList;
import java.util.Scanner;

public class SecretDiary implements Recorder {
    private IncorrectPasswordException incorrectPasswordException;
    private Scanner passwordScanner;
    private String password;
    private ArrayList<String> listOfEntries;
    private boolean ifCorrectPasswordGiven;

    public SecretDiary(String password) {
        this.password = password;
        listOfEntries = new ArrayList<>();
        ifCorrectPasswordGiven = false;
        this.passwordScanner = new Scanner(System.in);
        this.incorrectPasswordException = new IncorrectPasswordException("Wrong password.");
    }

    public void addEntry(String content) throws IncorrectPasswordException {
        if (!ifCorrectPasswordGiven) {
            if (!checkPassword(askForPassword())) {
                throw incorrectPasswordException;
            }
        }

        if(ifCorrectPasswordGiven){
            this.listOfEntries.add(content);
        }
    }

    public void printEntry(int index) throws IncorrectPasswordException {
        if (!ifCorrectPasswordGiven) {
            if (!checkPassword(askForPassword())) {
                throw incorrectPasswordException;
            }
        }
        if(ifCorrectPasswordGiven){
            System.out.println(this.listOfEntries.get(index));
        }
    }

    public ArrayList<String> allEntries() throws IncorrectPasswordException {
        if (!ifCorrectPasswordGiven) {
            if (!checkPassword(askForPassword())) {
                throw incorrectPasswordException;
            }
        }
        if(ifCorrectPasswordGiven){
            return this.listOfEntries;
        }
        throw incorrectPasswordException;
    }



    public int numberOfEntries() throws IncorrectPasswordException {
        if (!ifCorrectPasswordGiven) {
            if (!checkPassword(askForPassword())) {
                throw incorrectPasswordException;
            }
        }
        if(ifCorrectPasswordGiven){
            return this.listOfEntries.size();
        }
        throw incorrectPasswordException;
    }

    private boolean checkPassword(String inputPassword) {
        if (inputPassword.matches(this.password)) {
            this.ifCorrectPasswordGiven=true;
            return true;
        } else {
            return false;
        }
    }

    private String askForPassword() {
        System.out.println("Please input password: ");
        return passwordScanner.nextLine();
    }
}
