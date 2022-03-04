import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Failikirjutamine {
    public static void main(String[] args) throws IOException {
        PrintWriter pW = new PrintWriter(
                new FileWriter("väljund1.txt")
        );
        pW.println("teretere");
        pW.print(" Juku");
        pW.close();
    }
}
