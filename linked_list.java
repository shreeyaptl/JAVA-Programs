import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String> ();
        
        list.add("kim woo bin");
        list.add("lee min ho");
        list.add("nam jo hyuk");
        list.add("ryan");
        
        System.out.println("displaying linked list" + list);
        
        
        list.remove("ryan");
        System.out.println("after removal "+ list);
    }
}