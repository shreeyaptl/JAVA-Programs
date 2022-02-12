class stringclass {
    public static void main(String[] args) {
        System.out.println("----STRING CLASS----"); 
        String s = " Lee min ho";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.startsWith("min",4)); // returns boolean value
        System.out.println(s.endsWith("o"));  
        System.out.println(s.charAt(6));  //prints character at specified index
        System.out.println(s.length());
        
        int a=10;
        String x = String.valueOf(a);
        System.out.println(x + 10);
        
        String r1 = "hello this is Alexa. Alexa is my name. Alexa is good at math";
        String newstring = r1.replace("Alexa","Siri");  //replace is used to replace                                               words or characters in a string.
        System.out.println(newstring);
        String Str = new String("This is Ariana Grande");
        System.out.println(Str.substring(4,14));  
        
        
    }
}