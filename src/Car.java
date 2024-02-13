public abstract class Car implements Printable{
    private String brand;
    private int year;
    public String getBrand() {
        return brand;


    }

        public int getYear() {
            return year;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;

    }

    @Override
    public void print() {
        System.out.println("Model: " + getBrand());
        System.out.println("Year: " + getYear());
    }
}
