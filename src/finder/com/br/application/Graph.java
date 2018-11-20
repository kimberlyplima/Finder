/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finder.com.br.application;

import java.util.*;

/**
 *
 * @author kimberlyplima
 */
public class Graph {
    private ReadFile rd = new ReadFile();
    private List<String[]> data = rd.readFile();   
    private List<Vertex> vertices = new LinkedList();
    private Vertex v;
    
    public Graph(){
        for(String[] worker : data){
            this.v = new Vertex(worker);
            if(!vertices.contains(v)){
                vertices.add(v);
            }
        }
        
        for(int i = 0; i < vertices.size(); i++){
            for(int j = 0; j < vertices.size(); j++){
                if(!vertices.get(i).equals(vertices.get(j))){
                    Edge edge = new Edge(getVertices().get(i), getVertices().get(j));
                    vertices.get(i).addNeighbour(edge);
                }
            }
        }
    }

    /**
     * @return the vertices
     */
    public List<Vertex> getVertices() {
        return vertices;
    }
}
