class Triangle {
    Triangle(int base , int height)
    {    
       int  area = (base * height)/2;
        System.out.println("Area of Triangle is " + area );
        
    }
    
    
}
class Square {
    Square(int side)
    {
        int area = side * side;
         System.out.println("Area of Square is " + area );
    }
    
}
class Rectangle {
    Rectangle(int length , int breadth)
    {
        int area = length * breadth; 
        System.out.println("Area of Rectangle is "+ area );
    }
    
}
class Circle {
    Circle(int radius)
   {   
       double area = 3.14 * radius * radius ;
        System.out.println("Area of Circle is "+ area );
       
   }    
}

public class Main{
    public static void main(String[] args){
        Circle c1 = new Circle(5);
        Square s1 = new Square(4);
        Triangle t1 = new Triangle(4 , 6);
        Rectangle r1 = new Rectangle(6 ,4);
        
    }
}