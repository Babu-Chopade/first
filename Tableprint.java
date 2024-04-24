import java.util.Scanner;
public class Tableprint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");

        int no_of_table=sc.nextInt();
        System.out.println("table of "+no_of_table+"  is  ");
        for(int i =1;i<=10;i++)
        {
            if(no_of_table<=0)
            {
                if(no_of_table==0){
                    
                    System.out.println(no_of_table+" this number not table posible ");
                
                }
                else 
                {
                    System.out.println(no_of_table+" this is a negative number");
                    
                }
                break;
            }
                 System.out.println(no_of_table+"  X  "+i+"  =  "+no_of_table*i);


        
            
            


        }
    }
    
}
