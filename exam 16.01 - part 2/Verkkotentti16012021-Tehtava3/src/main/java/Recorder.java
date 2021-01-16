import java.util.ArrayList;

public interface Recorder {
    void addEntry(String content) throws IncorrectPasswordException;
    void printEntry(int index) throws IncorrectPasswordException;
    ArrayList<String> allEntries() throws IncorrectPasswordException;
    int numberOfEntries() throws IncorrectPasswordException;
}
