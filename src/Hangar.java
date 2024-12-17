public class Hangar {
    public static void main(String[] args) {
        Vehicle car = new Car("Clio", 10000);
        Vehicle boat = new Boat("Titanic", 1000);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
