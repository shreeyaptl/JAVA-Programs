class Add 
{
    Add(int a , int b)
    {
        int sum = a + b;
        System.out.println("Sum is "+ sum);
    }
}
class Sub 
{
    Sub(int a , int b)
    {
        int sub = a - b;
        System.out.println("Difference is "+ sub);
    }
}
class Mul 
{
    Mul(int a , int b)
    {
        int mul = a * b;
        System.out.println("Product is "+ mul);
    }
}
class Div
{
    Div(int a , int b)
    {
        int div = a / b;
        System.out.println("Division is "+ div);
    }
}


class Main {
    public static void main(String[] args)
    {     
          
        Add a1 = new Add(3,4);
        Sub s1 = new Sub(8,4);
        Mul m1 = new Mul(6,3);
        Div d1 = new Div(20,2);
    }
}