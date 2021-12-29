public class Main
{
	public static void main(String[] args) {
	    int[] number = new int[] {11,22,33,44,55,66,77,88,99};
	    System.out.println("Print int Array :");
	    for(int i= 0 ; i < number.length ; i++)
	    {
	        System.out.println("Values of index"+ i + ":" + number[i]);
	    }
	    
	    
	    String[] names = new String[] {"Java" , "Goal" , "Learning" , "Website" , "For" , "Java" , "Concepts"};
	    System.out.println("Print String Array:");
	    for(int i=0 ; i<names.length ; i++)
	    {
	        System.out.println("Values on index " + i + ":" + names[i]);
	    }
	}
}

