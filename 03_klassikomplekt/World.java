<<<<<<< HEAD
public class World {
    int worldHeight;
    int worldWidth;

    public World(int height, int width) {
        this.worldHeight = height;
        this.worldWidth = width;
=======
import java.util.List;

public class World {
    int height;
    int width;
    List<Item> items;

    public World(int height, int width) {
        this.height = height;
        this.width = width;
>>>>>>> 79bb319f5ab6f21ada07a28cd81f0a0c1701626c
    }

    public void printMap(int playerCoordinateY, int playerCoordinateX,
                         int enemyCoordinateY, int enemyCoordianteX) {
        // fori --> pakub
        char symbol;   // deklareerib 1x muutuja, mitte iga kord deklareerib selle muutuja
<<<<<<< HEAD
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) { // primitiiv || andmebaasipäring
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
=======
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (y == 0 || y == height -1) { // primitiiv || andmebaasipäring
                    symbol = '-';
                } else if (x == 0 || x == width -1) {
>>>>>>> 79bb319f5ab6f21ada07a28cd81f0a0c1701626c
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
<<<<<<< HEAD
=======
                for (int i = 0; i < items.size(); i++) {
                    if(items.get(i).coordinateY == y && items.get(i).coordinateX == x){
                        symbol = 'I';
                        break;
                    }
                }
>>>>>>> 79bb319f5ab6f21ada07a28cd81f0a0c1701626c
                if (playerCoordinateY == y && playerCoordinateX == x) {
                    symbol = 'x';
                }
                if (enemyCoordinateY == y && enemyCoordianteX == x) {
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}