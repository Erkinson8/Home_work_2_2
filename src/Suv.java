public class Suv extends Car {
    private double engine;

    public double getEngine() {
        return engine;
    }

    public Suv(String brand, int year, double engine) {
        super(brand, year);
        this.engine = engine;
    }

    @Override
    public void print() {
        System.out.println("Suv:");
        super.print();
        System.out.println("engine: " + getEngine());
    }
}

