/*
 *
 */
package br.com.finder;

/**
 *
 * @author kimberlyplima
 */
public class Worker {
    private int id;
    private int cost;
    private String name;
    private String[] location;
    private String occupation;
    private boolean available;
    
    public Worker(int id, String[] data){
        this.id = id;
        this.cost = 100;        
        this.name = data[0];
        this.location = data[1].split(",");
        this.occupation = data[2];
        this.available = Boolean.getBoolean(data[3]);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the location
     */
    public String[] getcoordinates() {
        return getLocation();
    }

    /**
     * @param coordinates the location to set
     */
    public void setcoordinates(String[] coordinates) {
        this.setLocation(coordinates);
    }

    /**
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return the available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the location
     */
    public String[] getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String[] location) {
        this.location = location;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }
}
