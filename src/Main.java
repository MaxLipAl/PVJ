import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Создаем объект для работы с анализом слов
        File inputFile = new File("input.txt");
        WordAnalyzer analyzer = new WordAnalyzer(inputFile);

        // Задача 1: Подсчет слов
        int wordCount = analyzer.countWords();
        System.out.println("Количество слов в файле: " + wordCount);

        // Задача 2: Поиск самого длинного слова
        String longestWord = analyzer.findLongestWord();
        System.out.println("Самое длинное слово в файле: " + longestWord);

        // Задача 3: Частота слов
        analyzer.displayWordFrequency();
    }
}