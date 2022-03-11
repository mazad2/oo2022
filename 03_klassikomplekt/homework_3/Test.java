public class Test {
    public static void main(String[] args) {
        Car bmw = new Car("BMW 650i",15, 350);
        Car audi = new Car("AUDI A8",11,275);
        Car mitsubishi = new Car("Mitsubishi Lancer Evolution",21,360);
        Car honda = new Car("Honda Civic Type R",41,320);
        Car volkswagen = new Car("Volkswagen Passat",8,280);

        Tire michelin = new Tire("Michelin Tire");
        Tire continental = new Tire("Continental Tire");
        Tire goodyear = new Tire("Goodyear Tire");
        Tire bridgestone = new Tire("Bridgestone Tire");
        bmw.printonDisplay();
        audi.printonDisplay();
        mitsubishi.printonDisplay();
        honda.printonDisplay();
        volkswagen.printonDisplay();

        continental.chooseTire(audi, continental);
        goodyear.chooseTire(mitsubishi, goodyear);

    }
}
