/*
 * Classname		(nome da classe)
 * Version information	(versionamento)
 * Date                 (data e hora)
 * Author               (autor)
 * Copyright notice     (descrição detalhada da classe e métodos)
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
    List<Relations> edges = new LinkedList();
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
                    Relations edge = new Relations(vertices.get(i), vertices.get(j));
                    edges.add(edge);
                }
            }
        }
    }
    
    public void showGraph(){
        for(Worker worker : vertices){
            System.out.print(worker.getName() + " = ");
            System.out.print("{");
            
            for(Relations edge : edges){
                if(edge.getSource().getId() == worker.getId()){
                    System.out.print(edge.getDestination().getName() + ", ");
                }
            }
            
            System.out.println("}");
        }
    }
    
    public List<Worker> getWorkers(){
        return vertices;
    }
    
    public List<Relations> getRelations(){
        return edges;
    }
}
