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
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.buildGraph();
        graph.showGraph();
        
        QueueGraph q = new QueueGraph();
        q.enqueue(graph.getWorkers().get(0));
        q.enqueue(graph.getWorkers().get(1));
        q.enqueue(graph.getWorkers().get(2));
        
        System.out.println(graph.getWorkers().get(0).getCost());
        System.out.println(graph.getWorkers().get(1).getCost());
        System.out.println(graph.getWorkers().get(2).getCost());
        System.out.println(q.getWorker().getId());
        
        
        /*String[] source = new String[2];
        String[] destination = new String[2];
        source[0] = "-15.836073";
        source[1] = "-47.912019";
        destination[0] = "-15.867068";
        destination[1] = "-47.761822";
        
        ConvertCoordinates cc = new ConvertCoordinates(source, destination);
        System.out.println("A distância entre os dois pontos é de " 
                + cc.getDistance() + " Km");*/

    }
}
