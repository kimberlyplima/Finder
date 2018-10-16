/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijkstra;

/**
 *
 * @author kimberlyplima
 */
public class Edge {
    private Worker source;
    private Worker destination;
    
    public Edge(Worker source, Worker destination){
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
    
    
}
