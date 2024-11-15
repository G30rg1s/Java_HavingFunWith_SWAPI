package Entities_Factory;

import Entities_Utility_Classes.Expected_Entities.Vehicle;
import Tools.FileParser;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

public class VehicleFactory {


    public static Vehicle createVehicle(String name, String model, String manufacturer, String costInCredits,
                                        String length, String maxAtmospheringSpeed, String crew, String passengers,
                                        String cargoCapacity, String consumables, String vehicleClass,
                                        List<String> pilots, List<String> films, String created, String edited, String url) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName(name);
        vehicle.setModel(model);
        vehicle.setManufacturer(manufacturer);
        vehicle.setCostInCredits(costInCredits);
        vehicle.setLength(length);
        vehicle.setMaxAtmospheringSpeed(maxAtmospheringSpeed);
        vehicle.setCrew(crew);
        vehicle.setPassengers(passengers);
        vehicle.setCargoCapacity(cargoCapacity);
        vehicle.setConsumables(consumables);
        vehicle.setVehicleClass(vehicleClass);
        vehicle.setPilots(pilots);
        vehicle.setFilms(films);
        vehicle.setCreated(created);
        vehicle.setEdited(edited);
        vehicle.setUrl(url);

        return vehicle;
    }

    public static Vehicle createVehicleFromFile(String filename) throws IOException {
        List<Object> parsedData = FileParser.parseFile(filename, 16);

        try {
            Method createVehicleMethod = VehicleFactory.class.getDeclaredMethod("createVehicle",
                    String.class, String.class, String.class, String.class, String.class,
                    String.class, String.class, String.class, String.class, String.class,
                    String.class, List.class, List.class, String.class, String.class, String.class);

            return (Vehicle) createVehicleMethod.invoke(null, parsedData.toArray());

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to create Vehicle object from file", e);
        }
    }
}