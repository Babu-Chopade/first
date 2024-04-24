import java.util.Scanner;
public class Factorall {
    public static void main(String[] args) {
        long fact=1l;
        System.out.println("enter which you want factorial ");
        Scanner obj = new Scanner(System.in);
        int num=obj.nextInt();

        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.println("factorial of "+num+" is : "+fact);
    }
    
}
