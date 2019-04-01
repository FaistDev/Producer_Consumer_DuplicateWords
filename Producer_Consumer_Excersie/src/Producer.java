
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class Producer extends Thread {
    private Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try(BufferedReader br = new BufferedReader(new FileReader(new File("")))){
            
        }catch(Exception e){
            
        }
    }
    
    
    
}
