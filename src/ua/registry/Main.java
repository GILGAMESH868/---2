package ua.registry;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();

        Owner owner1 = new Owner("OWN-001", "Georgiy", "Chikvaidze", "DL-123456",
                LocalDate.of(2008, 1, 7), "Odesa, UA");
        Owner owner2 = new Owner("OWN-002", "Iryna", "Koval", "DL-654321",
                LocalDate.of(1999, 3, 12), "Kyiv, UA");

        Car car1 = new Car("VF1AA000000000001", "BH1234AA", "Toyota", "Supra", 2020, "Black");
        Car car2 = new Car("VF1AA000000000002", "AA7777BB", "BMW", "M3", 2022, "Blue");

        registry.addOwner(owner1);
        registry.addOwner(owner2);
        registry.addCar(car1);
        registry.addCar(car2);

        registry.assignOwnerToCar(owner1.getId(), car1.getVin());
        registry.assignOwnerToCar(owner2.getId(), car2.getVin());

        System.out.println(owner1.toString());
        System.out.println(car1.toString());
        System.out.println(registry.toString());

        System.out.println("Find by plate AA7777BB -> " + registry.findCarByPlate("AA7777BB"));
        System.out.println("Find owner OWN-002 -> " + registry.findOwnerById("OWN-002"));
    }
}
