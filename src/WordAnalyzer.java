import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Класс для анализа слов в файле
public class WordAnalyzer {
    private File inputFile;

    // Конструктор для инициализации объекта с файлом
    public WordAnalyzer(File inputFile) {
        this.inputFile = inputFile;
    }

    // Метод для подсчета слов в файле
    public int countWords() {
        int count = 0;
        try {
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return count;
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

    // Метод для отображения частоты слов в файле
    public void displayWordFrequency() {
        WordFrequencyCounter counter = new WordFrequencyCounter(inputFile);
        Map<String, Integer> wordFrequency = counter.calculateWordFrequency();
        System.out.println("Частота слов в файле:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
