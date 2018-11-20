/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
