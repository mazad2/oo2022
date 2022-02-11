import java.util.Scanner;

public class Game {
    //main-->pakub
    public static void main(String[] args) {
        //sout-->pakub
        System.out.println("Hello World");
        //String -->sonaline muutuja
        //char --> uks taht
        //double --> 15koh number
        //float --> 7 koh number
        //int --> taikohaline number 2.1mlj
        //byte --> 128 kohta
        //short --> 32000kohta
        //Long -- 9,223,372,036,854,775,907
        int worldHeight = 5;
        int worldWidth = 10;
        //Math.random() -- 0 .. 0.9999 - 0 .... 4.9999
        int playerCoordinateX = generateRandomCoordinate(worldHeight);
        int playerCoordinateY = generateRandomCoordinate(worldWidth);
        int enemyCoordinateX = generateRandomCoordinate(worldHeight);
        int enemyCoordinateY = generateRandomCoordinate(worldWidth);
        printMap(worldHeight,worldWidth,playerCoordinateY,playerCoordinateX,enemyCoordinateY,enemyCoordinateX);
        //klasside tegemine tundr nr2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //fori --> pakub
        char symbol;      //deklareerib 1x  selle muutuja
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight - 1) {
                    symbol = '-';
                } else if (x == 0 || x == 9) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                if (playerCoordinateY == y && playerCoordinateX == x) {
                    symbol = 'x';
                }
                if (enemyCoordinateY == y && enemyCoordinateX == x) {
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
        while (!input.equals("end")) {
            //kontrollib uhte muutjad mingi vaartuste vastu
            switch (input) {
                case "a":
                    playerCoordinateX--;
                    break;
                case "s":
                    playerCoordinateY++;
                    break;
                case "d":
                    playerCoordinateX++;
                    break;
                case "w":
                    playerCoordinateY--;
                    break;
            }
        }
        printMap(worldHeight,worldWidth,playerCoordinateY,playerCoordinateX,enemyCoordinateY,enemyCoordinateX);
        input=scanner.nextLine();
    }

    //int --sama tüüp mis peab olema funktsiooni sees return järgi
    public static int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random() * (worldSize - 2) + 1);

    }

    public static void printMap(int worldHeight, int worldWidth, int playerCoordinateY, int playerCoordinateX, int enemyCoordinateY, int enemyCoordinateX) {
        char symbol;      //deklareerib 1x  selle muutuja
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight - 1) {
                    symbol = '-';
                } else if (x == 0 || x == 9) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                if (playerCoordinateY == y && playerCoordinateX == x) {
                    symbol = 'x';
                }
                if (enemyCoordinateY == y && enemyCoordinateX == x) {
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}

