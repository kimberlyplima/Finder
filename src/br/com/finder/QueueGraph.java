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
public class QueueGraph{
    
    private Queue<Worker> queue;
    
    public QueueGraph(){
        queue = new PriorityQueue();
    }
    
    /*
     * Adds a new element in the queue.
     */
    public void enqueue(Worker vertex){
        queue.add(vertex);
    }
    
    /*
     * Removes the first element in the queue.
     */
    public Worker dequeue(){
        return queue.remove();
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
        return queue.peek();
    }
}
