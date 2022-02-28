public class Arrayoutofbound {
    public static void main(String args[])
    {
        try {
            int arr[] = new int[10];
            System.out.println(arr[12]);
        }
        catch(ArrayIndexOutOfBoundsException e){
               System.out.println(e);
            
        }
        System.out.println("rest of the code");
    }
}