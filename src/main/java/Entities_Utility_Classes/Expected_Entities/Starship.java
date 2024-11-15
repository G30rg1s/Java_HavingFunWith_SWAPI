package Entities_Utility_Classes.Expected_Entities;

import Entities_Utility_Classes.Abstract_Entities.ExpectedEntity;
import java.util.List;

public class Starship extends ExpectedEntity {
    private String model;
    private String manufacturer;
    private String costInCredits;
    private String length;
    private String maxAtmospheringSpeed;
    private String crew;
    private String passengers;
    private String cargoCapacity;
    private String consumables;
    private String hyperdriveRating;
    private String mglt;
    private String starshipClass;
    private List<String> pilots;
    private List<String> films;

    // Getters and Setters for starship-specific fields
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public String getCostInCredits() { return costInCredits; }
    public void setCostInCredits(String costInCredits) { this.costInCredits = costInCredits; }

    public String getLength() { return length; }
    public void setLength(String length) { this.length = length; }

    public String getMaxAtmospheringSpeed() { return maxAtmospheringSpeed; }
    public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) { this.maxAtmospheringSpeed = maxAtmospheringSpeed; }

    public String getCrew() { return crew; }
    public void setCrew(String crew) { this.crew = crew; }

    public String getPassengers() { return passengers; }
    public void setPassengers(String passengers) { this.passengers = passengers; }

    public String getCargoCapacity() { return cargoCapacity; }
    public void setCargoCapacity(String cargoCapacity) { this.cargoCapacity = cargoCapacity; }

    public String getConsumables() { return consumables; }
    public void setConsumables(String consumables) { this.consumables = consumables; }

    public String getHyperdriveRating() { return hyperdriveRating; }
    public void setHyperdriveRating(String hyperdriveRating) { this.hyperdriveRating = hyperdriveRating; }

    public String getMglt() { return mglt; }
    public void setMglt(String mglt) { this.mglt = mglt; }

    public String getStarshipClass() { return starshipClass; }
    public void setStarshipClass(String starshipClass) { this.starshipClass = starshipClass; }

    public List<String> getPilots() { return pilots; }
    public void setPilots(List<String> pilots) { this.pilots = pilots; }

    public List<String> getFilms() { return films; }
    public void setFilms(List<String> films) { this.films = films; }

    @Override
    public String getInfo() {
        return "Starship: " + getName();
    }
}
