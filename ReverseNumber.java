/*
 * we can use this program to reverse a number or a string 
 * we can also reverse the sentences and words 
 * 
 */
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        String num=new String();
        System.out.println("Enter a number/sentance/word /characters : ");
        num=sc.nextLine();
        int length=num.length();
        
        int lenthDcre=length-1;
        char[] arr=new char[15];
        char ch;
        
        
        for(int i=0;i<length;i++)
        {
            ch=num.charAt(lenthDcre);
            arr[i]=ch;
            lenthDcre--;


        }
        System.out.print(num+ " revers is this ");
        System.out.println(arr);

    }
    
}
