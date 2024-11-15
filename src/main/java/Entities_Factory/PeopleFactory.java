package Entities_Factory;

import Entities_Utility_Classes.Expected_Entities.People;
import Tools.FileParser;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

public class PeopleFactory {

    public static People createPeople(String name, String height, String mass, String hairColor, String skinColor,
                                      String eyeColor, String birthYear, String gender, String homeworld,
                                      List<String> films, List<String> species, List<String> vehicles,
                                      List<String> starships, String created, String edited, String url) {
        People people = new People();
        people.setName(name);
        people.setHeight(height);
        people.setMass(mass);
        people.setHairColor(hairColor);
        people.setSkinColor(skinColor);
        people.setEyeColor(eyeColor);
        people.setBirthYear(birthYear);
        people.setGender(gender);
        people.setHomeworld(homeworld);
        people.setFilms(films);
        people.setSpecies(species);
        people.setVehicles(vehicles);
        people.setStarships(starships);
        people.setCreated(created);
        people.setEdited(edited);
        people.setUrl(url);

        return people;
    }

    public static People createPeopleFromFile(String filename) throws IOException {

        List<Object> parsedData = FileParser.parseFile(filename, 16);

        try {

            Method createPeopleMethod = PeopleFactory.class.getDeclaredMethod("createPeople",
                    String.class, String.class, String.class, String.class, String.class,
                    String.class, String.class, String.class, String.class,
                    List.class, List.class, List.class, List.class,
                    String.class, String.class, String.class);


            return (People) createPeopleMethod.invoke(null, parsedData.toArray());

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to create People object from file", e);
        }
    }
}
