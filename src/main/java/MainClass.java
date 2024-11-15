import Entities_Factory.*;
import Entities_Utility_Classes.Expected_Entities.*;
import Tools.InstancePrinter;

import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("THESE ARE THE EXPECTED RESPONSES FOR SOME ENDPOINTS\n ");

        try {
            People luke = PeopleFactory.createPeopleFromFile("People_LukeSkywalker.txt");
            InstancePrinter.printInstanceDetails(luke);
        } catch (IOException e) {
            System.err.println("Failed to create People object from file: " + e.getMessage());
        }

        try {
            Starship corvette = StarshipFactory.createStarshipFromFile("Starship_CR90.txt");
            InstancePrinter.printInstanceDetails(corvette);
        } catch (IOException e) {
            System.err.println("Failed to create Starship object from file: " + e.getMessage());
        }

        try {
            Species human = SpeciesFactory.createSpeciesFromFile("Species_human.txt");
            InstancePrinter.printInstanceDetails(human);
        } catch (IOException e) {
            System.err.println("Failed to create Species object from file: " + e.getMessage());
        }

        try {
            Film newHope = FilmFactory.createFilmFromFile("src/main/resources/Film_ANewHope.txt");
            InstancePrinter.printInstanceDetails(newHope);
        } catch (IOException e) {
            System.err.println("Failed to create Film object from file: " + e.getMessage());
        }

        try {
            Planet tatooine = PlanetFactory.createPlanetFromFile("Planet_Tatooine.txt");
            InstancePrinter.printInstanceDetails(tatooine);
        } catch (IOException e) {
            System.err.println("Failed to create Planet object from file: " + e.getMessage());
        }

        try {
            Vehicle sandCrawler = VehicleFactory.createVehicleFromFile("Vehicle_SandCrawler.txt");
            InstancePrinter.printInstanceDetails(sandCrawler);
        } catch (IOException e) {
            System.err.println("Failed to create Vehicle object from file: " + e.getMessage());
        }
    }
}


