package Entities_Factory;

import Entities_Utility_Classes.Expected_Entities.Root;

public class RootsFactory {


    public static Root createRoot(String peopleUrl, String planetsUrl, String filmsUrl, String speciesUrl, String vehiclesUrl, String starshipsUrl) {
        Root root = new Root();
        root.setPeople(peopleUrl);
        root.setPlanets(planetsUrl);
        root.setFilms(filmsUrl);
        root.setSpecies(speciesUrl);
        root.setVehicles(vehiclesUrl);
        root.setStarships(starshipsUrl);

        return root;
    }
}
