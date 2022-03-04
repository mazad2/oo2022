import java.util.Scanner;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import java.util.Arrays;
>>>>>>> 0a87ae81522efa5240a9bdb361463e1d803e4fde
>>>>>>> 79bb319f5ab6f21ada07a28cd81f0a0c1701626c

public class Game2 {
    // main --> pakub
    public static void main(String[] args) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
        System.out.println();
>>>>>>> 0a87ae81522efa5240a9bdb361463e1d803e4fde
>>>>>>> 79bb319f5ab6f21ada07a28cd81f0a0c1701626c
        // sout --> pakub
        // String -- sõnaline muutuja
        // char -- üks täht
        // double -- 15kohaline komakohaga number
        // float -- 7kohaline komagakohaga number xxx
        // int -- täiskohaline number 2.1mlj
        // byte -- 128kohta
        // short -- 32000kohta
        // long -- 9,223,372,036,854,775,807
        // boolean -- kahendväärtus true/false

        // Math.random() -- 0 .. 0.9999  -  0 ... 4.9999 -- 0..2 .. 1..3

        World world = new World(5,10);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 79bb319f5ab6f21ada07a28cd81f0a0c1701626c
        Player mangija1 = new Player(world.worldHeight, world.worldWidth);
        Player mangija2 = new Player(world.worldHeight,world.worldWidth);

        // uue instantsi loomine --- uue mälukohaga objekti tekitamine
        // kellel on kõik omadused mis on defineeritud tema klassis
        Enemy vaenlane1 = new Enemy(world.worldHeight, world.worldWidth);
<<<<<<< HEAD
=======
=======
        Player mangija1 = new Player(world.height, world.width);
        Player mangija2 = new Player(world.height,world.width);
        Enemy vaenlane1 = new Enemy(world.height, world.width);
        Item sword =new Item(world.height,world.width,ItemType.SWORD);
        Item hammer =new Item(world.height,world.width,ItemType.HAMMER);
        Item dagger =new Item(world.height,world.width,ItemType.DAGGER);
        world.items = Arrays.asList(sword,hammer,dagger);
>>>>>>> 0a87ae81522efa5240a9bdb361463e1d803e4fde
>>>>>>> 79bb319f5ab6f21ada07a28cd81f0a0c1701626c

        world.printMap(mangija1.coordinateY,
                mangija1.coordinateX, vaenlane1.coordinateY,
                vaenlane1.coordinateX);

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
        World world1 = new World();

>>>>>>> 0a87ae81522efa5240a9bdb361463e1d803e4fde
>>>>>>> 79bb319f5ab6f21ada07a28cd81f0a0c1701626c
        // klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {
<<<<<<< HEAD
            mangija1.movePlayer(input,world.worldHeight,world.worldWidth);
=======
<<<<<<< HEAD
            mangija1.movePlayer(input,world.worldHeight,world.worldWidth);
=======
            mangija1.movePlayer(input,world.height,world.width);
            for (Item item:world.items) {
                if(item.coordinateX == mangija1.cooridnateX && item.coordinateY == mangija1.coordinateY){
                    mangija1.addItem(item);
                }

            }
>>>>>>> 0a87ae81522efa5240a9bdb361463e1d803e4fde
>>>>>>> 79bb319f5ab6f21ada07a28cd81f0a0c1701626c
            world.printMap(mangija1.coordinateY,
                    mangija1.coordinateX, vaenlane1.coordinateY,
                    vaenlane1.coordinateX);
            input = scanner.nextLine();
        }
    }


}