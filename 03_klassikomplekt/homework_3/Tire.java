public class Tire {
    public String name;
    public Tire(String tireName){
        this.name = tireName;
    }
    public void chooseTire(Car carName, Tire tireName){
        System.out.println(carName.name + " is using " + tireName.name);
    }
}
