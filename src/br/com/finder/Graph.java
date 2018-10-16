/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.finder;

import java.util.*;

/**
 *
 * @author kimberlyplima
 */
public class Graph {
    ReadFile rd = new ReadFile();
    List<String[]> data = rd.readFile();
    List<Worker> vertices = new LinkedList();
    List<Edge> edges = new LinkedList();
    int workerId = 0;
    
    public void buildGraph(){
        for(String[] worker : data){
            Worker vertex = new Worker(workerId++, worker);
            
            if(!vertices.contains(vertex)){
                vertices.add(vertex);
            } else System.out.println("Profissional já cadastrado!");
        }
        
        for(int i = 0; i < vertices.size(); i++){
            for(int j = 0; j < vertices.size(); j++){
                if(!vertices.get(i).equals(vertices.get(j))){
                    Edge edge = new Edge(vertices.get(i), vertices.get(j));
                    edges.add(edge);
                }
            }
        }
    }
    
    public void showGraph(){
        for(Worker worker : vertices){
            System.out.print(worker.getName() + " = ");
            System.out.print("{");
            
            for(Edge edge : edges){
                if(edge.getSource().getId() == worker.getId()){
                    System.out.print(edge.getDestination().getName() + ", ");
                }
            }
            
            System.out.println("}");
        }
    }
}
