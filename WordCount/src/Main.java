import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Test.txt"));
            String line;
            int charCount = 0;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                charCount += line.length(); // 统计字符数，包括空格和换行符
                String[] words = line.split("[,\\s]+"); // 使用空格和逗号分割单词
                wordCount += words.length;
            }

            reader.close();

            System.out.println("字符数: " + charCount);
            System.out.println("单词数: " + wordCount);
        } catch (IOException e) {
            System.err.println("文件读取错误: " + e.getMessage());
        }
    }
}


