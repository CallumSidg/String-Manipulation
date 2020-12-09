package string.manipulation;


 
public class StringManipulation {

    public static void main(String[] args) {
        EnterUsername();
        Username();
        EnterPassword();
        Password();
        Correct();
        //CharAt();
    }
    
    public static void Username(){
    String s1="Enter Username Here:";
    String s2;
        s2 = s1.toUpperCase();
        System.out.println(s2);
    }
public static void EnterUsername(){
 System.out.println("Please Enter your username");    
    
}
public static void EnterPassword(){
System.out.println("Please enter your password");
}
public  static void Password(){
String s3="Enter your Password Here:";
String s4=s3.toUpperCase();
System.out.println(s4);
}


public static void Correct(){
String s4;   
        s4 = "Pass";
        
if (s4.equals("Pass")){
System.out.println("Login Successful");

}else{
    System.out.println("You cannot Login");
}
//        public static void charAt(){
//        String firstName = "Clint";
//	String surname;
//        surname = "Eastwood";
//	char initial = firstName.charAt(0);
//
//        System.out.println("Hello, Mr " + initial + " "  + surname);
        
}}





















   
    
      
               



       
       
    

    
   


    
    
    
    
    
    
        
    
    
    
    
    
        
        
    

    

