public class Car {
    public String name;
    public int age;
    public int kW;

    public Car(String carName, int carAge, int carkW){
        this.name= carName;
        this.age= carAge;
        this.kW= carkW;
    }

    public void printonDisplay(){
        System.out.println("You are driving car model: " + this.name+" and its "+ this.age+" years old");
        System.out.println("Its kw number is "+ this.kW);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                '}';
    }
}
