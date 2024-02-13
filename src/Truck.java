public class Truck extends Car {
     private String color;

    public Truck(String brand, int year, String color) {
        super(brand, year);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("Truck:");
        super.print();
        System.out.println("color: " + getColor());
    }
}
