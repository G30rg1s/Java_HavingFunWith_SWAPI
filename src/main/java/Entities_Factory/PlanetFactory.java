package Entities_Factory;

import Entities_Utility_Classes.Expected_Entities.Planet;
import Tools.FileParser;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

public class PlanetFactory {


    public static Planet createPlanet(String name, String rotationPeriod, String orbitalPeriod, String diameter,
                                      String climate, String gravity, String terrain, String surfaceWater,
                                      String population, List<String> residents, List<String> films,
                                      String created, String edited, String url) {
        Planet planet = new Planet();
        planet.setName(name);
        planet.setRotationPeriod(rotationPeriod);
        planet.setOrbitalPeriod(orbitalPeriod);
        planet.setDiameter(diameter);
        planet.setClimate(climate);
        planet.setGravity(gravity);
        planet.setTerrain(terrain);
        planet.setSurfaceWater(surfaceWater);
        planet.setPopulation(population);
        planet.setResidents(residents);
        planet.setFilms(films);
        planet.setCreated(created);
        planet.setEdited(edited);
        planet.setUrl(url);

        return planet;
    }

    public static Planet createPlanetFromFile(String filename) throws IOException {

        List<Object> parsedData = FileParser.parseFile(filename, 14);

        try {
            Method createPlanetMethod = PlanetFactory.class.getDeclaredMethod("createPlanet",
                    String.class, String.class, String.class, String.class, String.class,
                    String.class, String.class, String.class, String.class,
                    List.class, List.class, String.class, String.class, String.class);

            return (Planet) createPlanetMethod.invoke(null, parsedData.toArray());

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to create Planet object from file", e);
        }
    }
}