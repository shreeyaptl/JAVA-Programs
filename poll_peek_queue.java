import java.util.*;

class Main{
   public static void main(String args[]){
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        
        pQueue.add(10);
        pQueue.add(13);
        pQueue.add(20);
        pQueue.add(18);
        
        System.out.println(pQueue);
        
        System.out.println("top element is:" + pQueue.peek()); // prints top element of pQueue
        
        System.out.println("top element and removing it :" + pQueue.poll()); //printing the top element and 
                                                                             //removing it from queue
        
        System.out.println("printing top element after removing the top element " + pQueue.peek());
        
    }
}