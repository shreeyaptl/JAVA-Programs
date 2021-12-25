public static int getSmallest(int[] b, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (b[i] < b[j])   
                {  
                    temp = b[i];  
                    b[i] = b[j];  
                    b[j] = temp;  
                }  
            }  
        }  
       return b[0];  
}  
public static void main(String args[]){  
int b[]={1,20,5,64,3,2};  
System.out.println("Smallest: "+getSmallest(b,6));  
 
}} 