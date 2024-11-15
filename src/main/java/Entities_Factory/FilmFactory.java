package Entities_Factory;

import Entities_Utility_Classes.Expected_Entities.Film;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FilmFactory {

    public static Film createFilm(String title, String episodeId, String openingCrawl, String director, String producer,
                                  String releaseDate, List<String> characters, List<String> planets,
                                  List<String> starships, List<String> vehicles, List<String> species,
                                  String created, String edited, String url) {
        Film film = new Film();
        film.setName(title);
        film.setEpisodeId(episodeId);
        film.setOpeningCrawl(openingCrawl);
        film.setDirector(director);
        film.setProducer(producer);
        film.setReleaseDate(releaseDate);
        film.setCharacters(characters);
        film.setPlanets(planets);
        film.setStarships(starships);
        film.setVehicles(vehicles);
        film.setSpecies(species);
        film.setCreated(created);
        film.setEdited(edited);
        film.setUrl(url);

        return film;
    }

    public static Film createFilmFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String title = reader.readLine();
            String episodeId = reader.readLine();
            String openingCrawl = reader.readLine();
            String director = reader.readLine();
            String producer = reader.readLine();
            String releaseDate = reader.readLine();

            // Parse the lists
            List<String> characters = Arrays.asList(reader.readLine().split(","));
            List<String> planets = Arrays.asList(reader.readLine().split(","));
            List<String> starships = Arrays.asList(reader.readLine().split(","));
            List<String> vehicles = Arrays.asList(reader.readLine().split(","));
            List<String> species = Arrays.asList(reader.readLine().split(","));

            // Parse the remaining string values
            String created = reader.readLine();
            String edited = reader.readLine();
            String url = reader.readLine();

            // Create and return the Film object
            return new FilmFactory().createFilm(
                    title, episodeId, openingCrawl, director, producer,
                    releaseDate, characters, planets, starships, vehicles, species,
                    created, edited, url
            );
        }
    }
}
