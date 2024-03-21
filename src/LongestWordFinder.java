import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Класс для поиска самого длинного слова в файле
public class LongestWordFinder {
    private File inputFile;

    // Конструктор для инициализации объекта с файлом
    public LongestWordFinder(File inputFile) {
        this.inputFile = inputFile;
    }

    // Метод для поиска самого длинного слова в файле
    public String findLongestWord() {
        String longestWord = "";
        try {
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return longestWord;
    }
}