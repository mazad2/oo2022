import java.util.Scanner;
import java.util.Arrays;

public class Game2 {
    // main --> pakub
    public static void main(String[] args) {
        System.out.println();
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
        Player mangija1 = new Player(world.height, world.width);
        Player mangija2 = new Player(world.height,world.width);
        Enemy vaenlane1 = new Enemy(world.height, world.width);
        Item sword =new Item(world.height,world.width,ItemType.SWORD);
        Item hammer =new Item(world.height,world.width,ItemType.HAMMER);
        Item dagger =new Item(world.height,world.width,ItemType.DAGGER);
        world.items = Arrays.asList(sword,hammer,dagger);

        world.printMap(mangija1.coordinateY,
                mangija1.coordinateX, vaenlane1.coordinateY,
                vaenlane1.coordinateX);

        World world1 = new World();

        // klasside tegemine tund nr2
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            mangija1.movePlayer(input,world.height,world.width);
            for (Item item:world.items) {
                if(item.coordinateX == mangija1.cooridnateX && item.coordinateY == mangija1.coordinateY){
                    mangija1.addItem(item);
                }

            }
            world.printMap(mangija1.coordinateY,
                    mangija1.coordinateX, vaenlane1.coordinateY,
                    vaenlane1.coordinateX);
            input = scanner.nextLine();
        }
    }


}