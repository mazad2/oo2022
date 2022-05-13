import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.sql.Array;
import java.util.*;

public class TextRead {
    public File file;
    public BufferedReader Reader;

    public TextRead(String filename) throws FileNotFoundException {
        this.file = new File(filename);
        this.Reader = new BufferedReader(new FileReader(file));
    }

    public void printText() throws IOException {
        System.out.println(Reader.readLine());
    }

    public List<Character> lastLetter() throws IOException{
        var letterList = new ArrayList<Character>();
        for (int i = 0; i < Reader.read() + 1; i++) {
            var row = Reader.readLine().toCharArray();
            for (int j = 0; j < row.length - 1; j++) {
                if (Objects.equals(row[j + 1], ' ') || j == row.length - 1) {
                    letterList.add(row[j]);
                }


            }
        }

        return letterList;
    }
    public LinkedHashMap<Character, Integer> returnLetter() throws IOException {
            var symbolsHash = new HashMap<Character, Integer>();
            var symbols = this.lastLetter();
            for (char letter : symbols) {
                if (symbolsHash.containsKey(letter)) {
                    var appearances = symbolsHash.get(letter);
                    symbolsHash.put(letter, appearances + 1);
                } else {
                    symbolsHash.put(letter, 1);
                }
            }
            var sortedSymbols = new LinkedHashMap<Character, Integer>();
            symbolsHash.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEachOrdered(x -> sortedSymbols.put(x.getKey(), x.getValue()));
        return sortedSymbols;
    }
}
