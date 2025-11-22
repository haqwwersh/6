public class Main{
    public static void main(String[] args){
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2024, "White", 2500000, "A022AA"),
            new Car(2, "Honda", "Accord VI", 2000, "White", 1000000, "A023AA"),
            new Car(3, "Audi", "A7", 2012, "Black", 1900000, "A024AA"),
        };
        Car[] toyotas = getCarByBrend(cars, "Toyota");
        System.out.println("Машин Toyota: " + toyotas.length);
    }
    public static Car[] getCarByBrend(Car[] cars, String brend) {
        return java.util.Arrays.stream(cars)
            .filter(car -> car.getBrand().equals(brend))
            .toArray(Car[]::new);
    }
}