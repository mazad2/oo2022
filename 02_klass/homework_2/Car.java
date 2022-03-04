public class Car {
    String name;
    int age;

    public Car(String carName, int carAge){
        this.name= carName;
        this.age= carAge;
    }

    public void printonDisplay(){
        System.out.println("You are driving car model: " + this.name+" and its "+ this.age+" years old");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                '}';
    }
}
