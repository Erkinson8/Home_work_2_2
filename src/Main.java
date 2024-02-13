 public class Main {


     public static Printable createObject(String className) {
         switch (className) {

             case "Sedan":
                 return new Sedan("Honda", 2022, 4);

             case "Suv":
                 return new Suv("Toyota", 2023, 4.7);

             case "Truck":
                 return new Truck("Volvo", 2024, "gray");

             default:
                 return null;

         }
     }

     public static void main(String[] args) {
         System.out.println(" Hello World");
         Printable[] vehicles = new Printable[3];
         vehicles[0] = createObject("Sedan");
         vehicles[1] = createObject("Suv");
         vehicles[2] = createObject("Truck");

         for (Printable vehicle : vehicles) {
             System.out.println();
             vehicle.print();
         }
     }
 }














