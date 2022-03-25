import java.util.Random;
import java.util.Scanner;

class TriksTraksTrull {
    final char xsign = 'x';
    final char osign = 'o';
    final char tühjus = '█';
    char[][] table;
    Random random;
    Scanner scanner;

    TriksTraksTrull() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }

    public void Mäng() {
        eelPlats();
        while (true) {
            InimeseKord();
            if (Võidukontroll(xsign)) {
                System.out.println("Sinu võit!!!");
                break;
            }
            if (KasOnTäis()) {
                System.out.println("Keegi ei võitnud((!");
                break;
            }
            ArvutiKord();
            PlatsiPrint();
            if (Võidukontroll(osign)) {
                System.out.println("Arvuti võitis!");
                break;
            }
            if (KasOnTäis()) {
                System.out.println("Keegi ei võitnud!");
                break;
            }
        }
        System.out.println("Mäng lõppes");
        PlatsiPrint();
    }

    void eelPlats() {
        for (int rida = 0; rida < 3; rida++)
            for (int veerg = 0; veerg < 3; veerg++)
                table[rida][veerg] = tühjus;
    }
    //Prindib välja mängu platsi
    void PlatsiPrint() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++)
                System.out.print(table[row][col] + " ");
            System.out.println();
        }
    }
    //Inimese kord
    void InimeseKord() {
        int x, y;
        do {
            System.out.println("Sisesta X(1-3) ja siis sisesta Y(1-3):");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!kasOnTühi(x, y));
        table[y][x] = xsign;
    }
    //Kontrollib, kas kast on tühi, või ei ole
    boolean kasOnTühi(int x, int y) {
        if (x < 0 || y < 0 || x >= 3|| y >= 3)
            return false;
        return table[y][x] == tühjus;
    }
    //AI ise ka paneb 0
    void ArvutiKord() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!kasOnTühi(x, y));
        table[y][x] = osign;
    }
    //Siin see kontrollib kas keegi on juba võitnud, või ei ole
    boolean Võidukontroll(char number) {
        for (int i = 0; i < 3; i++)
            if ((table[i][0] == number && table[i][1] == number && table[i][2] == number) ||
                    (table[0][i] == number && table[1][i] == number && table[2][i] == number))
                return true;
        if ((table[0][0] == number && table[1][1] == number && table[2][2] == number) ||
                (table[2][0] == number && table[1][1] == number && table[0][2] == number))
            return true;
        return false;
    }
    //kontrollib, kas kõik kastid on täitud, või ei ole
    boolean KasOnTäis() {
        for (int rida = 0; rida < 3; rida++)
            for (int veerg = 0; veerg < 3; veerg++)
                if (table[rida][veerg] == tühjus)
                    return false;
        return true;
    }
}