import java.util.Scanner;
public class BMI
{
    public static void main(String arg[])    {
        
        double a;
        
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter your BMI:");
        
        a = sc.nextDouble();
        
        if(a < 18.5){
            System.out.println("Your BMI is Underweight");
        }else if(a <= 18.5 || a <= 24.9){
            System.out.println("Your BMI is Healthy");
        }else if(a > 24.9){
            System.out.println("Your BMI is Overweight");
        }
        
        
    }
}
