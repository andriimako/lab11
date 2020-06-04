public class Car implements Comparable<Car> {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return model + " " + year;
    }

    @Override
    public int compareTo(Car car) {
        return year - car.year;
    }
}
