public class Main{  
public static int getLargest(int[] b, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (b[i] > b[j])   
                {  
                    temp = b[i];  
                    b[i] = b[j];  
                    b[j] = temp;  
                }  
            }  
        }  
       return b[total-1];  
}  
public static void main(String args[]){  
int b[]={1,2,5,6,3,2};  
System.out.println("Largest: "+getLargest(b,6));  
 
}}    