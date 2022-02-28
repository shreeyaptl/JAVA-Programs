public class arithmetic_exception
{
    public static void main(String args[])
    {
        try 
        {
            int num = 100/0;
            
        }catch(ArithmeticException e)
            {   
            System.out.println(e);
            }
        System.out.println("rest of the code executed");
        
    }
}