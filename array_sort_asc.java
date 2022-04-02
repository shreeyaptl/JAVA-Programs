//java program to sort array ion ascending order

class Main {
    public static void main(String args[])
    {
        int[] ar = new int[] {8,7,6,3};
        int temp = 0;
        for(int i = 0 ; i < ar.length ; i++)
        {   
            for(int j = i + 1 ; j <ar.length ; j++) 
        
            if(ar[i] > ar[j])
            {
                  temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            
            }

        
        }
       for(int i = 0 ; i < ar.length - 1 ; i++)
       {
           System.out.println(ar[i] + " ");
       }
       
    }
    
}
