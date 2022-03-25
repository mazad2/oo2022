package Car;

public class Car implements Information{
    String Owner;
    int ProductionYear;
    float MileAge;

    public Car(String owner, int productionYear, float mileAge) {
        Owner = owner;
        ProductionYear = productionYear;
        MileAge = mileAge;
    }

    @Override
    public int getProductionYear() {
        return ProductionYear;
    }

    @Override
    public String getOwner() {
        return Owner;
    }

    @Override
    public float getMileAge() {
        return MileAge;
    }
}
