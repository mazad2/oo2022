import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var text = new TextRead("text.txt");
        System.out.println(text.returnLetter());
    }
}
