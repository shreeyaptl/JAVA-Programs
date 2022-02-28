public class sumofnumber_exceptionhandling{
    public static void main(String[] args)
    {
        try {
            int x =5;
            int y =6;
            int sum = x + y;
            System.out.println(sum);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}