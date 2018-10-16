/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijkstra;

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
    }
}
