/*
 * Classname		Dijkstra
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
import java.util.*;

public class Dijkstra {
    public void computePath(Vertex sourceVertex) {
        sourceVertex.setMinDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);

        while (!priorityQueue.isEmpty()) {
            Vertex vertex = priorityQueue.poll();

            for (Edge edge : vertex.getEdges()) {
                Vertex v = edge.getDestination();
                double weight = edge.getWeight();
                double minDistance = vertex.getMinDistance() + weight;

                if (minDistance < v.getMinDistance()) {
                    priorityQueue.remove(vertex);
                    v.setPreviosVertex(vertex);
                    v.setMinDistance(minDistance);
                    priorityQueue.add(v);
                }
            }
        }
    }
    
    public List<Vertex> getShortestPath(List<Vertex> targets){
        List<Vertex> path = new LinkedList();
        
        for(Vertex v : targets){
            for (Vertex vertex = v; vertex != null; vertex = vertex.getPreviosVertex()) {
            path.add(vertex);
            }
            
            Dijkstra d = new Dijkstra();
            d.computePath(v);
        }
        
        Collections.reverse(path);
        return path;
    }
    
    public List<Vertex> getShortestPathTo(Vertex targetVertex) {
        List<Vertex> path = new ArrayList<>();

        for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPreviosVertex()) {
            path.add(vertex);
        }

        Collections.reverse(path);
        return path;
    }
}
