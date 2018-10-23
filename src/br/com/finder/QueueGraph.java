/*
 * This is a simple implementation of a queue structure using Queue interface
 * and linkedlists.
 */
package br.com.finder;

import java.util.*;

/**
 *
 * @author kimberlyplima
 */
public class QueueGraph {
    
    private List<Worker> queue;
    
    public QueueGraph(){
        queue = new LinkedList();
    }
    
    /*
     * Adds a new element in the queue.
     */
    public void enqueue(Worker Worker){
        queue.add(Worker);
    }
    
    /*
     * Removes the minor element in the queue.
     */
    public void dequeue(){
        int minorValue = Integer.MAX_VALUE;
        Worker q = new Worker(100, null);
        
        for(int i = 0; i < queue.size(); i++){
            if(queue.get(i).getCost() < minorValue){
                minorValue = queue.get(i).getCost();
                q = queue.get(i);
            }
        }
        
        queue.remove(q);
    }
    
    /*
     * Returns que number of elements in the queue.
     */
    public int queueSize(){
        return queue.size();
    }
    
    /*
     * Checks if the queue is empty. If it is, returns true.
     */
    public Boolean isEmpty(){
        return queue.isEmpty();
    }
    
    /*
     * Returns the first element of the queue.
     */
    public Worker getWorker(){
        int minorValue = Integer.MAX_VALUE;
        Worker q = new Worker(100, null);
        
        for(int i = 0; i < queue.size(); i++){
            if(queue.get(i).getCost() < minorValue){
                minorValue = queue.get(i).getCost();
                q = queue.get(i);
            }
        }
        
        return q;
    }
}
