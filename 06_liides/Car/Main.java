package Car;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car("Jaagup", 2000, 140565.7f);
        System.out.println("This car owner is " + honda.getOwner() + " this car production year is " + honda.getProductionYear() + " and this car Mile age is " + honda.MileAge);
    }
}
