class InvalidAgeException extends Exception
{
    InvalidAgeException (String msg)
    {
        System.out.println(msg);
    }
}

class Main {
    public static void main(String args[])
    {   
       
        try {
               vote(17);   
        }
        catch(Exception e)
        {
           System.out.println(e); 
        }
        
    }
    public static void vote (int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("not valid for voting");
        }
        else{
               System.out.println("Eligible for voting");
        }
    }
}