public class Car extends Vehicle {
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "Je suis une " + this.getBrand() + " et j'ai " + this.getKilometers() + " kilomètres";
    }
}
