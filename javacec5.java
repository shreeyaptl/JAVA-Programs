class celsius {
    celsius()
    {  float  Fahrenheit = 64;
       float Celsius = ((Fahrenheit-32)*5)/9; 
       System.out.println("Temperature in Celcius is " + Celsius);
    }
}

class fahrenheit {  
    fahrenheit()
    {   float Celsius = 35;
        float fahrenheit = (9/5)* Celsius + 32;
        System.out.println("Temperature in Fahrenheit is" + fahrenheit);
    }
    
}

class Main {
    public static void main(String[] args)
    {     
          celsius c1 = new celsius();
          fahrenheit f1 = new fahrenheit();
        
    }
}