package Entities_Utility_Classes.Expected_Entities;

import Entities_Utility_Classes.Abstract_Entities.ExpectedEntity;

import java.util.List;

public class Film extends ExpectedEntity {
    private String title; // Title replaces name
    private String episodeId;
    private String openingCrawl;
    private String director;
    private String producer;
    private String releaseDate;
    private List<String> characters;
    private List<String> planets;
    private List<String> starships;
    private List<String> vehicles;
    private List<String> species;

    // Override getName to return title
    @Override
    public String getName() { return title; }
    @Override
    public void setName(String title) { this.title = title; }

    public String getEpisodeId() { return episodeId; }
    public void setEpisodeId(String episodeId) { this.episodeId = episodeId; }

    public String getOpeningCrawl() { return openingCrawl; }
    public void setOpeningCrawl(String openingCrawl) { this.openingCrawl = openingCrawl; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public String getProducer() { return producer; }
    public void setProducer(String producer) { this.producer = producer; }

    public String getReleaseDate() { return releaseDate; }
    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }

    public List<String> getCharacters() { return characters; }
    public void setCharacters(List<String> characters) { this.characters = characters; }

    public List<String> getPlanets() { return planets; }
    public void setPlanets(List<String> planets) { this.planets = planets; }

    public List<String> getStarships() { return starships; }
    public void setStarships(List<String> starships) { this.starships = starships; }

    public List<String> getVehicles() { return vehicles; }
    public void setVehicles(List<String> vehicles) { this.vehicles = vehicles; }

    public List<String> getSpecies() { return species; }
    public void setSpecies(List<String> species) { this.species = species; }

    @Override
    public String getInfo() {
        return "Film: " + getName();
    }
}

