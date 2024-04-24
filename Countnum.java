import java.util.Scanner;
public class Countnum {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int count,sum,positiveCount,negativeCount;
        count=sum=positiveCount=negativeCount=0;
        System.out.println("Enter a number how mouch you want - ");
        int num;
        do
        { 
            System.out.println("==>");
            num=sc.nextInt();
            count++;
            sum+=num;
            if(num<0)
            {
                negativeCount++;
            }
            else{
                positiveCount++;
            }


        }while(num!=0);
        System.out.println(count+" This much time you enter a number");
        System.out.println("total you enter "+count+" in that positive Numbers are "+positiveCount);
        System.out.println("Total number  you entered  "+count+" in thant You entered negative numbers -"+negativeCount);
        System.out.println("Sum of all numbers you entered is -"+sum);

    }
}
