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
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        
        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(graph.getVertices().get(3));

        System.out.println(dijkstra.getShortestPathTo(graph.getVertices().get(7)));
    }
}
