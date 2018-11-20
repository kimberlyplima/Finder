/*
 * Classname		Edge
 * Version information	x.x.xx
 * Date                 20/11/2018 21:11
 * Author               Kimberly P. Lima && Laercio Santos
 * Copyright notice     
 */
package finder.com.br.application;

/**
 *
 * @author kimberlyplima
 */
public class Edge {
    private double weight;
    private Vertex source;
    private Vertex destination;

    public Edge(Vertex source, Vertex destination) {
        ConvertCoordinates cc = new ConvertCoordinates(source.getLocation(), 
                destination.getLocation());
        
        this.weight = cc.getDistance();
        this.source = source;
        this.destination = destination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getDestination() {
        return destination;
    }

    public void setDestination(Vertex destination) {
        this.destination = destination;
    }
}
