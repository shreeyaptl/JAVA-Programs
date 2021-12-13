
class Square {
	int c;
 Square(int a)
 {
	int square = a*a; 
    System.out.println(square);
 }
	
}
class Cube {
	
	Cube(int b)
	{
		int cube = b * b * b;
       System.out.println(cube);
	}
	
	
}

public class Main {
    public static void main(String[] args){
	
	Cube c1 = new Cube(3);
	Square s1 = new Square(5);
    }


	

}