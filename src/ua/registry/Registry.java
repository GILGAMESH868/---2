package ua.registry;

import java.util.*;

public class Registry {
    private Map<String, Owner> ownersById = new HashMap<>();
    private Map<String, Car> carsByVin = new HashMap<>();
    private Map<String, Car> carsByPlate = new HashMap<>();

    public Registry() { }

    public void addOwner(Owner owner) {
        if (owner == null || owner.getId() == null) return;
        ownersById.put(owner.getId(), owner);
    }

    public void addCar(Car car) {
        if (car == null || car.getVin() == null) return;
        carsByVin.put(car.getVin(), car);
        if (car.getPlate() != null) carsByPlate.put(car.getPlate(), car);
    }

    public Car findCarByPlate(String plate) {
        return carsByPlate.get(plate);
    }

    public Owner findOwnerById(String ownerId) {
        return ownersById.get(ownerId);
    }

    public void assignOwnerToCar(String ownerId, String vin) {
        Car car = carsByVin.get(vin);
        Owner owner = ownersById.get(ownerId);
        if (car != null && owner != null) {
            car.setOwnerId(ownerId);
        }
    }

    public List<Car> getAllCars() { return new ArrayList<>(carsByVin.values()); }
    public List<Owner> getAllOwners() { return new ArrayList<>(ownersById.values()); }

    public void exportReport() { /* placeholder */ }

    @Override
    public String toString() {
        return "Registry{" +
                "owners=" + ownersById.size() +
                ", cars=" + carsByVin.size() +
                '}';
    }
}
