/* Consider two types of residency, a Flat or a Villa. All types of 
residences have an area (square yards) and a rate (per square 
yard). The property price of a residency is by default calculated 
as area * rate. In case of Flat, the price get incremented by the 
maintenance charges, and in case of Villa the price is 
incremented by furniture charges. Now define the following 
classes in a common package called “residence”. An abstract 
class called Residency, with appropriate methods and 
constructors. Two sub-classes called Flat and Villa, which 
inherit from the Residence class and override the appropriate 
methods, from Residency class.
*/




 interface residence                                 //interface class is fully abstract class
    {  
        
        void get_price();
    }
class flat implements residence                      //implement keyowrd to use interface class
    {     
        
         int total_price;
        public void get_price()                                  //public keyword to access function
         {                                                                
             int area = 8; int rate = 4 ; int  m_charges = 1000;
             int total_price = (area * rate ) + m_charges;
             System.out.println("total price of property : $"+ total_price);
         }
       
         
         
    }
    
class villa implements residence
    {
        int total_price;
        public void get_price()
         {   
             int area = 5; int rate = 6 ; int f_charges = 1000;
             int total_price = (area * rate) + f_charges;
             System.out.println("total price of property : $"+ total_price);
         }
         
    }
public class Main{
    
    public static void main(String args[])
    {
         
         flat f1 = new flat();
         f1.get_price();
         
         villa v1 = new villa();
         v1.get_price();
        
         
    }   
}
