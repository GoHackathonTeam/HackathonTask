import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class HackTask {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileReader("input.txt"));
        HashSet<Integer> index = new HashSet<>();
        int size = scanner.nextInt();
        int numb;
        while (scanner.hasNext()) {
            index.add(scanner.nextInt());
            numb = scanner.nextInt();
            for (int j = 0; j < numb; j++) {
                index.add(scanner.nextInt());
            }
        }
        System.out.println(index.size() - size);
    }
}
