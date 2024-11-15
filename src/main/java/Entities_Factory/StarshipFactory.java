package Entities_Factory;

import Entities_Utility_Classes.Expected_Entities.Starship;
import Tools.FileParser;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

public class StarshipFactory {

    // Main method to create a Starship with exact parameters
    public static Starship createStarship(String name, String model, String manufacturer, String costInCredits,
                                          String length, String maxAtmospheringSpeed, String crew, String passengers,
                                          String cargoCapacity, String consumables, String hyperdriveRating,
                                          String mglt, String starshipClass, List<String> pilots, List<String> films,
                                          String created, String edited, String url) {
        Starship starship = new Starship();
        starship.setName(name);
        starship.setModel(model);
        starship.setManufacturer(manufacturer);
        starship.setCostInCredits(costInCredits);
        starship.setLength(length);
        starship.setMaxAtmospheringSpeed(maxAtmospheringSpeed);
        starship.setCrew(crew);
        starship.setPassengers(passengers);
        starship.setCargoCapacity(cargoCapacity);
        starship.setConsumables(consumables);
        starship.setHyperdriveRating(hyperdriveRating);
        starship.setMglt(mglt);
        starship.setStarshipClass(starshipClass);
        starship.setPilots(pilots);
        starship.setFilms(films);
        starship.setCreated(created);
        starship.setEdited(edited);
        starship.setUrl(url);

        return starship;
    }

    // Method to create Starship from file using reflection
    public static Starship createStarshipFromFile(String filename) throws IOException {

        List<Object> parsedData = FileParser.parseFile(filename, 18);

        try {
            // Ensure this matches the exact signature of `createStarship`
            Method createStarshipMethod = StarshipFactory.class.getDeclaredMethod("createStarship",
                    String.class, String.class, String.class, String.class, String.class,
                    String.class, String.class, String.class, String.class, String.class,
                    String.class, String.class, String.class, List.class,
                    List.class, String.class, String.class, String.class);

            return (Starship) createStarshipMethod.invoke(null, parsedData.toArray());

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to create Starship object from file", e);
        }
    }
}
