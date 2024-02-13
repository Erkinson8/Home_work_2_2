public class Sedan extends Car{
     private int numSeats;

    public int getNumSeats() {
        return numSeats;
    }

    public Sedan( String brand, int year, int numSeats) {
        super(brand, year);
        this.numSeats = numSeats;

    }

    @Override
    public void print() {
        System.out.println( "Sedan:");
        super.print();
        System.out.println("numSeats: " + getNumSeats());
    }
}
