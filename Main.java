public class Main{
    public static void main(String[] args){
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2024, "White", 2500000, "A022AA"),
            new Car(2, "Honda", "Accord VI", 2000, "White", 1000000, "A023AA"),
            new Car(3, "Toyota", "Chaser VI", 1997, "Black", 949900, "A024AA"),
        };
        Car[] toyotas = getCarByBrand(cars, "Toyota");
        System.out.println("Машин Toyota: " + toyotas.length);
        Car[] old = getCarByBrandAndYearOperational(cars, "Toyota", 3);
        System.out.println("Старых Toyota: " + old.length);

    }
    public static Car[] getCarByBrand(Car[] cars, String brand) {
        return java.util.Arrays.stream(cars)
            .filter(car -> car.getBrand().equals(brand))
            .toArray(Car[]::new);
    }
    public static Car[] getCarByBrandAndYearOperational(Car[] cars, String brand, int years) {
    int Year = java.time.Year.now().getValue();
    return java.util.Arrays.stream(cars)
            .filter(car -> car.getBrand().equals(brand) && (Year - car.getYear()) > years)
            .toArray(Car[]::new);
}
}
