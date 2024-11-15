package Entities_Utility_Classes.Expected_Entities;

import Entities_Utility_Classes.Abstract_Entities.ExpectedEntity;
import java.util.List;

public class Species extends ExpectedEntity {
    private String classification;
    private String designation;
    private String averageHeight;
    private List<String> skinColors;
    private List<String> hairColors;
    private List<String> eyeColors;
    private String averageLifespan;
    private String homeworld;
    private String language;
    private List<String> people;
    private List<String> films;

    // Getters and Setters
    public String getClassification() { return classification; }
    public void setClassification(String classification) { this.classification = classification; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public String getAverageHeight() { return averageHeight; }
    public void setAverageHeight(String averageHeight) { this.averageHeight = averageHeight; }

    public List<String> getSkinColors() { return skinColors; }
    public void setSkinColors(List<String> skinColors) { this.skinColors = skinColors; }

    public List<String> getHairColors() { return hairColors; }
    public void setHairColors(List<String> hairColors) { this.hairColors = hairColors; }

    public List<String> getEyeColors() { return eyeColors; }
    public void setEyeColors(List<String> eyeColors) { this.eyeColors = eyeColors; }

    public String getAverageLifespan() { return averageLifespan; }
    public void setAverageLifespan(String averageLifespan) { this.averageLifespan = averageLifespan; }

    public String getHomeworld() { return homeworld; }
    public void setHomeworld(String homeworld) { this.homeworld = homeworld; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public List<String> getPeople() { return people; }
    public void setPeople(List<String> people) { this.people = people; }

    public List<String> getFilms() { return films; }
    public void setFilms(List<String> films) { this.films = films; }

    @Override
    public String getInfo() {
        return "Species: " + getName();
    }
}
