import java.util.Scanner;
class FahrenheittoCelsius
{
    public static void main(String arg[])    {
        double a,c;
          Scanner sc=new Scanner(System.in);            
        System.out.println("Enter  Fahrenheit temperature");
          a=sc.nextDouble(); 
        System.out.println("Celsius temperature is = "+celsius(a));                         
    } 
    
    static double celsius(double f){    
        return  (f - 32)*100/(212-32);
    }
}
