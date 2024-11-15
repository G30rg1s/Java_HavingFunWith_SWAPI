package Entities_Factory;

import Entities_Utility_Classes.Expected_Entities.Species;
import Tools.FileParser;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

public class SpeciesFactory {

    public static Species createSpecies(String name, String classification, String designation, String averageHeight,
                                        List<String> skinColors, List<String> hairColors, List<String> eyeColors,
                                        String averageLifespan, String homeworld, String language,
                                        List<String> people, List<String> films, String created, String edited,
                                        String url) {
        Species species = new Species();
        species.setName(name);
        species.setClassification(classification);
        species.setDesignation(designation);
        species.setAverageHeight(averageHeight);
        species.setSkinColors(skinColors);
        species.setHairColors(hairColors);
        species.setEyeColors(eyeColors);
        species.setAverageLifespan(averageLifespan);
        species.setHomeworld(homeworld);
        species.setLanguage(language);
        species.setPeople(people);
        species.setFilms(films);
        species.setCreated(created);
        species.setEdited(edited);
        species.setUrl(url);

        return species;
    }

    public static Species createSpeciesFromFile(String filename) throws IOException {
        List<Object> parsedData = FileParser.parseFile(filename, 15);

        try {
            // Method signature for `createSpecies`
            Method createSpeciesMethod = SpeciesFactory.class.getDeclaredMethod("createSpecies",
                    String.class, String.class, String.class, String.class, List.class,
                    List.class, List.class, String.class, String.class, String.class,
                    List.class, List.class, String.class, String.class, String.class);

            return (Species) createSpeciesMethod.invoke(null, parsedData.toArray());

        } catch (IllegalArgumentException e) {
            System.err.println("Argument type mismatch: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Failed to create Species object due to argument type mismatch", e);

        } catch (ReflectiveOperationException e) {
            System.err.println("Reflection operation failed: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Failed to create Species object due to reflection error", e);
        }
    }
}

