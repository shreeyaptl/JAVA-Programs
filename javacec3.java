
class Simple_Interest {

 Simple_Interest(int p,int r, int t)
 {
	int simple_interest = p * r * t; 
    System.out.println("Simple interest is " + simple_interest);
 }
	
}
class Compound_interest{
	
	Compound_interest(double p,double r,double t)
	{
		double compound_interest = p * (Math.pow(1 + r / 100 ,  t));
       System.out.println("Compound interest is "+ compound_interest);
	}
	
	
}

public class Main {
    public static void main(String[] args){
	
	Simple_Interest s1 = new Simple_Interest(3000 , 7 , 5);
	Compound_interest c1 = new Compound_interest( 4000 ,8 ,4);
	 
    }


	

}