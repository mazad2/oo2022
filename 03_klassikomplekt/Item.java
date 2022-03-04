public class Item {
    int coordinateY;
    int coordinateX;
    double strenght;
    ItemType itemType;

    public Item(int worldheight, int worldWidth, ItemType itemType){
        this.coordinateY = generateRandomCoordiante(worldheight);
        this.coordinateX = generateRandomCoordiante(worldheight);
        this.itemType = itemType;
        detemineStrenght(itemType); //ctrl + alt + m
    }

    private void detemineStrenght(ItemType itemType) {
        switch (itemType){
            case SWORD:
                this.strenght = 3;
                break;
            case HAMMER:
                this.strenght = 2;
                break;
            case DAGGER:
                this.strenght = 1;
                break;
        }
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }
}
