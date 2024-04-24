import java.util.Scanner;   
public class SunOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a nuber : ");
        int a =sc.nextInt();
        int temp,sum;
        sum=0;
        while(a!=0)
        {
            temp=a%10;
            a=a/10;
            sum=sum+temp;
        }
        System.out.println("Digits sum = "+sum);
    }
    
}
