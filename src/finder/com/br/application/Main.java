/*
 * Classname		Main
 * Version information	x.x.xx
 * Date                 20/11/2018 21:11
 * Author               Kimberly P. Lima && Laercio Santos
 * Copyright notice     
 */
package finder.com.br.application;

import java.util.*;

/**
 *
 * @author kimberlyplima
 */
public class Main {
    public static void main(String[] args) {
        List<Vertex> targets = new LinkedList();
        List<Integer> options = new LinkedList();
        List<Vertex> available = new LinkedList();
        int opt = 0;
        String opt2 = new String();
        double dist = 0;
        
        Graph graph = new Graph();
        
        System.out.println("Seja bem vindo ao Finder. ");
        System.out.println();
        System.out.println("Informe a distância máxima de pesquisa ");
        dist = new Scanner(System.in).nextDouble();

        System.out.println("Escolha abaixo o profissional que deseja contratar");
        System.out.println();
        
        for(Edge e : graph.getVertices().get(0).getEdges()){
            if(e.getWeight() <= dist){
                if(e.getDestination().isAvailable()){
                    available.add(e.getDestination());
                }
            }
        }
        
        int cont = 0;
        for(Vertex v : available){
            System.out.print("(" + ++cont + ") Nome: " + v.getName() + " | ");
            System.out.println("Profissão: " + v.getOccupation());
        }

        System.out.println();
        
        while(!opt2.equals("n")){
            opt = new Scanner(System.in).nextInt();
            options.add(opt);
            
            System.out.println("Deseja selecionar mais profissionais? (s/n)");
            opt2 = new Scanner(System.in).nextLine();
            System.out.println();
        }
        
        Dijkstra d = new Dijkstra();
        d.computePath(graph.getVertices().get(0));

        for(Integer i : options){
            targets.add(graph.getVertices().get(i));
        }
        
       System.out.println(d.getShortestPath(targets));
        
    }
}
