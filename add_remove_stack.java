import java.util.*;
public class Main{
    
    public static void main(String args[]){
       Stack<String> stack = new Stack<String>();
       
       stack.add("Welcome");
       stack.add("To");
       stack.add("Geeks");
       stack.add("4");
       stack.add("Geeks");
       
       System.out.println("Stack" + stack);
       
       stack.removeAllElements();  //to remove all elements from stack
       
       System.out.println("The final stack:" + stack);
    }
}