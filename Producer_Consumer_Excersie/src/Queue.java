
import Exception.QueueEmptyException;
import Exception.QueueFullException;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class Queue<T> {
    private LinkedList<T> queue = new LinkedList<>();
    private int maxsize = 3;
    
    public void push(T e) throws Exception {
        if(queue.size()<=3){
           queue.add(e); 
        }else{
            throw new QueueFullException();
        }        
    }
    
    public T pull() throws Exception {
        if(!queue.isEmpty()){
            return queue.poll();
        }else{
            throw new QueueEmptyException();
        }       
    }
}
