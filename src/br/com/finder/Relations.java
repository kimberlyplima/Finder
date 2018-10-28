/*
 * Classname		(nome da classe)
 * Version information	(versionamento)
 * Date                 (data e hora)
 * Author               (autor)
 * Copyright notice     (descrição detalhada da classe e métodos)
 */
package br.com.finder;

/**
 *
 * @author kimberlyplima
 */
public class Relations {
    private Worker source;
    private Worker destination;
    private double distance;
    
    public Relations(Worker source, Worker destination){
        ConvertCoordinates cc = new ConvertCoordinates(source.getcoordinates(), 
                destination.getcoordinates());
        this.distance = cc.getDistance();
        this.source = source;
        this.destination = destination;
    }

    /**
     * @return the source
     */
    public Worker getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(Worker source) {
        this.source = source;
    }

    /**
     * @return the destination
     */
    public Worker getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(Worker destination) {
        this.destination = destination;
    }

    /**
     * @return the distance
     */
    public double getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    
}
