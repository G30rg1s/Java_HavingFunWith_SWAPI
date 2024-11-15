package Entities_Utility_Classes.Expected_Entities;

import Entities_Utility_Classes.Abstract_Entities.ExpectedEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class People extends ExpectedEntity {

    @JsonProperty("name")
    private String name;

    @JsonProperty("height")
    private String height;

    @JsonProperty("mass")
    private String mass;

    @JsonProperty("hair_color")
    private String hairColor;

    @JsonProperty("skin_color")
    private String skinColor;

    @JsonProperty("eye_color")
    private String eyeColor;

    @JsonProperty("birth_year")
    private String birthYear;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("homeworld")
    private String homeworld;

    @JsonProperty("films")
    private List<String> films;

    @JsonProperty("species")
    private List<String> species;

    @JsonProperty("vehicles")
    private List<String> vehicles;

    @JsonProperty("starships")
    private List<String> starships;

    @JsonProperty("created")
    private String created;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("url")
    private String url;

    public String getHeight() { return height; }
    public void setHeight(String height) { this.height = height; }

    public String getMass() { return mass; }
    public void setMass(String mass) { this.mass = mass; }

    public String getHairColor() { return hairColor; }
    public void setHairColor(String hairColor) { this.hairColor = hairColor; }

    public String getSkinColor() { return skinColor; }
    public void setSkinColor(String skinColor) { this.skinColor = skinColor; }

    public String getEyeColor() { return eyeColor; }
    public void setEyeColor(String eyeColor) { this.eyeColor = eyeColor; }

    public String getBirthYear() { return birthYear; }
    public void setBirthYear(String birthYear) { this.birthYear = birthYear; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getHomeworld() { return homeworld; }
    public void setHomeworld(String homeworld) { this.homeworld = homeworld; }

    public List<String> getFilms() { return films; }
    public void setFilms(List<String> films) { this.films = films; }

    public List<String> getSpecies() { return species; }
    public void setSpecies(List<String> species) { this.species = species; }

    public List<String> getVehicles() { return vehicles; }
    public void setVehicles(List<String> vehicles) { this.vehicles = vehicles; }

    public List<String> getStarships() { return starships; }
    public void setStarships(List<String> starships) { this.starships = starships; }

    @Override
    public String getInfo() {
        return "Character: " + getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People)) return false;
        if (!super.equals(o)) return false; // Call the equals() of ExpectedEntity
        People people = (People) o;
        return Objects.equals(height, people.height) &&
                Objects.equals(mass, people.mass) &&
                Objects.equals(hairColor, people.hairColor) &&
                Objects.equals(skinColor, people.skinColor) &&
                Objects.equals(eyeColor, people.eyeColor) &&
                Objects.equals(birthYear, people.birthYear) &&
                Objects.equals(gender, people.gender) &&
                Objects.equals(homeworld, people.homeworld) &&
                Objects.equals(films, people.films) &&
                Objects.equals(species, people.species) &&
                Objects.equals(vehicles, people.vehicles) &&
                Objects.equals(starships, people.starships);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, mass, hairColor, skinColor, eyeColor, birthYear,
                gender, homeworld, films, species, vehicles, starships);
    }

}
