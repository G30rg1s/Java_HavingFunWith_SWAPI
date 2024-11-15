package Entities_Utility_Classes.Expected_Entities;

import Entities_Utility_Classes.Abstract_Entities.ExpectedEntity;
import java.util.List;

public class Planet extends ExpectedEntity {
    private String rotationPeriod;
    private String orbitalPeriod;
    private String diameter;
    private String climate;
    private String gravity;
    private String terrain;
    private String surfaceWater;
    private String population;
    private List<String> residents;
    private List<String> films;

    // Getters and Setters for planet-specific fields
    public String getRotationPeriod() { return rotationPeriod; }
    public void setRotationPeriod(String rotationPeriod) { this.rotationPeriod = rotationPeriod; }

    public String getOrbitalPeriod() { return orbitalPeriod; }
    public void setOrbitalPeriod(String orbitalPeriod) { this.orbitalPeriod = orbitalPeriod; }

    public String getDiameter() { return diameter; }
    public void setDiameter(String diameter) { this.diameter = diameter; }

    public String getClimate() { return climate; }
    public void setClimate(String climate) { this.climate = climate; }

    public String getGravity() { return gravity; }
    public void setGravity(String gravity) { this.gravity = gravity; }

    public String getTerrain() { return terrain; }
    public void setTerrain(String terrain) { this.terrain = terrain; }

    public String getSurfaceWater() { return surfaceWater; }
    public void setSurfaceWater(String surfaceWater) { this.surfaceWater = surfaceWater; }

    public String getPopulation() { return population; }
    public void setPopulation(String population) { this.population = population; }

    public List<String> getResidents() { return residents; }
    public void setResidents(List<String> residents) { this.residents = residents; }

    public List<String> getFilms() { return films; }
    public void setFilms(List<String> films) { this.films = films; }

    @Override
    public String getInfo() {
        return "Planet: " + getName();
    }
}

