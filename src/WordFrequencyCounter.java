import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Класс для подсчета частоты слов в файле
public class WordFrequencyCounter {
    private File inputFile;

    // Конструктор для инициализации объекта с файлом
    public WordFrequencyCounter(File inputFile) {
        this.inputFile = inputFile;
    }

    // Метод для вычисления частоты слов в файле
    public Map<String, Integer> calculateWordFrequency() {
        Map<String, Integer> wordFrequency = new HashMap<>();
        try {
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return wordFrequency;
    }
}
